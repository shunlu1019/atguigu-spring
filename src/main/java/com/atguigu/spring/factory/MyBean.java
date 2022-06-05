package com.atguigu.spring.factory;

public class MyBean {
    private String name;

    public MyBean() {
        System.out.println("无参构造方法执行");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set方法执行");
    }

    public void initMethord(){
        System.out.println("初始化方法执行");
    }

    public void destoryMethord(){
        System.out.println("销毁bean方法");
    }
}
