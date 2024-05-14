package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.DirectorDAO;
import co.edu.unbosque.model.persistence.UsuarioDAO;

public class ModelFacade {
	private UsuarioDAO usuarioDAO;
	private DirectorDAO directorDAO;
	
	public ModelFacade() {
		usuarioDAO = new UsuarioDAO();
		directorDAO = new DirectorDAO();
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	public DirectorDAO getDirectorDAO() {
		return directorDAO;
	}

	public void setDirectorDAO(DirectorDAO directorDAO) {
		this.directorDAO = directorDAO;
	}
	
	
	
	

}
