package ro.myShop;

public class Main {
    public static void main(String[] args) {

        ShopService myShop = new ShopService();

        Clothes coat = new Clothes();
        coat.setName("Random coat");
        coat.setCode("KX12");
        coat.setPrice(49.99);
        coat.setColor("black");
        coat.setMaterial("wool");

        Clothes shirt = new Clothes();
        shirt.setName("My shirt");
        shirt.setCode("GH45");
        shirt.setPrice(9.99);
        shirt.setColor("white");
        shirt.setMaterial("cotton");

        Shoes boots = new Shoes();
        boots.setName("Leather Boots");
        boots.setCode("CJ18");
        boots.setPrice(39.99);
        boots.setWaterproof(true);
        boots.setWarrantyInMonths(12);
        boots.setSeason("autumn");

        Scarf scarf = new Scarf();
        scarf.setName("scarfy");
        scarf.setCode("DJ95");
        scarf.setPrice(8.99);
        scarf.setCollection("Premium");
        scarf.setCashmere(true);

        Hat hat = new Hat();
        hat.setName("my hat");
        hat.setCode("SC38");
        hat.setPrice(9.99);
        hat.setCollection("Conscious");
        hat.setDiscount(30);

        Belt belt = new Belt();
        belt.setName("belty");
        belt.setCode("KD28");
        belt.setPrice(4.99);
        belt.setCollection("New");
        belt.setLeather(false);

        //Product[] products = new Product[6];
        myShop.addProduct(coat);
        myShop.addProduct(shirt);
        myShop.addProduct(boots);
        myShop.addProduct(scarf);
        myShop.addProduct(hat);
        myShop.addProduct(belt);
        myShop.getAllProducts();

        Product[] clothes = myShop.productsOfSpecificType(myShop.products, new Clothes());
        myShop.getProductsOfSpecificType(clothes,"clothes");
        Product[] shoes = myShop.productsOfSpecificType(myShop.products, new Shoes());
        myShop.getProductsOfSpecificType(shoes,"shoes");

        /*System.out.println(boots.equals(coat));
        System.out.println(boots.equals(shirt));
        System.out.println(boots.equals(boots)); //true
        System.out.println(boots.equals(scarf));
        System.out.println(boots.equals(hat));
        System.out.println(boots.equals(belt));*/
    }
}
