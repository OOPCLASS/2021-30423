package com.company;


public class ShopService {

    Product[] products = new Product[10];
    int index = 0;

    public void addProduct(String name, int quantity, Category category, double price) {
        products[index] = new Product(name, quantity, category, price);
        index++;
    }

    @Override
    public String toString() {
        String toStr = "";

        for (Product product : products) {
            if (product != null) {
                toStr += product.toString();
                toStr += "\n";
            }
        }
        return toStr;
    }

    public void printByCategory(Category category) {
        for (Product product : products)
            if (product != null && product.category.equals(category))
                System.out.println(product);
    }

    public Product searchByName(String name) {
        Product prod = new Product(name, 1, null, 69);
        for (Product product : products) {
            if (prod.equals(product))
                return product;
        }
        return null;
    }
}
