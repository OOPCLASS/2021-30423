package ro.myShop;

public class Clothes extends Product {
    private String color;
    private String material;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getDescription() {
        return String.valueOf(material);
    }
}
