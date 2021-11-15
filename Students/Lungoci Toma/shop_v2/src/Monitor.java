import jdk.swing.interop.SwingInterOpUtils;

public class Monitor extends Electronics{
    private int speedInHz;
    private int colorBits;

    public Monitor(String name, int price, int yearOfRelease, int id, int speedInHz, int colorBits) {
        super(name, price, yearOfRelease, id);
        this.speedInHz = speedInHz;
        this.colorBits = colorBits;
    }

    public int getSpeedInHz() {
        return speedInHz;
    }

    public int getColorBits() {
        return colorBits;
    }

    @Override
    public int getPrice() {
        System.out.println("get price in the monitor class");
        return super.getPrice();
    }


    @Override
    public void printID() {
        System.out.println("printID in Monitor called: "+super.getId()+" "+super.getName());
        super.printID();
    }
}
