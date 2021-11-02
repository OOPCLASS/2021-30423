package com.company;


import com.company.model.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Create a hierarchy of products with some classes having
 * two levels of inheritance.
 * <p>
 * - create some products of different types and add
 * them to the same array
 * - create a method which returns the products of a
 * specific type from the list of all products
 * - implement some overriden & overloaded methods
 * - try out equals on different classes
 * - draw the UML diagram for your classes
 */
public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Random book");
        book.setNumberOfPages(10);

        Movie first = new Movie();
        first.setTitle("Movie title");
        first.setRating(10.0);
        first.setLengthInMinutes(10);

        Product second = new Movie();
        second.setTitle("Movie title");

        Car third = new Car(2001,200,"bad");
        System.out.println(Product.class.equals(book));


        System.out.println("---");
        System.out.println(first instanceof Movie);
        System.out.println(first instanceof Product);
        System.out.println(first instanceof Object);

        Product[] products = new Product[3];
        products[0] = book;
        products[1] = second;
        products[2] = new Car(2000, 100000, "Good");
        System.out.println("---");
        for (int i = 0; i < 2; i++) {
            Product product = products[i];
            System.out.println(product.getTitle());
            System.out.println(product.getDescription());
        }
        //System.out.println("SOS I'm dying!");
        System.out.println("---");

        Products allProd;
        allProd = new Products(products);
        Object[] prodPrint;
        prodPrint = allProd.getProductsOfType(products[2].getClass());
        Product[] prodOut = Arrays.copyOf(prodPrint, prodPrint.length, Product[].class);
        for (int i = 0; i < prodPrint.length; i++) {
            System.out.println(prodOut[i].getDescription());
        }
    }
}