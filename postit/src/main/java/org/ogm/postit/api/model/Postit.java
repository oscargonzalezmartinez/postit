package org.ogm.postit.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_POSTIT")
public class Postit {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEC_POSTIT")
	@SequenceGenerator(name="SEC_POSTIT", sequenceName = "SEC_POSTIT")	
	@Column(name="ID")
	private Long id = null;
	@Column(name="ID_USER")
	private Long userId = null;
	@Column(name="TITLE",length=100)
	private String title = null;
	@Column(name="COLOR",length=7)
	private String color = null;
	@Column(name="TEXT",length=500)
	private String text = null;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
