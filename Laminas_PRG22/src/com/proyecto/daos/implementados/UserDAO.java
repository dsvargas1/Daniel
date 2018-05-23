package com.proyecto.daos.implementados;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.proyecto.beans.UserBean;
import com.proyecto.daos.IUserDAO;
import com.proyecto.entidades.User;
import com.proyecto.util.Conexion;

public class UserDAO implements IUserDAO{

	@Override
	public void registrarUsuario(User user) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(user);
		t.commit();
	}

	@Override
	public ArrayList<User> listaDeUsuarios() {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from User").list();
		t.commit();
		return (ArrayList<User>) lista;
	}

	@Override
	public User consultarUsuarios(int id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		return (User) session.load(User.class, id);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(user);
		t.commit();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(consultarUsuarios(id));
		t.commit();
	}
}