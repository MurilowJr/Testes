package test;

import main.DAO.PersonDAO;
import main.Entity.Email;
import main.Entity.Person;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonDAOTest {

    @Test
    public void testIsValidToIncludeValidPerson() {
        PersonDAO dao = new PersonDAO();
        Person person = new Person(1, "John Doe", 30);
        person.addEmail(new Email(1, "john.doe@example.com"));

        assertTrue(dao.isValidToInclude(person).isEmpty());
    }

    @Test
    public void testIsValidToIncludeInvalidName() {
        PersonDAO dao = new PersonDAO();
        Person person = new Person(1, "John123", 30);
        person.addEmail(new Email(1, "john.doe@example.com"));

        assertFalse(dao.isValidToInclude(person).isEmpty());
    }

    @Test
    public void testIsValidToIncludeInvalidAge() {
        PersonDAO dao = new PersonDAO();
        Person person = new Person(1, "John Doe", 250);
        person.addEmail(new Email(1, "john.doe@example.com"));

        assertFalse(dao.isValidToInclude(person).isEmpty());
    }

    @Test
    public void testIsValidToIncludeNoEmail() {
        PersonDAO dao = new PersonDAO();
        Person person = new Person(1, "John Doe", 30);

        assertFalse(dao.isValidToInclude(person).isEmpty());
    }

    @Test
    public void testIsValidToIncludeInvalidEmailFormat() {
        PersonDAO dao = new PersonDAO();
        Person person = new Person(1, "John Doe", 30);
        person.addEmail(new Email(1, "invalid_email"));

        assertFalse(dao.isValidToInclude(person).isEmpty());
    }
}

