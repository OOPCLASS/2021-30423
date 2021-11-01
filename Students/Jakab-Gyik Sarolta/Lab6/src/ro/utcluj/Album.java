package ro.utcluj;

public class Album extends Product {
    public String artist;
    public int year;

    public Album (String name, int quantity, double price, String artist, int year) {
        super(name, quantity, price);
        this.artist = artist;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Album{" +
                "artist='" + artist + '\'' +
                ", year=" + year +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
