package ro.utcluj;

public class Newspaper extends Product {
    public int numberOfEdition;

    public Newspaper(String name, int quantity, double price, int numberOfEdition) {
        super(name, quantity, price);
        this.numberOfEdition = numberOfEdition;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "numberOfEdition=" + numberOfEdition +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public int getNumberOfEdition() {
        return numberOfEdition;
    }

    public void setNumberOfEdition(int numberOfEdition) {
        this.numberOfEdition = numberOfEdition;
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }
}
