package Products;

public class Main {
    public static void main(String argv[]) {
        Product[] products = new Product[4];

        products[0] = new Processor("AMD Ryzen 4600H", 900.0, 6, 3.0);

        products[1] = new GraphicsCard("Nvidia RTX 2070", 2567.9, 11.8, 4);

        products[2] = new Computer("MSI Gaming", 5432.1, (Processor) products[0], (GraphicsCard) products[1], 16, 1024);

        Processor appleProcessor = new Processor("Apple M1", 1000.0, 12, 2.8);
        GraphicsCard appleGraphicsCard = new GraphicsCard("Apple M1 iGPU", 1000.0, 9.8, 3);
        products[3] = new AllInOneComputer("Apple iMac", 9999.9, appleProcessor, appleGraphicsCard, 8, 256, 3840, 2160);

        products[0].printProduct();
        products[1].printProduct();
        products[2].printProduct();
        products[3].printProduct();

        for (int i = 0; i < 3; i ++) {
            for (int j = i + 1; j < 4; j ++) {
                System.out.println(products[i].getName() + " equals " + products[j].getName() + "? " + products[i].equals(products[j]));
            }
        }
    }
}
