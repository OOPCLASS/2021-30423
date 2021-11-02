/**
 * Create a hierarchy of products with some classes having
 * two levels of inheritance.
 *
 * - create some products of different types and add
 *   them to the same array
 * - create a method which returns the products of a
 *   specific type from the list of all products
 * - implement some overriden & overloaded methods
 * - try out equals on different classes
 * - draw the UML diagram for your classes
 */
public class Main {
    public static void main(String[] args){
        Monitor dellMonitor = new Monitor("Dell Gaming Monitor", 200, 2018, 10009, 120, 10);
        dellMonitor.setCategory("Electronics");
        Electronics asusLaptop = new Electronics("Asus laptop", 1000, 2000, 111189);
        asusLaptop.setCategory("Electronics");
        ShopService myShop = new ShopService();
        myShop.addProduct(dellMonitor);
        myShop.addProduct(asusLaptop);
        myShop.getAllProducts();
        asusLaptop.printID();
        dellMonitor.printID();
        dellMonitor.getPrice();
        asusLaptop.getPrice();


        Books dorianBook = new Books("Picture of Doriam", 20, "Eminescu", 430);
        dorianBook.setCategory("Books");
        Books cormenBook = new Books("Introduction to Algs", 200, "Cormen", 1300);
        cormenBook.setCategory("Books");
        myShop.addProduct(dorianBook);
        myShop.addProduct(cormenBook);
        myShop.getAllProducts();
        System.out.println("----------------------------");
        myShop.printFromClass("Electronics");
    }
}
