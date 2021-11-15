package lab4;

public class Category {
    private String name;
    private Product[] product = new Product[20];
    private int numberOfProducts = 0;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public Product getProduct(int index) {
        return product[index];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public void addProduct(Product product) {
        this.product[numberOfProducts] = product;
        numberOfProducts++;
    }
}
