package Products;

public class AllInOneComputer extends Computer{
    private int horizontalResolution;
    private int verticalResolution;

    public AllInOneComputer(String name, Double price, Processor processor, GraphicsCard graphicsCard, int ram, int rom, int horizontalResolution, int verticalResolution) {
        super(name, price, processor, graphicsCard, ram, rom);
        this.horizontalResolution = horizontalResolution;
        this.verticalResolution = verticalResolution;
    }

    public int getHorizontalResolution() {
        return horizontalResolution;
    }

    public void setHorizontalResolution(int horizontalResolution) {
        this.horizontalResolution = horizontalResolution;
    }

    public int getVerticalResolution() {
        return verticalResolution;
    }

    public void setVerticalResolution(int verticalResolution) {
        this.verticalResolution = verticalResolution;
    }

    @Override
    public void printProduct() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Processor: " + getProcessor().getName());
        System.out.println("Graphics Card: " + getGraphicsCard().getName());
        System.out.println("RAM: " + getRam());
        System.out.println("ROM: " + getRom());
        System.out.println("Resolution: " + horizontalResolution + "x" + verticalResolution);
        System.out.println();
    }
}
