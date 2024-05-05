package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.UsuarioDAO;

public class ModelFacade {
	private UsuarioDAO usuarioDAO;
	
	public ModelFacade() {
		usuarioDAO = new UsuarioDAO();
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	

}
