package com.atguigu.spring.service;

import com.atguigu.spring.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void test(){
        userDao.add();
    }
}
