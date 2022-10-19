package com.example;

public class Product {
    private int id;
    private String name;
    private Double cost;

    public Product(int id, String name, Double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost + " $" +
                '}';
    }
}
