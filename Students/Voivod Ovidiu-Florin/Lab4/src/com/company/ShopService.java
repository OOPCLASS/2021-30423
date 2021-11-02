package com.company;

public class ShopService {
    public Product[] products= new Product[10];
    public Category[] categories= new Category[10];
    public int numberOfCategories;
    public int numberOfProducts;

    public ShopService() {
        numberOfProducts=0;
        numberOfCategories=0;
    }

    public void addCategory(String categoryName){
        categories[numberOfCategories]=new Category(categoryName);
        numberOfCategories++;
    }

    public Category getCategoryName(String categoryName){
        int i;
        for(i = 0; i<numberOfCategories; i++){
            if(categories[i].categoryName.equals(categoryName)){
                return categories[i];
            }
        }
        return null;
    }
    public void addProduct(String productName, int quantity, String categoryName, int price ){
        products[numberOfProducts]= new Product(productName, quantity, getCategoryName(categoryName), price);
        numberOfProducts++;
    }
    public void getAllProducts(String categoryName){
        int i;
        System.out.println("Products available from "+ categoryName+ " category:");
        for(i=0;i<numberOfProducts;i++){
            if(products[i].category.categoryName.equals(categoryName)){
                System.out.println(products[i].productName);
            }
        }
    }

    public void getProduct(String productName){
        int i;
        for(i=0;i<numberOfProducts;i++){
            if(products[i].productName.equals(productName)){
                System.out.println("Product Name:"+products[i].productName);
                System.out.println("Price:"+products[i].price);
                System.out.println("Quantity:"+products[i].quantity);
            }
        }
    }





}
