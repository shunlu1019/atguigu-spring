package com.atguigu.spring.annotation.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("jrnlImpl1")
public class JrnlImpl implements Jrnl{
    @Override
    public void insert() {
        System.out.println("JrnlImpls insert");
    }
}
