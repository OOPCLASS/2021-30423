package ro.utcluj;

import java.awt.print.Book;

/**
 * Shop having categories and products
 *
 * category:
 *  - name
 * product:
 *  - name
 *  - quantity
 *  - category
 *  - price
 *
 * shopService:
 * // hold 2 arrays for categs & products
 * // display all the products from a specific category
 * // search a product by name
 *
 * draw the UML diagrams for each of your classes
 */
public class Shop {
    public String[] categories;
    private Integer countCategories;

    public Shop() {
        categories = new String[5];
        countCategories = 0;
    }
    public void addCategories(String categoryName) {
        boolean add = true;
        for (String names : categories) {
            if (names.equals(categoryName)) {
                System.out.println("The category already exists!");
                add = false;
            }

        }
        if (add == true) {
            categories[countCategories] = categoryName;
            countCategories++;
        }
    }
    public void displayCategories(String nameCategory) {
        for (Integer currentCounter = 0; currentCounter < countCategories; currentCounter++) {
            System.out.println(categories[currentCounter]);
        }
    }
    public static void main(String[] args) {
        Products myLibrary = new Products();
        Books newBook = new Books("Pride and prejudice", "Jane Austin", 3, 35.5);
        myLibrary.addToLibrary(newBook);
        Books newBook2 = new Books("Wouthering heights", "Emily Bronte", 5, 38);
        myLibrary.addToLibrary(newBook2);
        Books newBook3 = new Books("The count of Monte Cristo", "Alexandre Duma", 4, 40);
        myLibrary.addToLibrary(newBook3);
        myLibrary.printLibrary();
        myLibrary.sellBook("The count of Monte Cristo", 2);
        myLibrary.sellBook("The count of Monte Cristo", 6);
        myLibrary.sellBook(newBook.title, 2);
        int index = myLibrary.searchBookInLibrary("Pride and prejudice");
        if (index != -1){
            System.out.println("The book is found in the shop");
        } else {
            System.out.println("The book is not found in the shop");
        }
        index = myLibrary.searchBookInLibrary("Pinocchio");
        if (index != -1){
            System.out.println("The book is found in the shop");
        } else {
            System.out.println("The book is not found in the shop");
        }
        myLibrary.printLibrary();
        myLibrary.deleteFromLibrary("Wouthering heights");
        myLibrary.printLibrary();
    }
}
