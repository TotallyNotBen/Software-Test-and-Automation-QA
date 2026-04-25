import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testValidContactCreation() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main Street");

        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    public void testContactIdCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testFirstNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "Doe", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testLastNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", null, "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testPhoneCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", null, "123 Main Street");
        });
    }

    @Test
    public void testAddressCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "1234567890", null);
        });
    }

    @Test
    public void testContactIdCannotBeLongerThan10() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "John", "Doe", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testFirstNameCannotBeLongerThan10() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Christopher", "Doe", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testLastNameCannotBeLongerThan10() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Christopher", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testPhoneMustBeExactly10Digits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "12345", "123 Main Street");
        });
    }

    @Test
    public void testAddressCannotBeLongerThan30() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "1234567890", "123 This Address Is Definitely Too Long");
        });
    }
}
