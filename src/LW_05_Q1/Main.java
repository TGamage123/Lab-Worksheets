package LW_05_Q1;

public class Main {
    public static void main(String[] args) {
        //create books
        Book book1 = new Book("Seena Maragatham","Sujatha Thilaka", "9789553023975", true );
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala","Seynamasasekaka", "9789553548721", true );
        Book book3 = new Book("Island of a Thousand Mirrors","Nayomi Munaweera", "9781616953623", true );

        //create library
        Library FCTLibrary = new Library();

        //add books
        FCTLibrary.addLibraryItems(book1);
        FCTLibrary.addLibraryItems(book2);
        FCTLibrary.addLibraryItems(book3);

        //display information
        FCTLibrary.displayLibraryInfo();
        FCTLibrary.listAvailableItems();

        //checkout a book
        FCTLibrary.checkOutBorrowableItems("Island of a Thousand Mirrors");

        //list all available books
        FCTLibrary.listAvailableItems();
    }

}
