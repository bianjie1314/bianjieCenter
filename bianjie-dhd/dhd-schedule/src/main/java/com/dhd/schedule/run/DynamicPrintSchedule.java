package com.dhd.schedule.run;

import com.dhd.schedule.pojo.DhdScheduleCron;
import com.dhd.schedule.run.base.BaseSchedule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DynamicPrintSchedule implements BaseSchedule {


    private Logger logger = LoggerFactory.getLogger(getClass());
    private int i;

    @Override
    public void execute(DhdScheduleCron crmScheduledCron) {
        logger.info("thread id:{},DynamicPrintTask execute times:{}", Thread.currentThread().getId(), ++i);
    }

}