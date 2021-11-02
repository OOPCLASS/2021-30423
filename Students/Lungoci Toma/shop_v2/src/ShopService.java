public class ShopService {
    Product[] allProducts = new Product[100];
    private int numberOfProducts=0;

    public void addProduct(Product product1){
        allProducts[numberOfProducts]=product1;
        numberOfProducts++;
    }

    public void getAllProducts(){
        for(int i=0; i<numberOfProducts; i++){
            System.out.println(allProducts[i].getName()+"\n");
        }
    }
    public void printFromClass(String nameOfClass){
        for(int i=0; i<numberOfProducts; i++){
            if(allProducts[i].getCategory().equals(nameOfClass)){
                System.out.println(allProducts[i].getName()+"\n");
            }
        }
    }
}
