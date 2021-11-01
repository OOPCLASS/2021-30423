package ro.utcluj;

import ro.utcluj.Album;
import ro.utcluj.Book;
import ro.utcluj.Newspaper;
import ro.utcluj.Product;

/**
 * Create a hierarchy of products with some classes having
 * two levels of inheritance.
 *
 * - create some products of different types and add them to the same array
 * - create a method which returns the products of a specific type from the list of all products
 * - implement some overridden & overloaded methods
 * - try out equals on different classes
 * - draw the UML diagram for your classes
 */
public class Shop {
    public Product[] listOfAllProducts;
    public Book[] library;
    public Album[] albumCollection;
    public Newspaper[] newspaperCollection;
    private int countLibrary;
    private int countAlbums;
    private int countNewspaper;

    public Shop() {
        this.listOfAllProducts = new Product[30];
        this.library = new Book[10];
        this.albumCollection = new Album[10];
        this.newspaperCollection = new Newspaper[10];
        this.countLibrary = 0;
        this.countAlbums = 0;
        this.countNewspaper = 0;
    }

    public void addToListOfAllProducts(Product newProduct) {
        listOfAllProducts[countNewspaper + countAlbums + countLibrary] = newProduct;
    }

    public void addToLibrary(Book newBook) {
        addToListOfAllProducts(newBook);
        library[countLibrary] = newBook;
        countLibrary++;
    }

    public void deleteFromListOfAllProducts(String name, int index) {
        for (int i = index + 1; i < countLibrary + countAlbums + countNewspaper; i++) {
            listOfAllProducts[i - 1] = listOfAllProducts[i];
        }
    }

    public void deleteFromLibrary(String name) {
        int index = searchBookInLibrary(name);
        if (index != -1) {
            deleteFromListOfAllProducts(name, index);
            for (int i = index + 1; i < countLibrary; i++) {
                library[i - 1] = library[i];
            }
            countLibrary--;
            System.out.println("Item deleted");
        } else {
            System.out.println("The book is not in the shop");
        }
    }

    public void sellBook(String name, int quantity) {
        int index = searchBookInLibrary(name);
        if (index != -1) {

            if (library[index].quantity > quantity) {
                library[index].quantity -= quantity;
                System.out.println("The price will be: " + quantity * library[index].price + " leis");
            } else if(library[index].quantity != 0){
                System.out.println("The customer can only buy " + library[index].quantity + " number of books");
                System.out.println("The price will be: " + library[index].quantity * library[index].price + " leis");
                library[index].quantity = 0;
            } else {
                System.out.println("There is no quantity i stock from the name mentioned");
                System.out.println("The price will be: 0 lei");
            }
        } else {
            System.out.println("The book is not in the shop");
        }
    }

    public int searchBookInLibrary(String newName) {
        int index = -1;
        for (int i = 0; i < countLibrary && index == -1; i++) {
            if (library[i] != null && library[i].name != null && library[i].name.equals(newName) && library[i].quantity != 0) {
                index = i;
            }
        }
        return index;
    }

    public void printLibrary() {
        for (int currentCounter = 0; currentCounter < countLibrary; currentCounter++) {
            System.out.println(library[currentCounter].name + " " + library[currentCounter].quantity);
        }
    }

    public void addToAlbums(Album newAlbum) {
        addToListOfAllProducts(newAlbum);
        albumCollection[countAlbums] = newAlbum;
        countAlbums++;
    }

    public void searchAlbumInCollection(String newAlbum) {
        boolean found = false;
        for (int i = 0; i < countAlbums && found == false; i++) {
            if (albumCollection[i].name.equals(newAlbum) && albumCollection[i].quantity != 0) {
                found = true;
            }
        }
        if (found){
            System.out.println("The album is found in the shop");
        } else {
            System.out.println("The album is not found in the shop");
        }
    }

    public void printAlbumCollection() {
        for (int currentCounter = 0; currentCounter < countAlbums; currentCounter++) {
            System.out.println(albumCollection[currentCounter].name + " " + albumCollection[currentCounter].quantity);
        }
    }

    public void addToNewspapers(Newspaper newNewspaper) {
        addToListOfAllProducts(newNewspaper);
        newspaperCollection[countNewspaper] = newNewspaper;
        countNewspaper++;
    }

