package com.atguigu.spring.transaction.service;

import com.atguigu.spring.transaction.dao.JrnlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
@Service
public class TransferService {
    @Autowired
    private JrnlDao jrnlDao;

    public void transfer(){
        jrnlDao.transferOut("张三", 100);
        int i=0;
        int j = 100/i;
        jrnlDao.transferIn("李四", 100);
    }
}
