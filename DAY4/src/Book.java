import java.util.Scanner;

class Books {
    // Member fields
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    // Constructor to initialize book details
    public Books(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    // Default constructor
    public Books() { }

    // Getter and Setter methods
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display book details
    public void display() {
        System.out.println("Book ID: " + bookId + ", Book Name: " + bookName + ", Author: " + author + ", Price: " + price);
    }
}

class Library {
    private Books[] books;
    private int count;
    
    // Constructor to initialize the library with a maximum number of books
    public Library(int size) {
        books = new Books[size];
        count = 0;
    }

    // a. To Accept Book Information
    public void addBook(Books book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    // b. Update Book Information by Book_Id (Overloaded function)
    public void updateBook(int bookId, String newBookName, String newAuthor, double newPrice) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == bookId) {
                books[i].setBookName(newBookName);
                books[i].setAuthor(newAuthor);
                books[i].setPrice(newPrice);
                System.out.println("Book information updated successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // c. Display all book details
    public void displayAllBooks() {
        if (count == 0) {
            System.out.println("No books available.");
        } else {
            for (int i = 0; i < count; i++) {
                books[i].display();
            }
        }
    }

    // d. Display book details of a given author (Overloaded function)
    public void displayBooksByAuthor(String author) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                books[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    // e. Display book details of a given Book_Id (Overloaded function)
    public void displayBookById(int bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == bookId) {
                books[i].display();
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }
}

public class Book
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library(100); // Create a library that can store up to 100 books

        int choice;
        do {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book by Book ID");
            System.out.println("3. Display All Books");
            System.out.println("4. Display Books by Author");
            System.out.println("5. Display Book by Book ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();  // Consume newline

                    System.out.print("Enter Book Name: ");
                    String bookName = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Books book = new Books(bookId, bookName, author, price);
                    library.addBook(book);
                    break;

                case 2:
                    // Update book information by Book ID
                    System.out.print("Enter Book ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();  // Consume newline

                    System.out.print("Enter new Book Name: ");
                    String newBookName = sc.nextLine();

                    System.out.print("Enter new Author Name: ");
                    String newAuthor = sc.nextLine();

                    System.out.print("Enter new Price: ");
                    double newPrice = sc.nextDouble();

                    library.updateBook(updateId, newBookName, newAuthor, newPrice);
                    break;

                case 3:
                    // Display all books
                    library.displayAllBooks();
                    break;

                case 4:
                    // Display books by author
                    System.out.print("Enter author name to search: ");
                    String searchAuthor = sc.nextLine();
                    library.displayBooksByAuthor(searchAuthor);
                    break;

                case 5:
                    // Display book by Book ID
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    library.displayBookById(searchId);
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
