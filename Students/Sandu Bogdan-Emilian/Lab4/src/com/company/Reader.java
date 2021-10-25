package com.company;

import com.company.model.Category;
import com.company.model.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Reader {
    public Category[] readCategory(String input) {
        try {
            File myObj = new File(input);
            int nrCategs = 0;
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                myReader.nextLine();
                nrCategs++;
            }
            Category[] categs = new Category[nrCategs];
            myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                categs[i] = new Category(line);
                i++;
            }
            return categs;
        } catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
            return null;
        }
    }

    public Product[] readProducts(String input, Category[] categs) {
        try {
            File myObj = new File(input);
            int nrProducts = 0;
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                myReader.nextLine();
                nrProducts++;
            }
            Product[] products = new Product[nrProducts];
            myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] words = line.split(" ");
                Category categ = null;
                for (Category category : categs) {
                    if (Objects.equals(category.getName(), words[2]))
                        categ = new Category(words[2]);
                }
                products[i] = new Product(words[0], Integer.parseInt(words[1]), categ, Integer.parseInt(words[3]));
                i++;
            }
            return products;
        } catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
            return null;
        }
    }
}
