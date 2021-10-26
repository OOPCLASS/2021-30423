public class Product {
    private String name;
    private int price;
    private Category category;

    public Category getCategory() {
        return category;
    }
    public String getName(){
        return name;
    }

    public Product(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
