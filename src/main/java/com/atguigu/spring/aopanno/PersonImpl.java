package com.atguigu.spring.aopanno;

import org.springframework.stereotype.Repository;

import java.sql.PseudoColumnUsage;

@Repository
public class PersonImpl implements Person {
    @Override
    public void add() {
        System.out.println("Person add");
    }
}
