import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String bookId;
    private String title;
    private String author;
    private String genre;
    private int bookCount; 

    public Book(String bookId, String title, String author, String genre, int bookCount) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookCount = bookCount;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void increaseBookCount() {
        this.bookCount++;
    }

    public void decreaseBookCount() {
        if (this.bookCount > 0) {
            this.bookCount--;
        }
    }

    public void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Available Copies: " + bookCount);
    }

    public boolean isAvailable() {
        return bookCount > 0;
    }
}

class Catalog {
    private List<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        boolean exists = false;
        for (Book b : books) {
            if (b.getBookId().equals(book.getBookId())) {
                b.increaseBookCount();
                System.out.println("The book '" + book.getTitle() + "' already exists. Increased book count.");
                exists = true;
                break;
            }
        }
        if (!exists) {
            books.add(book);
            System.out.println("Added new book: " + book.getTitle());
        }
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable Books in Catalog:");
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
        Catalog catalog = new Catalog();
        Scanner scanner = new Scanner(System.in);


        catalog.addBook(new Book("s001", "The vikings Adventure", "shakib", "Fiction", 3));
        catalog.addBook(new Book("s002", "The chemistry of Space", " ammar", "Non-Fiction", 5));
        catalog.addBook(new Book("s003", "Mystery of the Ancient Tomb", "Emily White", "Fiction", 2));

        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Display Available Books");
            System.out.println("2. Add a New Book");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == 1) {
                catalog.displayAvailableBooks();
            } else if (choice == 2) {
                System.out.print("Enter Book ID: ");
                String bookId = scanner.nextLine();
                System.out.print("Enter Book Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Author: ");
                String author = scanner.nextLine();
                System.out.print("Enter Genre: ");
                String genre = scanner.nextLine();
                System.out.print("Enter Number of Copies: ");
                int count = scanner.nextInt();
                scanner.nextLine();  

                Book newBook = new Book(bookId, title, author, genre, count);
                catalog.addBook(newBook);
            } else if (choice == 3) {
                System.out.print("Enter Book ID to Borrow: ");
                String bookId = scanner.nextLine();
                Book book = catalog.findBookById(bookId);
                if (book != null) {
                    if (book.isAvailable()) {
                        book.decreaseBookCount();
                        System.out.println("You have successfully borrowed the book: " + book.getTitle());
                    } else {
                        System.out.println("Sorry, the book '" + book.getTitle() + "' is currently not available.");
                    }
                } else {
                    System.out.println("Book not found.");
                }
            } else if (choice == 4) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
