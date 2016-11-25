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
	
	  @ManyToMany(fetch=FetchType.LAZY)
	  @JoinTable(
	      name="USER_PROJECTS",
	      joinColumns=@JoinColumn(name="PROJECT_ID", referencedColumnName="ID"),
	      inverseJoinColumns=@JoinColumn(name="USER_ID", referencedColumnName="ID"))
	  private List<User> users;
}
