package com.proyecto.daos;

import com.proyecto.entidades.Audit;

import java.util.List;

public interface IAuditDAO {

 public void save(Audit auditoria);

 public List<Audit> list();

}