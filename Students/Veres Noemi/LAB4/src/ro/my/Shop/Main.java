package ro.my.Shop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        ShopService myShop = new ShopService();

        Path fileCategories = Path.of("C:\\Users\\veres\\IdeaProjects\\LAB4\\src\\ro\\my\\Shop\\categories");
        List<String> categoriesContent = Files.readAllLines(fileCategories);
        Path fileProducts = Path.of("C:\\Users\\veres\\IdeaProjects\\LAB4\\src\\ro\\my\\Shop\\products");
        List<String> productsContent = Files.readAllLines(fileProducts);

        for (String line : categoriesContent) {
            String[] lineWords = line.split(" ");
            String name = lineWords[0];
            int ID = Integer.parseInt(lineWords[1]);
            Category newCategory = new Category(name,ID);
            //System.out.println(newCategory.name + " " + newCategory.ID);
            myShop.addCategory(newCategory);
        }

        for (String line : productsContent){
            String[] lineWords = line.split(" ");
            String catName = lineWords[0];
            int ID = Integer.parseInt(lineWords[1]);
            Category category = new Category(catName,ID);
            String name = lineWords[2];
            double price = Double.parseDouble(lineWords[3]);
            String size = lineWords[4];
            int quantity = Integer.parseInt(lineWords[5]);
            Product newProduct = new Product(category,name,price,size,quantity);
            myShop.addProduct(newProduct);
        }

        myShop.displayAllProductsFromCategory();
        myShop.searchProduct();
    }

}
