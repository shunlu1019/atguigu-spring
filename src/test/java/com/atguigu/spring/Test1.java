package com.atguigu.spring;

import com.atguigu.spring.bean.Emp;
import com.atguigu.spring.collectiontype.Book;
import com.atguigu.spring.collectiontype.Stu;
import com.atguigu.spring.dao.Order;
import com.atguigu.spring.dao.UserDaoImpl;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Test1 {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("-----------------------");
        UserDaoImpl userDaoImpl = context.getBean("userDaoImpl", UserDaoImpl.class);
        userDaoImpl.add();

        Order order = context.getBean("order", Order.class);
        System.out.println(order.toString());
        System.out.println("-----------------------");

        UserService userService = context.getBean("userService", UserService.class);
        userService.test();
        System.out.println("-----------------------");

        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);

        Book book = context.getBean("book", Book.class);
        System.out.println(book);

    }

    @Test
    public void test1(){
        File path = new File(".");
        String [] list = path.list();
        System.out.println(Arrays.toString(list));

        String[] flist = path.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith("xml"))
                    return true;
                else
                    return false;
            }
        });
        System.out.println(Arrays.toString(flist));

        File f = new File("pom.xml");
        if(f.exists()){
            System.out.println("true");
        }
    }



}
