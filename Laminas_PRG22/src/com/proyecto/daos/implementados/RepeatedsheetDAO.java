package com.proyecto.daos.implementados;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.proyecto.beans.RepeatedsheetBean;
import com.proyecto.daos.IRepeatedsheetDAO;
import com.proyecto.entidades.Repeatedsheet;
import com.proyecto.entidades.User;
import com.proyecto.util.Conexion;


public class RepeatedsheetDAO implements IRepeatedsheetDAO{

	@Override
	public void registrarRepeatedSheet(Repeatedsheet repeated) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(repeated);
		t.commit();
	}

	@Override
	public ArrayList<Repeatedsheet> listaRepeatedSheet() {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from Repeatedsheets").list();
		t.commit();
		return (ArrayList<Repeatedsheet>) lista;
	}

	@Override
	public Repeatedsheet consultarRepeatedSheet(int id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		return (Repeatedsheet) session.load(Repeatedsheet.class, id);
	}

	@Override
	public void update(Repeatedsheet repeated) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(repeated);
		t.commit();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(consultarRepeatedSheet(id));
		t.commit();
	}

	
}