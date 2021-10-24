package com.company;

public class Product {
    public String productName;
    int quantity;
    public Category category;
    int price;

    public Product(String productName, int quantity, Category category, int price){
        this.productName = productName;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
    }
}
