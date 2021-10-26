package com.company;

import Model.Category;
import Model.Product;
import Model.ShopService;

public class Main {

    public static void main(String[] args) {

        Category covid=new Category("covid");
        Category pillow=new Category("pillow");
        Category fruit=new Category("fruit");


        Product covidMask= new Product("covidMask",1000,covid,0.20);
        Product covidTest= new Product("covidTest",100,covid,15);
        Product covidVirus= new Product("covidVirus",100,covid,69);

        Product pillowMemory = new Product("pillowMemory", 123, pillow, 1);
        Product pillowHard = new Product("pillowHard", 123, pillow,2);
        Product pillowSoft = new Product("pillowSoft", 123, pillow, 3);

        Product fruitApple = new Product("fruitApple", 300, fruit, 700);
        Product fruitBanana = new Product("fruitBanana", 300, fruit, 90);
        Product fruitPeach = new Product("fruitPeach", 300, fruit, 1);

        Category[] arrayCategory = new Category[3];
        arrayCategory[0] = covid;
        arrayCategory[1] = pillow;
        arrayCategory[2] = fruit;

        Product[] arrayProduct = new Product[9];
        arrayProduct[0] = covidMask;
        arrayProduct[1] = covidTest;
        arrayProduct[2] = covidVirus;
        arrayProduct[3] = pillowMemory;
        arrayProduct[4] = pillowHard;
        arrayProduct[5] = pillowSoft;
        arrayProduct[6] = fruitApple;
        arrayProduct[7] = fruitBanana;
        arrayProduct[8] = fruitPeach;

        ShopService shopService = new ShopService(arrayCategory, arrayProduct);
        shopService.showProductsOfCategory(covid);
        shopService.searchProductByName("fruitApple");

    }
}
