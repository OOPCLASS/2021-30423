package ro.my.Shop;

public class Product {
    public Category category;
    public String name;
    public double price;
    public String size;
    public int quantity;

    public Product(Category category, String name, double price, String size, int quantity){
        this.category = category;
        this.name = name;
        this.price = price;
        this.size = size;
        this.quantity = quantity;
    }

}
