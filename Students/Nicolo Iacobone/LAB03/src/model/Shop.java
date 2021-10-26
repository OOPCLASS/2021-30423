package Model;

public class Shop {

    private Category category;
    private Product product;


    public Shop(){
        System.out.println("I'm an empty shop");
    }

    public Shop(Category category, Product product){
        this.category=category;
        this.product=product;
    }

    public Category getCategory() {
        return category;
    }

    public Product getProduct() {
        return product;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
