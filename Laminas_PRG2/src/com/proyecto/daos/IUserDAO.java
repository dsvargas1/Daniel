package com.proyecto.daos;

import java.util.ArrayList;

import com.proyecto.beans.UserBean;
import com.proyecto.entidades.User;

public interface IUserDAO {

	public void registrarUsuario(User user);

	public ArrayList<User> listaDeUsuarios();

	public User consultarUsuarios(int id);

	public void update(User user);

	public void delete(Integer id);
}