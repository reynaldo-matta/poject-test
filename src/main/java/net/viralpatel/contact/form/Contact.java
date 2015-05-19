package net.viralpatel.contact.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="CONTACTS")
public class Contact {
	
	public Contact() {
	}
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name="FIRSTNAME")
	@NotEmpty(message="Necessário informar o primeiro nome.")
	private String firstname;

	@Column(name="LASTNAME")
	@NotEmpty(message="Necessário informar o último nome.")
	private String lastname;

	@Column(name="EMAIL")
	@NotEmpty(message="Necessário informar o e-mail.")
	private String email;
	
	@Column(name="TELEPHONE")
	@NotEmpty(message="Necessário informar o Telefone.")
	@Size(min=10, max=10, message="O Tamanho permitido é de 10.")
	private String telephone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}