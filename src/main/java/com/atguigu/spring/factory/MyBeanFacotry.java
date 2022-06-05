package com.atguigu.spring.factory;

import org.springframework.beans.factory.FactoryBean;

public class MyBeanFacotry implements FactoryBean {
    private int id;

    public MyBeanFacotry(int id) {
        System.out.println("test");
        this.id = id;
    }

    @Override
    public Object getObject() throws Exception {
        Object obj = null;
        if (id == 1) {
            obj = new Bean1();
        } else
            obj = new Bean2();
        return obj;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
