package com.proyecto.daos.implementados;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.proyecto.beans.NewBean;
import com.proyecto.daos.INewDAO;
import com.proyecto.entidades.New;
import com.proyecto.entidades.User;
import com.proyecto.util.Conexion;

public class NewDAO implements INewDAO{

	@Override
	public void agregarNoticia(New noticia) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(noticia);
		t.commit();
	}

	@Override
	public ArrayList<New> listaDeNoticias() {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from News").list();
		t.commit();
		return (ArrayList<New>) lista;
	}

	@Override
	public New consultarNoticias(int id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		return (New) session.load(New.class, id);
	}

	@Override
	public void update(New noticia) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(noticia);
		t.commit();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(consultarNoticias(id));
		t.commit();
	}
}