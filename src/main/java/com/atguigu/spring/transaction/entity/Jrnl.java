package com.atguigu.spring.transaction.entity;

public class Jrnl {
    private int id;
    private String name;
    private double bal;
    private String rmrk;

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

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public String getRmrk() {
        return rmrk;
    }

    public void setRmrk(String rmrk) {
        this.rmrk = rmrk;
    }

    @Override
    public String toString() {
        return "Jrnl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bal=" + bal +
                ", rmrk='" + rmrk + '\'' +
                '}';
    }
}
