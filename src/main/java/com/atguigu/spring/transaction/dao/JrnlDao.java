package com.atguigu.spring.transaction.dao;

public interface JrnlDao {
    public int transferOut(String name, double amt);
    public int transferIn(String name, double amt);

}
