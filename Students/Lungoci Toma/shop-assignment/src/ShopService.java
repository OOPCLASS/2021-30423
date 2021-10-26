public class ShopService {
    private Category allCategs[];
    private Product allProducts[];
    private int numberCategs;

    public ShopService(Category[] allCategs, Product[] allProducts, int numberCategs) {
        this.allCategs = allCategs;
        this.allProducts = allProducts;
        this.numberCategs=numberCategs;
    }

    public Category[] getAllCategs() {
        return allCategs;
    }

    public Product[] getAllProducts() {
        return allProducts;
    }
    public void getProductsFrom(Category category, int numberCategs, int numberProd){
        for (int i=0;i< numberProd;i++){
            if (allProducts[i].getCategory().equals(category)){
                System.out.println(allProducts[i].getName()+" ");
            }
        }
    }
    public void searchProduct(String name, int numberProd) {
        int ok=0;
        for (int i = 0; i < numberProd; i++) {
            if (allProducts[i].getName().equals(name)) {
                System.out.println("\ntrue");
                ok=1;
            }
        }
        if(ok==0){
            System.out.println("\nfalse");
        }
    }
}
