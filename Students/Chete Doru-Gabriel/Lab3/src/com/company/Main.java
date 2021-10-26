package com.company;

public class Main {

    public static void main(String[] args) {
	    shopService theShop = new shopService();
        theShop.addCategory("juices");
        theShop.addProduct("Apple juice", 1, "juices", 5);
        theShop.addProduct("Grape juice", 1, "juices", 7);
        System.out.println(theShop.products[0].category.categoryName);
        System.out.println(theShop.products[1].category.categoryName);
        theShop.getAllProducts("juices");
        theShop.getProduct("Apple juice");
    }
}
