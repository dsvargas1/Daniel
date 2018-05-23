package com.proyecto.daos.implementados;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.proyecto.beans.StadiumBean;
import com.proyecto.daos.IStadiumDAO;
import com.proyecto.entidades.Stadium;
import com.proyecto.entidades.User;
import com.proyecto.util.Conexion;



public class StadiumDAO implements IStadiumDAO{

	@Override
	public void registrarEstadio(Stadium estadio) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(estadio);
		t.commit();
	}

	@Override
	public ArrayList<Stadium> listaDeEstadios() {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from Stadium").list();
		t.commit();
		return (ArrayList<Stadium>) lista;
	}

	@Override
	public Stadium consultarEstadios(int id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		return (Stadium) session.load(Stadium.class, id);
	}

	@Override
	public void update(Stadium estadio) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(estadio);
		t.commit();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(consultarEstadios(id));
		t.commit();
	}

	
}