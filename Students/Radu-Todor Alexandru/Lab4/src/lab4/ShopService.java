package lab4;

import java.util.Objects;

public class ShopService {
    private Category[] category = new Category[10];
    private Product[] product = new Product[20];
    private int numberOfCategories = 0;
    private int numberOfProducts = 0;

    public int getNumberOfCategories() {
        return numberOfCategories;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void addCategory(String name) {
        category[numberOfCategories] = new Category(name);
        numberOfCategories++;
    }

    public Category findCategory(String name) {
        for (int i = 0; i < numberOfCategories; i++) {
            if (Objects.equals(name, category[i].getName())) {
                return category[i];
            }
        }
        addCategory(name);
        return category[numberOfCategories - 1];
    }

    public void addProduct(Product product) {
        this.product[numberOfProducts] = product;
        for (int i = 0; i < product.getNumberOfCategories(); i++) {
            findCategory(product.getCategory(i).getName()).addProduct(product);
        }
        numberOfProducts++;
    }

    public Product findProduct(String name) {
        for (int i = 0; i <numberOfProducts; i++) {
            if (Objects.equals(name, product[i].getName())) {
                return product[i];
            }
        }
        return product[numberOfProducts - 1]; // the program never reaches this return
    }

    public void printProductsFromCategory(String category) {
        Category auxiliaryCategory = findCategory(category);
        for (int i = 0; i < auxiliaryCategory.getNumberOfProducts(); i++) {
            System.out.print(auxiliaryCategory.getProduct(i).getName() + " ");
        }
    }

    public void printCategoriesFromProduct(String product) {
        Product auxiliaryProduct = findProduct(product);
        for (int i = 0; i < auxiliaryProduct.getNumberOfCategories(); i++) {
            System.out.print(auxiliaryProduct.getCategory(i).getName() + " ");
        }
    }
}
