package com.proyecto.beans;

import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import com.proyecto.daos.IUserDAO;
import com.proyecto.daos.implementados.UserDAO;
import com.proyecto.entidades.User;

@ManagedBean
@SessionScoped
public class UserBean {

	private User usuario;
	private DataModel listaUsuarios;

	public String prepararAdicionarUsuario() {
		usuario = new User();
		usuario.setActive("A");
		usuario.setUserType("cliente");
		usuario.setDateLastPassword(new Date());
		return "registrar";
	}

	public String prepararModificarUsuario() {
		usuario = (User) (listaUsuarios.getRowData());
		return "gerenciarUsuario";
	}

	public String eliminarUsuario() {
		User usuarioTemp = (User) (listaUsuarios.getRowData());
		IUserDAO dao = new UserDAO();
		usuarioTemp.setActive("I");
		dao.update(usuarioTemp);
		return "inicio";
	}

	public String adicionarUsuario() {
		IUserDAO dao = new UserDAO();
		dao.registrarUsuario(usuario);
		return "inicio";
	}

	public String modificarUsuario() {
		IUserDAO dao = new UserDAO();
		dao.update(usuario);
		return "inicio";
	}

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

	public DataModel getListarUsuarios() {
		List<User> lista = new UserDAO().listaDeUsuarios();
		listaUsuarios = new ListDataModel(lista);
		return listaUsuarios;
	}

}