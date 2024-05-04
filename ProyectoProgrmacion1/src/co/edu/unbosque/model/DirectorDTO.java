package co.edu.unbosque.model;

public class DirectorDTO extends UsuarioDTO {
private String nacionalidad;
public DirectorDTO() {
	// TODO Auto-generated constructor stub
}
public DirectorDTO(String genero, String correo, String contraseña, String nombre) {
	super(genero, correo, contraseña, nombre);
	// TODO Auto-generated constructor stub
}
public DirectorDTO(String nacionalidad) {
	super();
	this.nacionalidad = nacionalidad;
}
public DirectorDTO(String genero, String correo, String contraseña, String nombre, String nacionalidad) {
	super(genero, correo, contraseña, nombre);
	this.nacionalidad = nacionalidad;
}
public String getNacionalidad() {
	return nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}
@Override
public String toString() {
	return "DirectorDTO [nacionalidad=" + nacionalidad + ", getGenero()=" + getGenero() + ", getCorreo()=" + getCorreo()
			+ ", getContraseña()=" + getContraseña() + ", getNombre()=" + getNombre() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

}
