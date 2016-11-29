package org.ogm.postit.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private String name = null;
	
	@Column(name="EMAIL")
	private String email = null;

	@JsonIgnore
	  @ManyToMany(fetch=FetchType.LAZY)
	  @JoinTable(
	      name="USER_PROJECTS",
	      joinColumns=@JoinColumn(name="USER_ID", referencedColumnName="ID"),
	      inverseJoinColumns=@JoinColumn(name="PROJECT_ID", referencedColumnName="ID"))
	  private List<Project> projects;
 
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

	public String getName() {
		return name;
	}

	public void setName(String nombre) {
		this.name = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	

}
