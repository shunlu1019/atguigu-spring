package com.atguigu.spring.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * 纯注解方式配置spring， 包括数据库、事务、自动包扫描
 */
@Configuration
@ComponentScan(basePackages = {"com.atguigu.spring"})      //开启组件扫描
@EnableAspectJAutoProxy(proxyTargetClass=true)             //开启代理类
@EnableTransactionManagement
public class MyConfig {

    //获取数据源信息
    @Bean
    public DruidDataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/testdb");
        dataSource.setUsername("ynpos");
        dataSource.setPassword("ynpos");
        return dataSource;
    }

    //设置jdbcTemplate的数据源
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //设置数据源
        jdbcTemplate.setDataSource( dataSource);
        return jdbcTemplate;
    }

    //事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManger(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
