package com.atguigu.spring.annotation.service;

import com.atguigu.spring.annotation.dao.Jrnl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired  //按照类型注入
    @Qualifier("jrnlImpl1") //按照名称注入,当有多个同类型的时候Autowired不知道用哪个，此时结合Qualifier一块使用
//    @Resource   //名称和属性都可以注入，不建议使用
    private Jrnl jrnl;
    @Override
    public void orderAdd() {
        System.out.println("OrderServiceImpl add order");
        jrnl.insert();
    }
}
