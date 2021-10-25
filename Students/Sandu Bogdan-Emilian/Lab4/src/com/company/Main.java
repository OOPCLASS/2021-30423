package com.company;

import com.company.model.Product;
import com.company.model.Category;
import com.company.model.ShopService;
import com.company.Reader;

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
//        Product[] products = new Product[10];
//        Category[] categs = new Category[3];
//        products[0] = new Product("banana",5, categs[0],2);
        Category[] categs;
        Reader fileReader = new Reader();
        categs = fileReader.readCategory("C:\\Users\\sandu\\OOP_Labs\\Lab4\\categs.txt");
        for (Category category : categs) {
            System.out.println(category.getName());
        }
        System.out.println("---");
        Product[] products;
        products = fileReader.readProducts("C:\\Users\\sandu\\OOP_Labs\\Lab4\\products.txt", categs);
        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getPrice() + " " + product.getQuantity());
        }
        ShopService service = new ShopService(categs, products);
        System.out.println();
        service.displayProductsFromCategory(categs[0]);
        service.searchProduct("Banana");
    }
}












