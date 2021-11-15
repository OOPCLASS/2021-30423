package Products;

import java.util.Objects;

public class Computer extends Product{
    private Processor processor;
    private GraphicsCard graphicsCard;
    private int ram;
    private int rom;

    public Computer(String name, Double price, Processor processor, GraphicsCard graphicsCard, int ram, int rom) {
        super(name, price);
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        this.rom = rom;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && rom == computer.rom && processor.equals(computer.processor) && graphicsCard.equals(computer.graphicsCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), processor, graphicsCard, ram, rom);
    }

    @Override
    public void printProduct() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Processor: " + processor.getName());
        System.out.println("Graphics Card: " + graphicsCard.getName());
        System.out.println("RAM: " + ram);
        System.out.println("ROM: " + rom);
        System.out.println();
    }
}
