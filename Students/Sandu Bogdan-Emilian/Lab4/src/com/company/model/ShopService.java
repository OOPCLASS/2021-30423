package com.company.model;

import com.company.model.Category;
import com.company.model.Product;

import java.util.Objects;


/* * shopService:
 * // hold 2 arrays for categs & products
 * // display all the products from a specific category
 * // search a product by name
 **/


public class ShopService {
    private Category[] categs;
    private Product[] products;


    public ShopService(Category[] categs, Product[] products) {
        this.categs = new Category[categs.length];
        this.products = new Product[products.length];
        System.arraycopy(categs, 0, this.categs, 0, categs.length);
        System.arraycopy(products, 0, this.products, 0, products.length);
    }

    public void displayProductsFromCategory(Category category) {

        for (Product product : products) {
            if (Objects.equals(category.getName(), product.category.getName())) {
                //aici daca foloseam Objects.equals(category, product.category) nu dadea niciodata true
                System.out.println(product.name);
            }
        }
    }

    public void searchProduct(String searchedProduct) {
        int ok = 0;
        Product interProd = null;
        for (Product product : products) {
            if (Objects.equals(searchedProduct, product.name)) {
                if (product.quantity == 0) {
                    ok = 0;
                    interProd = product;
                } else {
                    ok = 1;
                    interProd = product;
                }
            } else {
                ok = -1;

            }
        }
        if (ok == -1)
            System.out.println("Product not found ");
        else if (ok == 0)
            System.out.println("Product with name " + interProd.name + " not in stock");
        else
            System.out.println("Product with name " + interProd.name + " found: " + interProd.quantity + " items");
    }
}
