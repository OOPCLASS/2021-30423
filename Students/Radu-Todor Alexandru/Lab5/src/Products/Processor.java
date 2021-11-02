package Products;

import java.util.Objects;

public class Processor extends Product{
    private int cores;
    private Double frequency;

    public Processor(String name, Double price, int cores, Double frequency) {
        super(name, price);
        this.cores = cores;
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public Double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Processor processor = (Processor) o;
        return cores == processor.cores && frequency.equals(processor.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cores, frequency);
    }

    @Override
    public void printProduct() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Cores: " + cores);
        System.out.println("Frequency: " + frequency);
        System.out.println();
    }
}
