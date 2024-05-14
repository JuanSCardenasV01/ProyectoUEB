package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.DirectorDAO;
import co.edu.unbosque.model.persistence.UsuarioDAO;

//La clase ModelFacade actúa como una fachada para la capa 
//de modelo en la aplicación. Proporciona un punto de acceso único a los objetos de Acceso a Datos (DAO)
//utilizados para interactuar con la base de datos.
public class ModelFacade {
	private UsuarioDAO usuarioDAO;
	private DirectorDAO directorDAO;
	
	public ModelFacade() {
		usuarioDAO = new UsuarioDAO();
		directorDAO = new DirectorDAO();
	}

	
	//getters y setter
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
