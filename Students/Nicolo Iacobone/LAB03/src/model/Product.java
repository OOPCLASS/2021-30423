package Model;

public class Product {

    private String name;
    private int quantity;
    private Category category;
    private double price;

    public Product(){
        System.out.println("I'm an empty product");
    }

    public Product(String name,int quantity,Category category,double price){
        this.name=name;
        this.quantity=quantity;
        this.category=category;
        this.price=price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
