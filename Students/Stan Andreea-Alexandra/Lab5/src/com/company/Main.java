package com.company;

import com.company.Book;
import com.company.Movie;
import com.company.Product;

public class Main {

    public static void main(String[] args) {

        //create products and add them to the array
        Book book = new Book();
        book.setTitle("Random book");
        book.setNumberOfPages(10);

        Author author=new Author("auhtor movie");
        double priceMovie=23.5;
        double priceToy=23.5;

        Movie first = new Movie();
        first.setTitle("Movie title");
        first.setRating(10.0);
        first.setLengthInMinutes(10);
        first.setAuthor(author);
        first.setPrice(priceMovie);
        first.setYear(2000);

        Movie second = new Movie();
        second.setTitle("Movie title");
        second.setRating(10.0);
        second.setLengthInMinutes(10);
        first.setAuthor(author);
        first.setPrice(priceMovie);
        first.setYear(2000);

        Phones phone = new Phones();
        phone.setTitle("Random Phone");
        phone.setMemoryCapacity(128);


        Toys toy =new Toys();
        toy.setTitle("Toy title");
        toy.setMinAge(2);
        toy.setType("Doll");
        Author author1=new Author("auhtor");
        toy.setAuthor(author1);
        toy.setPrice(15.0);





        /* show the products of a specific type from the array */
        Electronics electronic= new SmartTV();
        electronic.setTitle("Tv title");
        electronic.setGuaranty(5);

        System.out.println("The Entrtainment products are:");
        Product.getType(Product.ENTERTAINMENT);

        System.out.println("The Electronics products are:");
        Product.getType(Product.ELECTRONICS);

        System.out.println("The Toys products are:");
        Product.getType(Product.TOYS);

        System.out.println(" ");

        //overriden method:


        for (int i = 0; i < Product.nrOfProducts; i++) {

            System.out.println("The title of the products is "+ Product.products[i].getTitle());
            System.out.println("A charactheristic is: "+ Product.products[i].getDescription());
            System.out.println(" ");
        }

        System.out.println();

        System.out.println("About the toy:");

        //overloaded method
        int age=5;
        double price=67.8;
        System.out.println("Check if the age is appropriate:");
        toy.check(age);
        System.out.println("Check if we have enough money to buy it:");
        toy.check(price);


        //try out equals on different classes



        Toys toy1 =new Toys();
        toy1.setTitle("Toy title");
        toy1.setMinAge(2);
        toy1.setType("Doll");
        toy1.setAuthor(author1);
        toy1.setPrice(15.0);

        Toys toy2 =new Toys();
        toy2.setTitle("Toy title");
        toy2.setMinAge(2);
        toy2.setType("Robot");
        toy2.setAuthor(author1);
        toy2.setPrice(15.0);

        System.out.println("Toy and Toy1 are equal: "+toy.equals(toy1));
        System.out.println("Toy and Toy2 are equal: " +toy.equals(toy2));
        System.out.println("First and second movie are equal: "+first.equals(second));

        Book book1 = new Book();
        book1.setTitle("Random book");
        book1.setNumberOfPages(11);
        book1.setRating(10.0);
        book1.setYear(2000);

        System.out.println("First and second book are equal: "+book.equals(book1));

        System.out.println("Book1 and second movie are equal: "+book1.equals(second));



    }
}
