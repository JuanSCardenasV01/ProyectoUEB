package co.edu.unbosque.model;

public class SprintersDTO extends CiclistaDTO {
private float potenciaPromPedaleo;
private float velocidadPromSprint;

public SprintersDTO() {
	// TODO Auto-generated constructor stub
}

public SprintersDTO(float potenciaPromPedaleo, float velocidadPromSprint) {
	super();
	this.potenciaPromPedaleo = potenciaPromPedaleo;
	this.velocidadPromSprint = velocidadPromSprint;
}

public SprintersDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais, float potenciaPromPedaleo,
		float velocidadPromSprint) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	this.potenciaPromPedaleo = potenciaPromPedaleo;
	this.velocidadPromSprint = velocidadPromSprint;
}

public SprintersDTO(int id, int tiempoAcumulado, String especialidad, String contextura, String equipo, String pais) {
	super(id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}

public SprintersDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}

public SprintersDTO(String genero, String correo, String contraseña, String nombre) {
	super(genero, correo, contraseña, nombre);
	// TODO Auto-generated constructor stub
}

public float getPotenciaPromPedaleo() {
	return potenciaPromPedaleo;
}

public void setPotenciaPromPedaleo(float potenciaPromPedaleo) {
	this.potenciaPromPedaleo = potenciaPromPedaleo;
}

public float getVelocidadPromSprint() {
	return velocidadPromSprint;
}

public void setVelocidadPromSprint(float velocidadPromSprint) {
	this.velocidadPromSprint = velocidadPromSprint;
}

@Override
public String toString() {
	return super.toString() + "Sprinters: Potencia Promedio de Pedaleo: " + potenciaPromPedaleo + "\nVelocidad Promedio Sprint: " + velocidadPromSprint;
}


}