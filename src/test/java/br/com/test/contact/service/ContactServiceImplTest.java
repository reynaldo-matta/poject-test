package br.com.test.contact.service;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import br.com.test.contact.dao.ContactDAO;
import br.com.test.contact.domain.Contact;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ContactServiceImplTest {

	private ContactDAO contactDAO;
    private List<Contact> contacts = new ArrayList<Contact>();

    @Before
    public void init(){
        contactDAO = Mockito.mock(ContactDAO.class);

        for(int cont = 1 ; cont <10 ; cont++){
            Contact c = new Contact();
            c.setEmail("Email " + cont);
            c.setFirstname("First "+ cont);
            c.setLastname("Last" + cont);
            c.setId(cont);
            c.setTelephone("2981723" + cont);
            contacts.add(c);
        }

        Mockito.when(contactDAO.listContact()).thenReturn(contacts);
    }

    @Test(expected = RuntimeException.class)
	public void testAddContact() {
        Mockito.doThrow(new RuntimeException()).when(contactDAO).addContact(null);

		contactDAO.addContact(null);
	}

    @Test
	public void testListContact() {
        List<Contact> contactList = contactDAO.listContact();
        Assert.assertEquals(contacts, contactList);
	}

    @Test
	public void testRemoveContact() {
		contactDAO.removeContact(1);
	}
}
