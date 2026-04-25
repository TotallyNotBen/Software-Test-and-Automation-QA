import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("100", "John", "Doe", "1234567890", "123 Main Street");

        service.addContact(contact);

        assertEquals("John", service.getContact("100").getFirstName());
    }

    @Test
    public void testAddContactWithDuplicateIdThrowsException() {
        ContactService service = new ContactService();
        Contact contact1 = new Contact("100", "John", "Doe", "1234567890", "123 Main Street");
        Contact contact2 = new Contact("100", "Jane", "Smith", "0987654321", "456 Oak Avenue");

        service.addContact(contact1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact2);
        });
    }

    @Test
    public void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("100", "John", "Doe", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.deleteContact("100");

        assertThrows(IllegalArgumentException.class, () -> {
            service.getContact("100");
        });
    }

    @Test
    public void testDeleteNonexistentContactThrowsException() {
        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("999");
        });
    }

    @Test
    public void testUpdateFirstName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("100", "John", "Doe", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updateFirstName("100", "Jane");

        assertEquals("Jane", service.getContact("100").getFirstName());
    }

    @Test
    public void testUpdateLastName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("100", "John", "Doe", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updateLastName("100", "Smith");

        assertEquals("Smith", service.getContact("100").getLastName());
    }

    @Test
    public void testUpdatePhone() {
        ContactService service = new ContactService();
        Contact contact = new Contact("100", "John", "Doe", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updatePhone("100", "0987654321");

        assertEquals("0987654321", service.getContact("100").getPhone());
    }

    @Test
    public void testUpdateAddress() {
        ContactService service = new ContactService();
        Contact contact = new Contact("100", "John", "Doe", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updateAddress("100", "456 Oak Avenue");

        assertEquals("456 Oak Avenue", service.getContact("100").getAddress());
    }

    @Test
    public void testUpdateNonexistentContactThrowsException() {
        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("999", "Jane");
        });
    }
}
