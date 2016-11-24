package org.ogm.postit.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_USER")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEC_USER")
	@SequenceGenerator(name="SEC_USER", sequenceName = "SEC_USER")	
	@Column(name="ID")
	private Long id = null;
	
	@Column(name="USER_ID")
	private String user = null;
	
	@Column(name="NAME")
	private String nombre = null;
	
	@Column(name="EMAIL")
	private String email = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
