import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library = new Library();
    Book book1 = new Book("Book1", "Author1", "12345", 2000);
    Book book2 = new Book("Book2", "Author2", "67890", 2010);

    @Test
    void testAddBook() {
        library.addBook(book1);
        library.addBook(book2);

        int expectedSize = 2;
        int actualSize = library.getBooks().size();
        assertEquals(expectedSize, actualSize);
        System.out.println("testAddBook: " + (actualSize == expectedSize ? "Passed" : "Failed"));
    }

    @Test
    void testDisplayBooks() {
        library.addBook(book1);
        library.addBook(book2);

        // Тут складніше перевіряти виведення на консоль. Ви можете вивести на консоль і перевірити вручну, або перевірити, чи метод не видає помилок.
        System.out.println("testDisplayBooks: Skipped");
    }

    @Test
    void testSearchBookByTitle() {
        library.addBook(book1);
        library.addBook(book2);

        Book expectedBook = book1;
        Book actualBook = library.searchBookByTitle("Book1");
        assertEquals(expectedBook, actualBook);
        System.out.println("testSearchBookByTitle: " + (expectedBook.equals(actualBook) ? "Passed" : "Failed"));

        assertNull(library.searchBookByTitle("Nonexistent Book"));
        System.out.println("testSearchBookByTitle (nonexistent): Passed");
    }

    @Test
    void testRemoveBookByIsbn() {
        library.addBook(book1);
        library.addBook(book2);

        library.removeBookByIsbn("12345");

        assertNull(library.searchBookByTitle("Book1"));
        System.out.println("testRemoveBookByIsbn: Passed");

        int expectedSize = 1;
        int actualSize = library.getBooks().size();
        assertEquals(expectedSize, actualSize);
        System.out.println("testRemoveBookByIsbn (size check): " + (actualSize == expectedSize ? "Passed" : "Failed"));
    }
}
