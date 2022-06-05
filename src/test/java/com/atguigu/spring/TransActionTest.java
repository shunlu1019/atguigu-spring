package com.atguigu.spring;

import com.atguigu.spring.config.MyConfig;
import com.atguigu.spring.transaction.service.TransferService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class TransActionTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        TransferService transferService = context.getBean("transferService", TransferService.class);
        transferService.transfer();
    }


}
