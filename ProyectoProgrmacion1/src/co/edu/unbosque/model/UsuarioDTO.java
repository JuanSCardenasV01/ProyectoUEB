package co.edu.unbosque.model;
import java.io.Serializable;
public class UsuarioDTO {
private String genero;
private String correo;
private String contraseña;
private String nombre;
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
	return "Usuario: genero:" + genero + "\n El correo es:" + correo + "\n contraseña:" + contraseña + "\n nombre=" + nombre
			+ "";
}


}
