
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
    private Map<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    // Enhanced to handle multiple authors and include a genre
    public void addBook(String isbn, String title, String author, int year, String genre) {
        if (books.containsKey(isbn)) {
            throw new IllegalArgumentException("Book with this ISBN already exists.");
        }
        if (year <= 0) {
            throw new IllegalArgumentException("Invalid publication year.");
        }
        books.put(isbn, new Book(isbn, title, author, year, genre, true)); // Assuming Book has these attributes
        System.out.println("Book added successfully: " + title);
    }

    // Enhanced to allow viewing details of the borrowed book
    public Book borrowBook(String isbn, String borrowerName) {
        if (!books.containsKey(isbn)) {
            throw new IllegalArgumentException("Book not found.");
        }
        Book book = books.get(isbn);
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is already borrowed.");
        }
        book.setAvailable(false);
        book.setBorrowedBy(borrowerName); // Track who borrowed the book
        System.out.println("Book borrowed successfully: " + book.getTitle() + " by " + borrowerName);
        return book;
    }

    // Enhanced to show a message on successful return and reset borrower
    public void returnBook(String isbn) {
        if (!books.containsKey(isbn)) {
            throw new IllegalArgumentException("Book not found.");
        }
        Book book = books.get(isbn);
        if (book.isAvailable()) {
            throw new IllegalStateException("This book is not currently borrowed.");
        }
        book.setAvailable(true);
        book.setBorrowedBy(null); // Reset borrower
        System.out.println("Book returned successfully: " + book.getTitle());
    }

    // Enhanced to filter books by genre or author
    public void viewAvailableBooks(String filterType, String filterValue) {
        System.out.println("Available Books:");
        books.values().stream()
                .filter(Book::isAvailable)
                .filter(book -> {
                    if ("genre".equalsIgnoreCase(filterType)) {
                        return book.getGenre().equalsIgnoreCase(filterValue);
                    } else if ("author".equalsIgnoreCase(filterType)) {
                        return book.getAuthor().equalsIgnoreCase(filterValue);
                    }
                    return true; // No filter applied
                })
                .forEach(System.out::println);
    }

    // New method to search books by title or author
    public void searchBooks(String query) {
        System.out.println("Search Results:");
        books.values().stream()
                .filter(book -> book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                        book.getAuthor().toLowerCase().contains(query.toLowerCase()))
                .forEach(System.out::println);
    }

    // New method to display all books, including borrowed ones
    public void viewAllBooks() {
        System.out.println("All Books in Library:");
        for (Book book : books.values()) {
            System.out.println(book + " (Available: " + book.isAvailable() + ")");
        }
    }

    // New method to remove a book by ISBN
    public void removeBook(String isbn) {
        if (!books.containsKey(isbn)) {
            throw new IllegalArgumentException("Book not found.");
        }
        books.remove(isbn);
        System.out.println("Book removed successfully.");
    }
}
