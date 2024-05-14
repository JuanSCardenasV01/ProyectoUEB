package co.edu.unbosque.model;

//La clase DirectorDTO representa a un director en el sistema.
//Extiende la clase UsuarioDTO, lo que significa que hereda
//todos los atributos y métodos de la clase UsuarioDTO.
public class DirectorDTO extends UsuarioDTO {
private String nacionalidad;

//constructores
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

//getter y setter
public String getNacionalidad() {
	return nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}

//to string
@Override
public String toString() {
	return "DirectorDTO [nacionalidad=" + nacionalidad + ", getGenero()=" + getGenero() + ", getCorreo()=" + getCorreo()
			+ ", getContraseña()=" + getContraseña() + ", getNombre()=" + getNombre() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

}
