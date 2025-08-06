class Book {
    String title;
    String author;
    int bookID;

    static int bookCounter = 1000;
    static final String LIBRARY_NAME = "Central Library";

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.bookID = bookCounter++;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.bookID = bookCounter++;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ID: " + bookID);
    }

    public static void displayTotalBooks() {
        System.out.println("Total books: " + (bookCounter - 1000));
    }
}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("1980", "Jacob thomas");
        Book b3 = new Book("bird", "Harper ");

        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();

        Book.displayTotalBooks();
    }
}
