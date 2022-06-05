package com.atguigu.spring;

import com.atguigu.spring.factory.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Object myBeanFactory = context.getBean("myBeanFactory");
        System.out.println(myBeanFactory);
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println("获取到了bean");
        System.out.println(myBean);
        
        context.close();
    }
}
