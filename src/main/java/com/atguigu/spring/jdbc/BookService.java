package com.atguigu.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void addBook() {
        Book book = new Book(2, "Java", "1");
        int ret = bookDao.add(book);
        System.out.println(ret);
    }

    public void updateBook() {
        Book book = new Book(1, "C++", "1");
        int ret = bookDao.update(book);
        System.out.println(ret);
    }

    public int countAllBook() {
        int ret = bookDao.countAll();
        System.out.println("数据库总记录数:" + ret);
        return ret;
    }

    public void selectBook() {
        Book book = bookDao.select(1);
        System.out.println(book);
    }

    public void selectAll() {
        List<Book> books = bookDao.selectBookList(null);
        System.out.println(books);
    }

    public void batchAdd() {

//        Book book1 = new Book(10,"Python", "1");
//        Book book2 = new Book(11,"JavaScript", "1");
//        Book book3= new Book(12,"Shell", "1");
        Object[] o1 = {10, "Python", "1"};
        Object[] o2 = {11, "JavaScript", "1"};
        Object[] o3 = {12, "Shell", "1"};
        ArrayList<Object[]> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        bookDao.batchAdd(list);

    }
}