    public void searchNewspaperInCollection(String newNewspaper) {
        boolean found = false;
        for (int i = 0; i < countNewspaper && found == false; i++) {
            if (newspaperCollection[i].name.equals(newNewspaper) && newspaperCollection[i].quantity != 0) {
                found = true;
            }
        }
        if (found){
            System.out.println("The newspaper is found in the shop");
        } else {
            System.out.println("The newspaper is not found in the shop");
        }
    }

    public void printNewspaperCollection() {
        for (int currentCounter = 0; currentCounter < countNewspaper; currentCounter++) {
            System.out.println(newspaperCollection[currentCounter].name + " " + newspaperCollection[currentCounter].quantity);
        }
    }

    public void printListOfAllProducts() {
        for (int i = 0; i < countLibrary + countAlbums + countNewspaper; i++) {
            System.out.println(listOfAllProducts[i].toString());
        }
    }

    public void selectBooksFromProducts() {
        boolean found = false;
        for (int i = 0; i < countLibrary + countAlbums + countNewspaper; i++) {
            if (listOfAllProducts[i] instanceof Book) {
                System.out.println(listOfAllProducts[i].toString());
                found = true;
            }
        }
        if (!found)
            System.out.println("There are no books in the shop");
    }

    public void selectAlbumsFromProducts() {
        boolean found = false;
        for (int i = 0; i < countLibrary + countAlbums + countNewspaper; i++) {
            if (listOfAllProducts[i] instanceof Album) {
                System.out.println(listOfAllProducts[i].toString());
                found = true;
            }
        }
        if (!found)
            System.out.println("There are no albums in the shop");
    }

    public void selectNewspapersFromProducts() {
        boolean found = false;
        for (int i = 0; i < countLibrary + countAlbums + countNewspaper; i++) {
            if (listOfAllProducts[i] instanceof Newspaper) {
                System.out.println(listOfAllProducts[i].toString());
                found = true;
            }
        }
        if (!found)
            System.out.println("There are no newspapers in the shop");
    }

    public static void main(String[] args){
        Shop myShop = new Shop();
        Newspaper newspaper = new Newspaper("The Times", 3, 2.33, 10);
        Book newBook = new Book("Pride and prejudice", 4, 44, "Jane Austin");
        myShop.addToLibrary(newBook);
        Book newBook2 = new Book( "Wouthering heights", 15, 34.6, "Emily Bronte");
        myShop.addToLibrary(newBook2);
        Book newBook3 = new Book("The count of Monte Cristo", 22, 43.5, "Alexandre Duma");
        myShop.addToLibrary(newBook3);
        ChildrensBook newBook4 = new ChildrensBook("Susu", 12, 32.8, "Hervai Gizella", 6);
        myShop.addToLibrary(newBook4);
        myShop.printLibrary();
        System.out.println();
        myShop.printListOfAllProducts();
        System.out.println();

        myShop.sellBook("The count of Monte Cristo", 2);
        myShop.sellBook("The count of Monte Cristo", 6);
        myShop.sellBook(newBook.name, 2);
        int index =  myShop.searchBookInLibrary("Pride and prejudice");
        if (index != -1){
            System.out.println("The book is found in the shop");
        } else {
            System.out.println("The book is not found in the shop");
        }
        index =  myShop.searchBookInLibrary("Pinocchio");
        if (index != -1){
            System.out.println("The book is found in the shop");
        } else {
            System.out.println("The book is not found in the shop");
        }
        myShop.printLibrary();
        myShop.deleteFromLibrary("Wouthering heights");
        myShop.printLibrary();

        System.out.println(newBook instanceof Book);
        //System.out.println(newBook instanceof Album); doesnt even compile
        System.out.println(newBook instanceof Object);
        System.out.println(newBook instanceof Product);
        System.out.println(newBook4 instanceof Book);

        myShop.printListOfAllProducts();
        System.out.println();
        myShop.selectBooksFromProducts();
        System.out.println();
        myShop.selectAlbumsFromProducts();

        if (newBook.equals(newBook2)) { //comparing two objects from the same class
            System.out.println("The program does bs");
        } else  {
            System.out.println("All good");
        }
        if (newspaper.equals(newBook2)) { //comparing 2 objects from different classes
            System.out.println("The program does bs");
        } else  {
            System.out.println("All good");
        }
    }
}
