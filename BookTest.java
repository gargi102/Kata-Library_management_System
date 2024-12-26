import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class BookTest {

    @Test
    void testBookCreation() {
        Book book = new Book("12345", "Test Title", "Test Author", 2023, "Fiction", true);
        assertEquals("12345", book.getIsbn());
        assertEquals("Test Title", book.getTitle());
        assertEquals("Test Author", book.getAuthor());
        assertEquals(2023, book.getYear());
        assertEquals("Fiction", book.getGenre());
        assertTrue(book.isAvailable());
        assertNull(book.getBorrowedBy());
    }

    @Test
    void testUpdateDetails() {
        Book book = new Book("12345", "Old Title", "Old Author", 2000, "Non-Fiction", true);
        book.updateDetails("New Title", "New Author", 2022, "Fiction");

        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
        assertEquals(2022, book.getYear());
        assertEquals("Fiction", book.getGenre());
    }

    @Test
    void testSetBorrowedBy() {
        Book book = new Book("12345", "Test Title", "Test Author", 2023, "Fiction", true);
        book.setBorrowedBy("John Doe");
        assertEquals("John Doe", book.getBorrowedBy());
    }

    @Test
    void testIsAvailable() {
        Book book = new Book("12345", "Test Title", "Test Author", 2023, "Fiction", true);
        book.setAvailable(false);
        assertFalse(book.isAvailable());

        book.setAvailable(true);
        assertTrue(book.isAvailable());
    }

    @Test
    void testMatchesGenre() {
        Book book = new Book("12345", "Test Title", "Test Author", 2023, "Fiction", true);
        assertTrue(book.matchesGenre("Fiction"));
        assertFalse(book.matchesGenre("Non-Fiction"));
    }

    @Test
    void testMatchesAuthor() {
        Book book = new Book("12345", "Test Title", "Test Author", 2023, "Fiction", true);
        assertTrue(book.matchesAuthor("Test Author"));
        assertFalse(book.matchesAuthor("Another Author"));
    }

    @Test
    void testToString() {
        Book book = new Book("12345", "Test Title", "Test Author", 2023, "Fiction", true);
        String expected = "Book{ISBN='12345', Title='Test Title', Author='Test Author', Year=2023, Genre='Fiction', Available=true}";
        assertEquals(expected, book.toString());
    }
}
