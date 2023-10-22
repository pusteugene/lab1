import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void getTitle() {
        Book book = new Book("Sample Title", "Sample Author", "12345", 2022);
        String expectedTitle = "Sample Title";
        String actualTitle = book.getTitle();
        assertEquals(expectedTitle, actualTitle);
        System.out.println("getTitle: " + (expectedTitle.equals(actualTitle) ? "Passed" : "Failed"));
    }

    @Test
    void getAuthor() {
        Book book = new Book("Sample Title", "Sample Author", "12345", 2022);
        String expectedAuthor = "Sample Author";
        String actualAuthor = book.getAuthor();
        assertEquals(expectedAuthor, actualAuthor);
        System.out.println("getAuthor: " + (expectedAuthor.equals(actualAuthor) ? "Passed" : "Failed"));
    }

    @Test
    void getIsbn() {
        Book book = new Book("Sample Title", "Sample Author", "12345", 2022);
        String expectedIsbn = "12345";
        String actualIsbn = book.getIsbn();
        assertEquals(expectedIsbn, actualIsbn);
        System.out.println("getIsbn: " + (expectedIsbn.equals(actualIsbn) ? "Passed" : "Failed"));
    }

    @Test
    void getPublicationYear() {
        Book book = new Book("Sample Title", "Sample Author", "12345", 2022);
        int expectedYear = 2022;
        int actualYear = book.getPublicationYear();
        assertEquals(expectedYear, actualYear);
        System.out.println("getPublicationYear: " + (expectedYear == actualYear ? "Passed" : "Failed"));
    }
}
