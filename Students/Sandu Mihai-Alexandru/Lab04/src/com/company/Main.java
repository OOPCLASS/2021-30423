package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader myFile = new FileReader();
        Category[] categories;
        Product[] products;
        categories = myFile.readCategories("C:\\Users\\mosh_\\Desktop\\cursuri\\anul2\\oop\\Labs\\Lab04\\categories.txt");
        products = myFile.readProducts("C:\\Users\\mosh_\\Desktop\\cursuri\\anul2\\oop\\Labs\\Lab04\\products.txt");
        ShopService myShop = new ShopService(categories,products);

        System.out.println("Categories");
        for (Category category : categories) {
            System.out.println(category.getName());
        }
        System.out.println();

        System.out.println("Products");
        for (Product product: products) {
            System.out.println(product.getName() + " " + product.getQuantity() + " " + product.getCategory().getName() + " " + product.getPrice());
        }
        System.out.println();

        myShop.showProductsFromCategory("Electronics");
        myShop.displayASpecificProduct("Blender");
    }
}
