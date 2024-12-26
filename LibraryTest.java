import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
        library.addBook("12345", "Effective Java", "Joshua Bloch", 2008, "Programming");
        library.addBook("67890", "Clean Code", "Robert C. Martin", 2008, "Software Development");
    }

    @Test
    void testAddBook() {
        library.addBook("11111", "Design Patterns", "Erich Gamma", 1994, "Software Engineering");
        assertThrows(IllegalArgumentException.class, () ->
                library.addBook("11111", "Duplicate ISBN", "Author", 2020, "Programming"));
    }

    @Test
    void testAddBookInvalidYear() {
        assertThrows(IllegalArgumentException.class, () ->
                library.addBook("22222", "Invalid Year", "Author", -1, "Fiction"));
    }

    @Test
    void testBorrowBookSuccess() {
        Book borrowedBook = library.borrowBook("12345", "Alice");
        assertNotNull(borrowedBook);
        assertFalse(borrowedBook.isAvailable());
        assertEquals("Alice", borrowedBook.getBorrowedBy());
    }

    @Test
    void testBorrowBookNotFound() {
        assertThrows(IllegalArgumentException.class, () ->
                library.borrowBook("99999", "Alice"));
    }

    @Test
    void testBorrowBookAlreadyBorrowed() {
        library.borrowBook("12345", "Alice");
        assertThrows(IllegalStateException.class, () ->
                library.borrowBook("12345", "Bob"));
    }

    @Test
    void testReturnBookSuccess() {
        library.borrowBook("12345", "Alice");
        library.returnBook("12345");
        Book book = library.borrowBook("12345", "Bob");
        assertEquals("Bob", book.getBorrowedBy());
    }

    @Test
    void testReturnBookNotFound() {
        assertThrows(IllegalArgumentException.class, () ->
                library.returnBook("99999"));
    }

    @Test
    void testReturnBookNotBorrowed() {
        assertThrows(IllegalStateException.class, () ->
                library.returnBook("12345"));
    }

    @Test
    void testViewAvailableBooksByGenre() {
        library.borrowBook("12345", "Alice");
        library.viewAvailableBooks("genre", "Software Development"); // Should show "Clean Code"
    }

    @Test
    void testViewAvailableBooksByAuthor() {
        library.borrowBook("67890", "Alice");
        library.viewAvailableBooks("author", "Joshua Bloch"); // Should show "Effective Java"
    }

    @Test
    void testSearchBooks() {
        library.searchBooks("Code"); // Should display "Clean Code"
    }

    @Test
    void testViewAllBooks() {
        library.viewAllBooks(); // Should show all books with their availability
    }

    @Test
    void testRemoveBookSuccess() {
        library.removeBook("12345");
        assertThrows(IllegalArgumentException.class, () ->
                library.borrowBook("12345", "Alice"));
    }

    @Test
    void testRemoveBookNotFound() {
        assertThrows(IllegalArgumentException.class, () ->
                library.removeBook("99999"));
    }
}
