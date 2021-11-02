package com.company.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Products {
    Product[] products;

    public Products(Product[] products) {
        this.products = products;
    }

    public Product[] getProductsOfType(Class c){

        ArrayList<Product> productsOut = new ArrayList<Product>();
        for (Product product : products) {
            if (c.isInstance(product)) {
                productsOut.add(product);
            }
        }
        Object[] prods = productsOut.toArray();
        Product[] prodOut = Arrays.copyOf(prods, prods.length, Product[].class);
        return prodOut;
    }
}
