package com.company.model;

public class ProductService {
    private Product[] products;

    public ProductService(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] productsOfSpecificType(String typeOfProduct) {
        int nrOfProducts = 0;
        String correctString;
        correctString = "class com.company.model." + typeOfProduct;
        for (Product product : products) {
            if (product.getClass().toString().equals(correctString)) {
                nrOfProducts++;
            }
        }

        Product[] specificProducts = new Product[nrOfProducts];
        int contor = 0;
        for (Product product : products) {
            if (product.getClass().toString().equals(correctString)) {
                specificProducts[contor] = product;
                contor++;
            }
        }
        return specificProducts;
    }

    public void printProducts() {
        for (Product product: products) {
            System.out.println(product.getTitle());
        }
        System.out.println();
    }

    public void printProducts(String typeOfProducts) {
        String correctString;
        correctString = "class com.company.model." + typeOfProducts;
        for (Product product: products) {
            if (product.getClass().toString().equals(correctString)) {
                System.out.println(product.getTitle());
            }
        }
        System.out.println();
    }
}
