

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int year;
    private String genre;
    private boolean available;
    private String borrowedBy; // Tracks who borrowed the book

    // Constructor
    public Book(String isbn, String title, String author, int year, String genre, boolean available) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.available = available;
        this.borrowedBy = null;
    }

    // Getters and Setters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(String borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    // New Methods

    // Update book details (title, author, year, genre)
    public void updateDetails(String title, String author, int year, String genre) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
        if (author != null && !author.isEmpty()) {
            this.author = author;
        }
        if (year > 0) {
            this.year = year;
        }
        if (genre != null && !genre.isEmpty()) {
            this.genre = genre;
        }
    }

    // Check if the book matches a specific genre
    public boolean matchesGenre(String genre) {
        return this.genre != null && this.genre.equalsIgnoreCase(genre);
    }

    // Check if the book matches a specific author
    public boolean matchesAuthor(String author) {
        return this.author != null && this.author.equalsIgnoreCase(author);
    }

    // String representation for displaying book details
    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Year=" + year +
                ", Genre='" + genre + '\'' +
                ", Available=" + available +
                (borrowedBy != null ? ", Borrowed By='" + borrowedBy + '\'' : "") +
                '}';
    }
}
