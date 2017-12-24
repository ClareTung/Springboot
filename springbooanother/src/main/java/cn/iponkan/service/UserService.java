package cn.iponkan.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Async
    public void sedSms() {
        System.out.println("##sedSms##开始执行..  2");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("i:" + i);
        }
        System.out.println("##sedSms##结束执行..  3");
    }
}
