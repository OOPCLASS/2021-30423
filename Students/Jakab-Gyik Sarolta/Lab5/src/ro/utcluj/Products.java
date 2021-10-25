package ro.utcluj;

public class Products {
    public Books[] library;
    public Albums[] albumCollection;
    public Newspapers[] newspaperCollection;
    private int count;

    public Products() {
        library = new Books[10];
        count = 0;
    }

    public Products(int parameter) {
        albumCollection = new Albums[10];
        count = 0;
    }

    public Products(int parameter, int parameter2) {
        newspaperCollection = new Newspapers[10];
        count = 0;
    }

    public void addToLibrary(Books newBook) {
        library[count] = newBook;
        count++;
    }

    public void deleteFromLibrary(String title) {
        int index = searchBookInLibrary(title);
        if (index != -1) {
            for (int i = index + 1; i < count; i++) {
                library[i - 1] = library[i];
            }
            count--;
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
                System.out.println("There is no quantity i stock from the title mentioned");
                System.out.println("The price will be: 0 lei");
            }
        } else {
            System.out.println("The book is not in the shop");
        }
    }

    public int searchBookInLibrary(String newTitle) {
        int index = -1;
        for (int i = 0; i < count && index == -1; i++) {
            if (library[i].title.equals(newTitle) && library[i].quantity != 0) {
                index = i;
            }
        }
        return index;
    }

    public void printLibrary() {
        for (int currentCounter = 0; currentCounter < count; currentCounter++) {
            System.out.println(library[currentCounter].title + " " + library[currentCounter].quantity);
        }
    }

    public void addToAlbums(Albums newAlbum) {
        albumCollection[count] = newAlbum;
        count++;
    }

    public void searchAlbumInCollection(String newAlbum) {
        boolean found = false;
        for (int i = 0; i < count && found == false; i++) {
            if (albumCollection[i].title.equals(newAlbum) && albumCollection[i].quantity != 0) {
                found = true;
            }
        }
        if (found == true){
            System.out.println("The album is found in the shop");
        } else {
            System.out.println("The album is not found in the shop");
        }
    }

    public void printAlbumCollection() {
        for (int currentCounter = 0; currentCounter < count; currentCounter++) {
            System.out.println(albumCollection[currentCounter].title + " " + albumCollection[currentCounter].quantity);
        }
    }

    public void addToNewspapers(Newspapers newName) {
        newspaperCollection[count] = newName;
        count++;
    }

    public void searchNewspaperInCollection(String newAlbum) {
        boolean found = false;
        for (int i = 0; i < count && found == false; i++) {
            if (newspaperCollection[i].name.equals(newAlbum) && newspaperCollection[i].quantity != 0) {
                found = true;
            }
        }
        if (found == true){
            System.out.println("The newspaper is found in the shop");
        } else {
            System.out.println("The newspaper is not found in the shop");
        }
    }

    public void printNewspaperCollection() {
        for (int currentCounter = 0; currentCounter < count; currentCounter++) {
            System.out.println(newspaperCollection[currentCounter].name + " " + newspaperCollection[currentCounter].quantity);
        }
    }

}
