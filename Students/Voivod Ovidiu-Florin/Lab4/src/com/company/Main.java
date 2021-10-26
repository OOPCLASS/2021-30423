package com.company;

public class Main {

    public static void main(String[] args) {

        ShopService shop=new ShopService();
        shop.addCategory("fruits");
        shop.addProduct("apple",270,"fruits",2);
        shop.addProduct("strawberry",35,"fruits",3);
        shop.addProduct("pear",12,"fruits",5);
        shop.addCategory("alcohol");
        shop.addProduct("beer",40,"alcohol",7);
        shop.addProduct("wine",38,"alcohol",20);
        shop.getAllProducts("fruits");
        shop.getProduct("strawberry");
        shop.getProduct("wine");

        shop.getProduct("wine");
        shop.getAllProducts("alcohol");

    }
}
