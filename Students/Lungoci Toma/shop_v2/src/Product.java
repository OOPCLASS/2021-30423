public class Product {
    private String name;
    private int price;
    private String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category=category;
    }
    public Product(){
        this.name="default";
        this.price=0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        System.out.println("getprice in the product class");
        return price;
    }
    public String getCategory(){
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
