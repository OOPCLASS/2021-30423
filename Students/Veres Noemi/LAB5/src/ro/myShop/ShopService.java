package ro.myShop;

public class ShopService {
    public Product[] products = new Product[50];

    public int noOfProducts = 0;

    public void addProduct(Product newProduct) {
        this.products[noOfProducts] = newProduct;
        noOfProducts++;
    }

    public void getAllProducts() {
        for (int i = 0; i < noOfProducts; i++) {
            System.out.print(products[i].getName() + ", ");
        }
        System.out.println();
    }

    public void getProductsOfSpecificType(Product[] products, String type) {
        System.out.print("The " + type + " are: ");
        int i = 0;
        while (products[i] != null) {
            System.out.print(products[i].getName() + ", ");
            i++;
        }
    }

    // productsOfSpecificType() are multiple methods with the same name, but different type of parameters
    public Product[] productsOfSpecificType(Product[] products, Clothes givenType) {
        Product[] specificProducts = new Product[10];
        int j = 0;
        for (int i = 0; i < 6; i++) {
            if (products[i].getClass() == givenType.getClass()) {
                specificProducts[j] = products[i];
                j++;
            }
        }
        return specificProducts;
    }

    public Product[] productsOfSpecificType(Product[] products, Shoes givenType) {
        Product[] specificProducts = new Product[10];
        int j = 0;
        for (int i = 0; i < 6; i++) {
            if (products[i].getClass() == givenType.getClass()) {
                specificProducts[j] = products[i];
                j++;
            }
        }
        return specificProducts;
    }

    public Product[] productsOfSpecificType(Product[] products, Scarf givenType) {
        Product[] specificProducts = new Product[10];
        int j = 0;
        for (int i = 0; i < 6; i++) {
            if (products[i].getClass() == givenType.getClass()) {
                specificProducts[j] = products[i];
                j++;
            }
        }
        return specificProducts;
    }

    public Product[] productsOfSpecificType(Product[] products, Hat givenType) {
        Product[] specificProducts = new Product[10];
        int j = 0;
        for (int i = 0; i < 6; i++) {
            if (products[i].getClass() == givenType.getClass()) {
                specificProducts[j] = products[i];
                j++;
            }
        }
        return specificProducts;
    }
    public Product[] productsOfSpecificType(Product[] products, Belt givenType) {
        Product[] specificProducts = new Product[10];
        int j = 0;
        for (int i = 0; i < 6; i++) {
            //if (products[i] instanceof Belt) {
            if (products[i].getClass() == givenType.getClass()) {
                specificProducts[j] = products[i];
                j++;
            }
        }
        return specificProducts;
    }
}
