package com.proyecto.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NewBean {

	private Long id;
	
	private String dataNews;
	
	private String shortDescription;
	
	private int largeDescription;
	
	private int idUser;
	
	private String state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataNews() {
		return dataNews;
	}

	public void setDataNews(String dataNews) {
		this.dataNews = dataNews;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public int getLargeDescription() {
		return largeDescription;
	}

	public void setLargeDescription(int largeDescription) {
		this.largeDescription = largeDescription;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}