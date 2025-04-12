import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String bookId;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;
 
    public Book(String bookId, String title, String author, String genre) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

class FictionBook extends Book {
    private String fictionCategory;

    public FictionBook(String bookId, String title, String author, String fictionCategory) {
        super(bookId, title, author, "Fiction");
        this.fictionCategory = fictionCategory;
    }

    public String getFictionCategory() {
        return fictionCategory;
    }

    public void setFictionCategory(String fictionCategory) {
        this.fictionCategory = fictionCategory;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fiction Category: " + fictionCategory);
    }
}

class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String bookId, String title, String author, String subject) {
        super(bookId, title, author, "Non-Fiction");
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class User {
    private String userId;
    private String name;
    private List<Book> borrowedBooks;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailability(false);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is currently not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailability(true);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow " + book.getTitle());
        }
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has not borrowed any books.");
        } else {
            System.out.println(name + "'s borrowed books:");
            for (Book book : borrowedBooks) {
                book.displayDetails();
            }
        }
    }
}

class Catalog {
    private List<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books in Catalog:");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayDetails();
                System.out.println();
            }
        }
    }

    public Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Catalog catalog = new Catalog();

        Book book1 = new FictionBook("B1", "DATA STRUCTURE USING C++ ", "HILLS", "Fantasy");
        Book book2 = new NonFictionBook("B2", "The Science of Space", "Naqvi", "Computer Science");
        Book book3 = new FictionBook("B3", "Attack of Titan", "Emily White", "Mystery");

        catalog.addBook(book1);
        catalog.addBook(book2);
        catalog.addBook(book3);

        User user1 = new User("CAMSA100", "ZEESHAN");
        User user2 = new User("CAMSA101", "RASHID");

        catalog.displayAvailableBooks();

        user1.borrowBook(book1); 
        user2.borrowBook(book2); 
        user1.borrowBook(book3); 

        catalog.displayAvailableBooks(); 

        user1.returnBook(book1); 
        catalog.displayAvailableBooks(); 
        user1.displayBorrowedBooks(); 

        System.out.println("Enter the Book ID to check availability:");
        String bookId = scanner.nextLine();

        Book book = catalog.findBookById(bookId);

        if (book != null) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " is available for borrowing.");
            } else {
                System.out.println(book.getTitle() + " is currently not available.");
            }
        } else {
            System.out.println("Book with ID " + bookId + " not found in the catalog.");
        }
        
        scanner.close();
    }
}
