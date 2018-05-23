package com.proyecto.daos.implementados;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.proyecto.beans.MissingsheetBean;
import com.proyecto.daos.IMissingsheetDAO;
import com.proyecto.entidades.Missingsheet;
import com.proyecto.entidades.User;
import com.proyecto.util.Conexion;


public class MissingsheetDAO implements IMissingsheetDAO{

	@Override
	public void agregarMissingsSheet(Missingsheet miss) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(miss);
		t.commit();
	}

	@Override
	public ArrayList<Missingsheet> listaMissingSheet() {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from Missingsheets").list();
		t.commit();
		return (ArrayList<Missingsheet>) lista;
	}

	@Override
	public Missingsheet consultarMissingSheet(int id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		return (Missingsheet) session.load(Missingsheet.class, id);
	}

	@Override
	public void update(Missingsheet miss) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(miss);
		t.commit();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(consultarMissingSheet(id));
		t.commit();
	}
}
	