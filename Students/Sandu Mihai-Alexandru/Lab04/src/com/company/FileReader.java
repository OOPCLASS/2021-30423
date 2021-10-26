package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

    public Category[] readCategories(String fileName) throws IOException {
        BufferedReader categoryReader = new BufferedReader(new java.io.FileReader(fileName));
        Category[] categories = new Category[(int) categoryReader.lines().count()];
        Scanner scannerCategories = new Scanner(new File(fileName));

        String line;
        int count = 0;
        while (scannerCategories.hasNextLine()) {
            line = scannerCategories.nextLine();
            categories[count] = new Category(line);
            count++;
        }
        return categories;
    }

    public Product[] readProducts(String fileName) throws FileNotFoundException {
        BufferedReader productReader = new BufferedReader(new java.io.FileReader(fileName));
        Product[] products = new Product[(int) productReader.lines().count()];
        Scanner scannerProducts = new Scanner(new File(fileName));

        String line;
        int count = 0;
        while (scannerProducts.hasNextLine()) {
            String productName;
            int productQuantity;
            Category productCategory;
            int productPrice;
            line = scannerProducts.nextLine();
            String[] words = line.split(" ");
            productName = words[0];
            productQuantity = Integer.parseInt(words[1]);
            productCategory = new Category(words[2]);
            productPrice = Integer.parseInt(words[3]);
            products[count] = new Product(productName, productQuantity, productCategory, productPrice);
            count++;
        }
        return products;
    }
}
