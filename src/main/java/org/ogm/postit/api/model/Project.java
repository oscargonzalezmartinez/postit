package org.ogm.postit.api.model;

import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "T_PROJECT")
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEC_PROJECT")
	@SequenceGenerator(name="SEC_PROJECT", sequenceName = "SEC_PROJECT")	
	@Column(name="ID")
	private Long id = null;
	
	@Column(name="TITLE",length=50)
	private String title = null;
	
	@Column(name="DESCRIPTION",length=100)
	private String description = null;
	
	@OneToMany(mappedBy="project")
	private Collection<Postit> postits = null;
	
	@JsonIgnore
	  @ManyToMany(fetch=FetchType.LAZY)
	  @JoinTable(
	      name="USER_PROJECTS",
	      joinColumns=@JoinColumn(name="PROJECT_ID", referencedColumnName="ID"),
	      inverseJoinColumns=@JoinColumn(name="USER_ID", referencedColumnName="ID"))
	  private List<User> users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Postit> getPostits() {
		return postits;
	}

	public void setPostits(Collection<Postit> postits) {
		this.postits = postits;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
