package ro.myShop;

public class Accessory extends Product {
    private String collection;

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    @Override
    public String getDescription() {
        return String.valueOf(collection);
    }
}
