package com.company;

public class shopService {
    public Category[] categories = new Category[10];
    public Product[] products = new Product[10];
    public int numberOfCategories;
    public int numberOfProducts;

    public shopService()
    {
        numberOfCategories = 0;
        numberOfProducts = 0;
    }
    public void addCategory(String categoryName){
        categories[numberOfCategories] = new Category(categoryName);
        numberOfCategories ++;
    }
    public Category getCategory(String categoryName)
    {
        for(int i = 0; i < numberOfCategories; i ++) {
            if(categories[i].categoryName.equals(categoryName)) {
                return categories[i];
            }
        }
        return null;
    }
    public void addProduct(String productName, int quantity, String categoryName, int price){
        products[numberOfProducts] = new Product(productName, quantity, getCategory(categoryName), price);
        numberOfProducts ++;
    }
    public void getAllProducts(String categoryName){
        for(int i = 0; i < numberOfProducts; i ++) {
            if(products[i].category.categoryName.equals(categoryName)) {
                System.out.println(products[i].productName);
            }
        }
    }
    public void getProduct(String productName){
        for(int i = 0; i < numberOfProducts; i ++) {
            if(products[i].productName.equals(productName)) {
                System.out.println(products[i].productName);
                System.out.println(products[i].price);
            }
        }
    }
}