package co.edu.unbosque.model;
import java.io.Serializable;

//La clase UsuarioDTO representa a un usuario en el sistema. 
//Implementa la interfaz Serializable, la cual permite que los objetos de esta clase se conviertan a un flujo de bytes (serialización) 
//y se vuelvan a crear a partir de ese flujo (deserialización).
public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String genero;
	private String correo;
	private String contraseña;
	private String nombre;

	//constructores
	public UsuarioDTO() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioDTO(String genero, String correo, String contraseña, String nombre) {
		super();
		this.genero = genero;
		this.correo = correo;
		this.contraseña = contraseña;
		this.nombre = nombre;
	}

	//getters y stters
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Usuario: genero:" + genero + "\n El correo es:" + correo + "\n contraseña:" + contraseña + "\n nombre="
				+ nombre + "";
	}

}
