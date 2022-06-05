package com.atguigu.spring;

import com.atguigu.spring.jdbc.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTempletTest {

    @Test
    public void test(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("database.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
//        bookService.addBook();
        bookService.updateBook();
        bookService.countAllBook();
        bookService.selectBook();
        System.out.println("查询所有book：");
        bookService.selectAll();
        bookService.batchAdd();
        bookService.selectAll();

    }
}
