package com.proyecto.daos;

import java.util.ArrayList;

import com.proyecto.beans.RepeatedsheetBean;
import com.proyecto.entidades.Repeatedsheet;

public interface IRepeatedsheetDAO {

	public void registrarRepeatedSheet(Repeatedsheet repeated);

	public ArrayList<Repeatedsheet> listaRepeatedSheet();

	public Repeatedsheet consultarRepeatedSheet(int id);

	public void update(Repeatedsheet repeated);

	public void delete(Integer id);
}