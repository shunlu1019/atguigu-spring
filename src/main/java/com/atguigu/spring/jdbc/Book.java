package com.atguigu.spring.jdbc;

public class Book {
    private int id;
    private String name;
    private String stat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public Book() {
    }

    public Book(int id, String name, String stat) {
        this.id = id;
        this.name = name;
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stat='" + stat + '\'' +
                '}';
    }
}
