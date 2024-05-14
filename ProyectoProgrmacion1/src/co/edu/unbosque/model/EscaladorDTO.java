package co.edu.unbosque.model;


//La clase EscaladorDTO representa a un ciclista "Escalador" en
//el sistema. Extiende la clase CiclistaDTO, lo que significa que hereda
//todos los atributos y métodos de la clase CiclistaDTO.
public class EscaladorDTO extends CiclistaDTO {
private float aceleracionPromedio;
private float gradoRamapaMax;

//constructores
public EscaladorDTO() {
	// TODO Auto-generated constructor stub
}

public EscaladorDTO(float aceleracionPromedio, float gradoRamapaMax) {
	super();
	this.aceleracionPromedio = aceleracionPromedio;
	this.gradoRamapaMax = gradoRamapaMax;
}

public EscaladorDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais, float aceleracionPromedio,
		float gradoRamapaMax) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	this.aceleracionPromedio = aceleracionPromedio;
	this.gradoRamapaMax = gradoRamapaMax;
}

public EscaladorDTO(int id, int tiempoAcumulado, String especialidad, String contextura, String equipo, String pais) {
	super(id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}

public EscaladorDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}

public EscaladorDTO(String genero, String correo, String contraseña, String nombre) {
	super(genero, correo, contraseña, nombre);
	// TODO Auto-generated constructor stub
}

//getters y stters
public float getAceleracionPromedio() {
	return aceleracionPromedio;
}

public void setAceleracionPromedio(float aceleracionPromedio) {
	this.aceleracionPromedio = aceleracionPromedio;
}

public float getGradoRamapaMax() {
	return gradoRamapaMax;
}

public void setGradoRamapaMax(float gradoRamapaMax) {
	this.gradoRamapaMax = gradoRamapaMax;
}

@Override
public String toString() {
	return super.toString() + "Aceleracion Promedio: " + aceleracionPromedio + "Grado Ramapa Maxima: " + gradoRamapaMax;
} 







}