package com.company;

import com.company.model.*;

/**
 * Create a hierarchy of products with some classes having
 * two levels of inheritance.
 *
 * - create some products of different types and add
 *   them to the same array
 * - create a method which returns the products of a
 *   specific type from the list of all products
 * - implement some overriden & overloaded methods
 * - try out equals on different classes
 * - draw the UML diagram for your classes
 */

public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setLengthInMinutes(120);
        movie.setRating(90.0);
        movie.setTitle("Hai hai");

        Movie first = new Movie();
        first.setTitle("Avatar");
        first.setRating(100.0);
        first.setLengthInMinutes(140);

        Product second = new Book();
        second.setTitle("Lord of the rings");

        Music music = new Music("Rock", new String[]{"Alan", "Bob"});
        music.setTitle("Nevastuica Rock");

        Processor processor = new Processor(4.2, 8, "1234", 7);
        processor.setTitle("my little processor");
        processor.setTypeOf("processor");
        processor.setWhatFor("PC");

        Product component = new Component("PC", "processor");
        component.setTitle("Ryzen processor");


        Product[] products = new Product[6];
        products[0] = movie;
        products[1] = first;
        products[2] = second;
        products[3] = music;
        products[4] = processor;
        products[5] = component;

//        for(int i = 0; i < 2; i++) {
//            Product product = products[i];
//            System.out.println(product.getTitle());
//            System.out.println(product.getDescription());
//        }

        ProductService service = new ProductService(products);
        Product[] test =  service.productsOfSpecificType("Movie");
        for (Product product : test) {
            System.out.println(product.getTitle());
        }
        System.out.println();

        service.printProducts();
        System.out.println("the overloaded version");
        service.printProducts("Book");
    }
}
