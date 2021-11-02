public class Books extends Product{
    private String author;
    private int numberOfPages;

    public Books(String name, int price, String author, int numberOfPages) {
        super(name, price, "");
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    public String nameOfClass(){
        return "Books";
    }
}
