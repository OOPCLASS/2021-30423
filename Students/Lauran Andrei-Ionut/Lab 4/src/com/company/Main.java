package com.company;

/**
 * Shop having categories and products
 * <p>
 * category:
 * - name
 * product:
 * - name
 * - quantity
 * - category
 * - price
 * <p>
 * shopService:
 * // hold 2 arrays for categs & products
 * // display all the products from a specific category
 * // search a product by name
 * <p>
 * draw the UML diagrams for each of your classes
 */

public class Main {

    public static void main(String[] args) {
        ShopService shop = new ShopService();
        Category[] categories = new Category[100];
        categories[0] = new Category("Phone");
        categories[1] = new Category("Fruits");
        System.out.println("Products:");
        shop.addProduct("Apple",100,categories[1], 2);
        shop.addProduct("iPhone",25,categories[0],1000);
        shop.printByCategory(categories[0]);
        Product prod = shop.searchByName("Samsung");
        System.out.println(prod);
        Product prod2 = shop.searchByName("iPhone");
        System.out.println(prod2);
    }
}

