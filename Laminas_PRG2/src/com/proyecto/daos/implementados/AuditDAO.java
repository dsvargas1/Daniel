package com.proyecto.daos.implementados;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.proyecto.daos.IAuditDAO;
import com.proyecto.entidades.Audit;
import com.proyecto.entidades.User;
import com.proyecto.util.Conexion;

public class AuditDAO implements IAuditDAO{

	@Override
	public void save(Audit auditoria) {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(auditoria);
		t.commit();
	}

	@Override
	public List<Audit> list() {
		// TODO Auto-generated method stub
		Session session = Conexion.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from Audit").list();
		t.commit();
		return (ArrayList<Audit>) lista;
	}
}