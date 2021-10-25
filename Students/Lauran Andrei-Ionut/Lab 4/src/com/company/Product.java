package com.company;

public class Product {
    public String name;
    public int quantity;
    public Category category;
    public double price;

    public Product(String name, int quantity, Category category, double price) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", category=" + category +
                ", price=" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Product product) {
            return product.name.equals(name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

