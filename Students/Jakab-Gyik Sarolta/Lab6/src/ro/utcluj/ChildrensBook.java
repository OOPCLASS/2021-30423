package ro.utcluj;

public class ChildrensBook extends Book {
    public int forChildrenAbove;

    public ChildrensBook(String name, int quantity, double price, String author, int forChildrenAbove) {
        super(name, quantity, price, author);
        this.forChildrenAbove = forChildrenAbove;
    }

    public int getForChildrenAbove() {
        return forChildrenAbove;
    }

    public void setForChildrenAbove(int forChildrenAbove) {
        this.forChildrenAbove = forChildrenAbove;
    }
}
