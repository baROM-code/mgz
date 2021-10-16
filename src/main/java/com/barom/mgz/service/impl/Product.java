package com.barom.mgz.service.impl;

public class Product {
    private int id;
    private String title;
    private double cost;

    public Product(int id, String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Product(int id) {
        this.id = id;
        this.title = "Product " + id;
        this.cost = Math.random() * 100;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "id=" + id + ", title='" + title + '\'' + ", cost=" + cost;
    }
}
