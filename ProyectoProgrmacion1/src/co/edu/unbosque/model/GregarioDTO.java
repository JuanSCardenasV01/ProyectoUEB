package co.edu.unbosque.model;

public class GregarioDTO extends UsuarioDTO {
private String funcionPeloton;
private int id;
private int tiempoAcumulado;
private String especialidad;
private String contextura;
private String equipo;
private String pais;
public GregarioDTO() {
	// TODO Auto-generated constructor stub
}
public GregarioDTO(String genero, String correo, String contraseña, String nombre) {
	super(genero, correo, contraseña, nombre);
	// TODO Auto-generated constructor stub
}
public GregarioDTO(String funcionPeloton, int id, int tiempoAcumulado, String especialidad, String contextura,
		String equipo, String pais) {
	super();
	this.funcionPeloton = funcionPeloton;
	this.id = id;
	this.tiempoAcumulado = tiempoAcumulado;
	this.especialidad = especialidad;
	this.contextura = contextura;
	this.equipo = equipo;
	this.pais = pais;
}
public GregarioDTO(String genero, String correo, String contraseña, String nombre, String funcionPeloton, int id,
		int tiempoAcumulado, String especialidad, String contextura, String equipo, String pais) {
	super(genero, correo, contraseña, nombre);
	this.funcionPeloton = funcionPeloton;
	this.id = id;
	this.tiempoAcumulado = tiempoAcumulado;
	this.especialidad = especialidad;
	this.contextura = contextura;
	this.equipo = equipo;
	this.pais = pais;
}
@Override
public String toString() {
	return "GregarioDTO [funcionPeloton=" + funcionPeloton + ", id=" + id + ", tiempoAcumulado=" + tiempoAcumulado
			+ ", especialidad=" + especialidad + ", contextura=" + contextura + ", equipo=" + equipo + ", pais=" + pais
			+ ", getGenero()=" + getGenero() + ", getCorreo()=" + getCorreo() + ", getContraseña()=" + getContraseña()
			+ ", getNombre()=" + getNombre() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

}
