package com.proyecto.daos;

import java.util.ArrayList;

import com.proyecto.beans.StadiumBean;
import com.proyecto.entidades.Stadium;

public interface IStadiumDAO {

	public void registrarEstadio(Stadium estadio);

	public ArrayList<Stadium> listaDeEstadios();

	public Stadium consultarEstadios(int id);

	public void update(Stadium estadio);

	public void delete(Integer id);
}