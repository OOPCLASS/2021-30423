package com.company;

import java.util.Objects;

public class ShopService {
    private Category[] categories;
    private Product[] products;


    public ShopService(Category[] categories, Product[] products) {
        this.categories = categories;
        this.products = products;
    }

    public void showProductsFromCategory(String category) {
        for (int i = 0; i < products.length; i++) {
            if (Objects.equals(products[i].getCategory().getName(), category)) {
                System.out.println(products[i].getName());
            }
        }
    }

    public void displayASpecificProduct(String productName) {
        Product productToBeFound = null;
        for (Product product : products) {
            if (Objects.equals(product.getName(), productName)) {
                productToBeFound = product;
            }
        }
        if (productToBeFound == null) {
            System.out.println("product doesn't exist");
            return;
        }
        System.out.println(productToBeFound.getName() + " " + productToBeFound.getQuantity() + " " + productToBeFound.getCategory().getName() + " " + productToBeFound.getPrice());
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
