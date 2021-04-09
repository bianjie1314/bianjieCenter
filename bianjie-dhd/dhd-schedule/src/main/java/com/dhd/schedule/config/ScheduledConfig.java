package com.dhd.schedule.config;

import com.dhd.schedule.pojo.DhdScheduleCron;
import com.dhd.schedule.run.base.BaseSchedule;
import com.dhd.schedule.service.DhdScheduleCronService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Configuration
public class ScheduledConfig implements SchedulingConfigurer {

    @Autowired
    private ApplicationContext context;
    @Autowired
    private DhdScheduleCronService dhdScheduleCronService;

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {

        List<DhdScheduleCron> dhdScheduleCronList = dhdScheduleCronService.selectByMap(new HashMap());
        for (DhdScheduleCron dhdScheduleCron : dhdScheduleCronList) {
            Class<?> clazz;
            Object task;
            try {
                clazz = Class.forName(dhdScheduleCron.getCronKey());
                task = context.getBean(clazz);
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException("crm_scheduled_cron表数据" + dhdScheduleCron.getCronKey() + "有误", e);
            } catch (BeansException e) {
                throw new IllegalArgumentException(dhdScheduleCron.getCronKey() + "未纳入到spring管理", e);
            }
            Assert.isAssignable(BaseSchedule.class, task.getClass(), "定时任务类必须实现ScheduledOfTask接口");
            // 可以通过改变数据库数据进而实现动态改变执行周期
            taskRegistrar.addTriggerTask(((Runnable) task),
                    triggerContext -> {
                        String cronExpression = dhdScheduleCronService.selectByCronKey(dhdScheduleCron.getCronKey()).getCronExpression();
                        return new CronTrigger(cronExpression).nextExecutionTime(triggerContext);
                    }
            );
        }
    }
    @Bean
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(10);
    }
}