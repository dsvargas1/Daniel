package com.proyecto.daos;

import java.util.ArrayList;

import com.proyecto.beans.MissingsheetBean;
import com.proyecto.entidades.Missingsheet;

public interface IMissingsheetDAO {

	public void agregarMissingsSheet(Missingsheet miss);

	public ArrayList<Missingsheet> listaMissingSheet();

	public Missingsheet consultarMissingSheet(int id);

	public void update(Missingsheet miss);

	public void delete(Integer id);
}