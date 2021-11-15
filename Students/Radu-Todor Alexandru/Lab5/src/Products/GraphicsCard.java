package Products;

import java.util.Objects;

public class GraphicsCard extends Product{
    private Double teraflops;
    private int ports;

    public GraphicsCard(String name, Double price, Double teraflops, int ports) {
        super(name, price);
        this.teraflops = teraflops;
        this.ports = ports;
    }

    public Double getTeraflops() {
        return teraflops;
    }

    public void setTeraflops(Double teraflops) {
        this.teraflops = teraflops;
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    @Override
    public void printProduct() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Teraflops: " + teraflops);
        System.out.println("Ports: " + ports);
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GraphicsCard that = (GraphicsCard) o;
        return ports == that.ports && teraflops.equals(that.teraflops);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teraflops, ports);
    }
}
