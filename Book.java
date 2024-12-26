
import java.util.*;
import java.util.stream.Collectors;

class Book {
    private String isbn;
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;

    public Book(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = false;
    }

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

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        if (isBorrowed) {
            throw new IllegalStateException("Book is already borrowed.");
        }
        isBorrowed = true;
    }

    public void returnBook() {
        if (!isBorrowed) {
            throw new IllegalStateException("Book is not borrowed.");
        }
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return String.format("ISBN: %s, Title: %s, Author: %s, Year: %d %s", isbn, title, author, year, isBorrowed ? "(Borrowed)" : "(Available)");
    }
}