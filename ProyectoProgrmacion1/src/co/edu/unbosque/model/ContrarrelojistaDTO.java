package co.edu.unbosque.model;

public class ContrarrelojistaDTO extends CiclistaDTO{
private float velMaxima;


public ContrarrelojistaDTO() {
	// TODO Auto-generated constructor stub
}


public ContrarrelojistaDTO(float velMaxima) {
	super();
	this.velMaxima = velMaxima;
}


public ContrarrelojistaDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais, float velMaxima) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	this.velMaxima = velMaxima;
}


public ContrarrelojistaDTO(int id, int tiempoAcumulado, String especialidad, String contextura, String equipo,
		String pais) {
	super(id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}


public ContrarrelojistaDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}


public ContrarrelojistaDTO(String genero, String correo, String contraseña, String nombre) {
	super(genero, correo, contraseña, nombre);
	// TODO Auto-generated constructor stub
}


public float getVelMaxima() {
	return velMaxima;
}


public void setVelMaxima(float velMaxima) {
	this.velMaxima = velMaxima;
}


@Override
public String toString() {
	return super.toString() + "ContrarrelojistaDTO [velMaxima=" + velMaxima + "]";
}


}