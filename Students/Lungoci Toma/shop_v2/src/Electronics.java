public class Electronics extends Product{
    private int yearOfRelease;
    private int id;

    public Electronics(String name, int price,int yearOfRelease, int id) {
        super(name, price, "");
        this.yearOfRelease=yearOfRelease;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getPrice(){
        return super.getPrice();
    }

    public void printID(){
        System.out.println("printID in Electronics called: "+(id));
    }

    public String nameOfClass(){
        return "Electronics";
    }
}
