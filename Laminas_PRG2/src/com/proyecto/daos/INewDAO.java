package com.proyecto.daos;

import java.util.ArrayList;

import com.proyecto.beans.NewBean;
import com.proyecto.entidades.New;

public interface INewDAO {

	public void agregarNoticia(New noticia);

	public ArrayList<New> listaDeNoticias();

	public New consultarNoticias(int id);

	public void update(New noticia);

	public void delete(Integer id);
}