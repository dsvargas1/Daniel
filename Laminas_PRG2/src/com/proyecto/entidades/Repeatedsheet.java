package com.proyecto.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="repeatedsheets")
public class Repeatedsheet implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private int countSheets;

	private int numberSheets;

	private int userId;

	public Repeatedsheet() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false, length = 5)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "countSheets", length = 2)
	public int getCountSheets() {
		return this.countSheets;
	}

	public void setCountSheets(int countSheets) {
		this.countSheets = countSheets;
	}

	@Column(name = "numberSheets", length = 2)
	public int getNumberSheets() {
		return this.numberSheets;
	}

	public void setNumberSheets(int numberSheets) {
		this.numberSheets = numberSheets;
	}

	@Column(name = "userId", length = 5)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}