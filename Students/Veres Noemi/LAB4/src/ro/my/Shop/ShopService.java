package ro.my.Shop;

import java.util.Scanner;

public class ShopService {
    public Category[] categories = new Category[15];
    public Product[] products = new Product[50];

    public int noOfCategories = 0;
    public int noOfProducts = 0;

    public void addCategory(Category newCategory){
        categories[noOfCategories] = newCategory;
        noOfCategories++;
    }

    public void addProduct(Product newProduct){
        this.products[noOfProducts] = newProduct;
        noOfProducts++;
    }

    public void displayAllProductsFromCategory(){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter category name and ID: ");
        String categoryName = cin.next();
        int categoryID = Integer.parseInt(cin.next());
        Category givenCategory = new Category(categoryName,categoryID);

        if(findCategory(givenCategory)){
            System.out.println("The products from this category are: ");
            allProductsFromCategory(givenCategory);
        }else {
            System.out.println("This category is missing or category name doesn't match ID");
        }
    }
    public boolean findCategory(Category givenCategory) {
        int i = 0;
        while (i < noOfCategories) {
            if (givenCategory.name.equals(categories[i].name) && givenCategory.ID == categories[i].ID) {
                return true;
            }
            i++;
        }
        return false;
    }

    public void allProductsFromCategory(Category givenCategory){
        for (int i = 0; i < noOfProducts; i++){
            if (givenCategory.name.equals(products[i].category.name) && givenCategory.ID == products[i].category.ID){
                System.out.println(products[i].name + " " + products[i].size);
            }
        }
    }

    public boolean findProduct(String givenName){
        int i = 0;
        while(i < noOfProducts){
            if (givenName.equals(products[i].name)){
                return true;
            }
            i++;
        }
        return false;
    }

    public void displayProductDetails(String givenName){
        for (int i = 0; i < noOfProducts; i++){
            if (givenName.equals(products[i].name)){
                System.out.println("Size: " + products[i].size + " Price: " + products[i].price + " Quantity: "
                        + products[i].quantity);
            }
        }
    }

    public void searchProduct(){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String givenName = cin.next();
        if(findProduct(givenName)){
            System.out.println("Product Details");
            displayProductDetails(givenName);
        }else{
            System.out.println("Product not found");
        }
    }
}
