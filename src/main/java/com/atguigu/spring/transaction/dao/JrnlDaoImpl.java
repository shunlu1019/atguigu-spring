package com.atguigu.spring.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JrnlDaoImpl implements JrnlDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int transferOut(String name, double bal) {
        String sql = "update jrnl set bal=bal-? where name = ?";
        Object[] obj = {bal, name};
        int ret = jdbcTemplate.update(sql, obj);
        return ret;

    }

    @Override
    public int transferIn(String name, double bal) {
        String sql = "update jrnl set bal=bal+? where name = ?";
        Object[] obj = {bal, name};
        int ret = jdbcTemplate.update(sql, obj);
        return ret;
    }
}
