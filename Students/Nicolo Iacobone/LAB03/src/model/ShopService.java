package Model;

public class ShopService {

    private Category[] arrayOfCategories;
    private Product[] arrayOfProducts;

    public ShopService(){
        System.out.println("I'm an empty ShopService");
    }

    public ShopService(Category[] arrayOfCategories,Product[] arrayOfProducts){
        this.arrayOfCategories=arrayOfCategories;
        this.arrayOfProducts=arrayOfProducts;
    }

    public Category[] getArrayOfCategories() {
        return arrayOfCategories;
    }

    public Product[] getArrayOfProducts() {
        return arrayOfProducts;
    }

    public void setArrayOfCategories(Category[] arrayOfCategories) {
        this.arrayOfCategories = arrayOfCategories;
    }

    public void setArrayOfProducts(Product[] arrayOfProducts) {
        this.arrayOfProducts = arrayOfProducts;
    }

    public void showProductsOfCategory(Category category){
        int temp=0;
        for (Category arrayOfCategory : this.arrayOfCategories) {
            if (arrayOfCategory == category) {
                temp = 69;
            }
        }
        if (temp==69){
            for(Product arrayOfProduct : this.arrayOfProducts) {
                if(arrayOfProduct.getCategory()==category){
                    System.out.println(arrayOfProduct.getName());
                }
            }
        } else {
            System.out.println("Category not found");
        }
    }

    public void searchProductByName(String productName){
        int temp=0;
        for(Product arrayOfProduct : this.arrayOfProducts) {
            if(arrayOfProduct.getName()==productName){
                System.out.println(("Here is your product:\n/Name: ")+arrayOfProduct.getName()+("\t/Quantity: ")+arrayOfProduct.getQuantity()+("\t/Category: ")+arrayOfProduct.getCategory().getName()+("\t/Price ")+arrayOfProduct.getPrice());
                temp=69;
            }
        }
        if(temp==0){
            System.out.println("Sorry, we couldn't find your product.");
        }
    }

}

