package com.atguigu.spring.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String [] score;
    private List<String> list;
    private Map<String, String> map;

    private Set<String> set;
    private List<Book> bookList;

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setScore(String[] score) {
        this.score = score;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }


    @Override
    public String toString() {
        return "Stu{" +
                "score=" + Arrays.toString(score) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", bookList=" + bookList +
                '}';
    }
}
