package com.atguigu.spring.jdbc;

import java.util.List;

public interface BookDao {
    public int add(Book book);
    public int update(Book book);
    public int delete(Book book);
    public Book select(int id);
    public int countAll();
    public List<Book> selectBookList(Book book);

    public int[] batchAdd(List<Object[]> bookList);



}
