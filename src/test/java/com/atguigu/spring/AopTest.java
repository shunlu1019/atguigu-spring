package com.atguigu.spring;

import com.atguigu.spring.aopanno.PersonImpl;
import com.atguigu.spring.config.MyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        PersonImpl persomImpl = context.getBean("personImpl", PersonImpl.class);
        persomImpl.add();
    }
}
