package com.proyecto.daos;

import java.util.ArrayList;

import com.proyecto.beans.ParameterBean;
import com.proyecto.entidades.Parameter;

public interface IParameterDAO {

	public void agregarParameter(Parameter parameter);

	public ArrayList<Parameter> listaParameter();

	public Parameter consultarParameter(int id);

	public void update(Parameter parameter);

	public void delete(Integer id);
}