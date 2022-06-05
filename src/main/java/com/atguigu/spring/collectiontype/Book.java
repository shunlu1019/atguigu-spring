package com.atguigu.spring.collectiontype;

import java.util.List;

public class Book {
    private String bookName;

    private List<String> bookList;

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
