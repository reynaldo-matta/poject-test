package br.com.test.contact.service;

import java.util.List;

import br.com.test.contact.domain.Contact;

public interface ContactService {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
