package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.Library;


public class LibraryTests {
    
    @Test
    public void testTesting() {
        assertTrue(true);
    }

    @Test
    public void testLoginValid() {
        Library library = Library.getInstance();
        library.login("asmith");
        String firstName = library.getCurrentUser().getFirstName();
        assertEquals("Amy", firstName);
    }

    @Test
    public void testAddAccountValid() {
        Library library = Library.getInstance();
        library.createAccount("jmath", "John", "Math", 16, "803-747-8899");
        library.logout();
        boolean loggedIn = library.login("jmath");

        assertTrue(loggedIn);
    }

    @Test
    public void testInValid() {
        Library library = Library.getInstance();
        boolean result = library.login("ferikson");
        assertFalse(result);
    }
}
