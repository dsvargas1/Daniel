package com.proyecto.daos.implementados;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.proyecto.beans.ParameterBean;
import com.proyecto.daos.IParameterDAO;
import com.proyecto.entidades.Parameter;
import com.proyecto.entidades.User;
import com.proyecto.util.Conexion;



public class ParameterDAO implements IParameterDAO{

	@Override
	public void agregarParameter(Parameter parameter) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(parameter);
		t.commit();
	}

	@Override
	public ArrayList<Parameter> listaParameter() {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from Parameter").list();
		t.commit();
		return (ArrayList<Parameter>) lista;
	}

	@Override
	public Parameter consultarParameter(int id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		return (Parameter) session.load(Parameter.class, id);
	}

	@Override
	public void update(Parameter parameter) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(parameter);
		t.commit();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(consultarParameter(id));
		t.commit();
	}

	
}