package lab4;

public class Product {
    private String name;
    private int quantity;
    private Category[] category;
    private int numberOfCategories;
    private int price;

    public Product(String name, int quantity, Category[] category, int numberOfCategories, int price) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.numberOfCategories = numberOfCategories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory(int index) {
        return category[index];
    }

    public int getNumberOfCategories() {
        return numberOfCategories;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(Category[] category) {
        this.category = category;
        this.numberOfCategories = category.length;
    }

    public void addCategory(Category category) {
        this.category[numberOfCategories] = category;
        numberOfCategories++;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printProduct() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Categories:");
        for (int i = 0; i < numberOfCategories; i++) {
            System.out.println("  " + category[i].getName());
        }
    }
}
