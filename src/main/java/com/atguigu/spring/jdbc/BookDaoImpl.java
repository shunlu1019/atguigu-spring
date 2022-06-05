package com.atguigu.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Book book) {
        Object[] obj = {book.getId(),book.getName(),book.getStat()};
        String sql = "insert into t_book values(?, ?, ? )";
        int rec = jdbcTemplate.update(sql, obj);
        return rec;
    }

    @Override
    public int update(Book book) {
        Object[] obj = {book.getName(),book.getStat(),book.getId()};
        String sql = "update t_book set name =?, stat=? where id=?";
        int rec = jdbcTemplate.update(sql, obj);
        return rec;
    }

    @Override
    public int delete(Book book) {
        Object[] obj = {book.getId()};
        String sql = "delete from t_book where id=?";
        int rec = jdbcTemplate.update(sql, obj);
        return rec;
    }

    @Override
    public Book select(int id) {
        String sql = "select * from t_book where id=?";
        Object[] obj = {id};
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), obj);
        return book;
    }

    @Override
    public int countAll() {
        String sql = "select count(1) from t_book";

        return jdbcTemplate.queryForObject(sql, Integer.TYPE);
    }

    @Override
    public List<Book> selectBookList(Book book) {
        String sql = "select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public int[] batchAdd(List<Object[]> bookList) {
        String sql="insert into t_book values(?,?,?)";
        jdbcTemplate.batchUpdate(sql,bookList);
        return new int[0];
    }
}
