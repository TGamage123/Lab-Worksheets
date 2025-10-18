package LW_05_Q1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> BorrowableItemsList = new ArrayList<>();

    //method to add new items to the list
    public void addLibraryItems(Book borrowableItem){
        BorrowableItemsList.add(borrowableItem);
    }

    //method to check out items from the list/library
    public void checkOutBorrowableItems(String title){
        for (Book book: BorrowableItemsList) {;
            if (book.getTitle().equals(title) && book.isAvailable()) {
                System.out.println("\nThe book you searched is available.");
                System.out.println("checking out: " + book.getTitle());
                book.setAvailable(false);
            }
        }
    }

    //method to list all available borrowable items
    public void listAvailableItems(){
        System.out.println("\nAvailable Items: ");
        for (Book book: BorrowableItemsList) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle());
            }
        }
    }

    //method to display information about library
    public void displayLibraryInfo(){
        int bookCount  = 0;
        for (Book book: BorrowableItemsList) {
            if (book.isAvailable()){
                bookCount++;
            }
        }
        System.out.println("Number of books available: "+bookCount);
    }
}
