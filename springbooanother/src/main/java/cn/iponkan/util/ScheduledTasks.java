package cn.iponkan.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Scheduled(fixedRate = 1000)
    public void add() {
        System.out.println("我正在执行.."+System.currentTimeMillis());
    }

}
