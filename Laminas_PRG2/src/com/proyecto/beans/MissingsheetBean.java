package com.proyecto.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MissingsheetBean {

	private int id;

	private int countSheets;

	private int numberSheets;

	private int userId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCountSheets() {
		return countSheets;
	}

	public void setCountSheets(int countSheets) {
		this.countSheets = countSheets;
	}

	public int getNumberSheets() {
		return numberSheets;
	}

	public void setNumberSheets(int numberSheets) {
		this.numberSheets = numberSheets;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}