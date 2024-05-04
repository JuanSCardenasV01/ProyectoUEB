package co.edu.unbosque.model;

public class GregarioDTO extends CiclistaDTO {
private String funcionPeloton;


public GregarioDTO() {
	// TODO Auto-generated constructor stub
}


public GregarioDTO(String funcionPeloton) {
	super();
	this.funcionPeloton = funcionPeloton;
}


public GregarioDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais, String funcionPeloton) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	this.funcionPeloton = funcionPeloton;
}


public GregarioDTO(int id, int tiempoAcumulado, String especialidad, String contextura, String equipo, String pais) {
	super(id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}


public GregarioDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}


public GregarioDTO(String genero, String correo, String contraseña, String nombre) {
	super(genero, correo, contraseña, nombre);
	// TODO Auto-generated constructor stub
}


public String getFuncionPeloton() {
	return funcionPeloton;
}


public void setFuncionPeloton(String funcionPeloton) {
	this.funcionPeloton = funcionPeloton;
}


@Override
public String toString() {
	return super.toString() + "Funcion Peloton:" + funcionPeloton;
}



}