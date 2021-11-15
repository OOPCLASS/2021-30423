package lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ShopService shopService = new ShopService();

        Path productsFile = Path.of("resources/products.txt");
        List<String> productsContent = Files.readAllLines(productsFile);

        for (String line : productsContent) {
            String[] lineWords = line.split(" ");
            String name = lineWords[0];

            int quantity = Integer.parseInt(lineWords[1]);
            int price = Integer.parseInt(lineWords[2]);
            int numberOfCategories = lineWords.length - 3;
            Category[] category = new Category[numberOfCategories];
            for (int i = 3; i < lineWords.length; i++) {
                category[i - 3] = shopService.findCategory(lineWords[i]);
            }

            Product product = new Product(name, quantity, category, numberOfCategories, price);
            shopService.addProduct(product);
        }

        shopService.printProductsFromCategory("c2");
        System.out.println();
        shopService.findProduct("p2").printProduct();
    }
}
