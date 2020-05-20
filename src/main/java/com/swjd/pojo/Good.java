package com.swjd.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Good {
    private int id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private double price;
    private String name;

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", date=" + date +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
