package com.proyecto.entidades;
// Generated 16/12/2015 08:26:41 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "news")
public class New implements java.io.Serializable {
	private static final long serialVersionUID = -9196613827283824774L;

	private int id;
	private Date dataNews;
	private String shortDescription;
	private int largeDescription;
	private int idUser;
	private String state;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false, length = 5)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateNews", length = 19)
	public Date getDataNews() {
		return dataNews;
	}

	public void setDataNews(Date dataNews) {
		this.dataNews = dataNews;
	}


	@Column(name = "shortDescription", length = 60)
	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	@Column(name = "largeDescription", length = 120)
	public int getLargeDescription() {
		return largeDescription;
	}

	public void setLargeDescription(int largeDescription) {
		this.largeDescription = largeDescription;
	}

	@Column(name = "idUser", length = 5)
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@Column(name = "state", length = 1)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}