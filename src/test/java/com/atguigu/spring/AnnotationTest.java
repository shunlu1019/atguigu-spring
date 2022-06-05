package com.atguigu.spring;

import com.atguigu.spring.annotation.service.OrderService;
import com.atguigu.spring.annotation.service.OrderServiceImpl;
import com.atguigu.spring.config.MyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationBean.xml");
        OrderService orderService = context.getBean("orderServiceImpl", OrderServiceImpl.class);
        orderService.orderAdd();
    }
    /**
     * 纯注解方式
     */

    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        OrderService orderService = context.getBean("orderServiceImpl", OrderServiceImpl.class);
        orderService.orderAdd();
    }
}
