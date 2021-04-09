package com.dhd.schedule.run.base;

import com.dhd.common.utils.ScheduleStatusEnum;
import com.dhd.schedule.config.SpringUtils;
import com.dhd.schedule.pojo.DhdScheduleCron;
import com.dhd.schedule.service.DhdScheduleCronService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface BaseSchedule extends Runnable {

    Logger logger = LoggerFactory.getLogger(BaseSchedule.class);
    /**
     * 定时任务方法
     */
    void execute(DhdScheduleCron dhdScheduleCron);
    /**
     * 实现控制定时任务启用或禁用的功能
     */
    @Override
    default void run() {
        DhdScheduleCronService crmScheduledCronService = SpringUtils.getBean(DhdScheduleCronService.class);
        DhdScheduleCron crmScheduledCron = crmScheduledCronService.selectByCronKey(this.getClass().getName());
        if (ScheduleStatusEnum.DISABLED.getKey().equals(crmScheduledCron.getStatus())) {
            logger.error("{} 取消执行",crmScheduledCron.getCronKey());
            // 任务是禁用状态
            return;
        }
        execute(crmScheduledCron);
    }
}