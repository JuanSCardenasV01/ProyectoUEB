package co.edu.unbosque.model;

//La clase ClasicomanosDTO representa a un ciclista de "Clasicomanos" en el sistema. 
//Extiende la clase CiclistaDTO, lo que significa que hereda 
//todos los atributos y métodos de la clase CiclistaDTO.
public class ClasicomanosDTO extends CiclistaDTO{
private float velocidadPromPedaleo;

// constructores
public ClasicomanosDTO() {
	// TODO Auto-generated constructor stub
}

public ClasicomanosDTO(float velocidadPromPedaleo) {
	super();
	this.velocidadPromPedaleo = velocidadPromPedaleo;
}

public ClasicomanosDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais, float velocidadPromPedaleo) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	this.velocidadPromPedaleo = velocidadPromPedaleo;
}

public ClasicomanosDTO(int id, int tiempoAcumulado, String especialidad, String contextura, String equipo,
		String pais) {
	super(id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}

public ClasicomanosDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}

public ClasicomanosDTO(String genero, String correo, String contraseña, String nombre) {
	super(genero, correo, contraseña, nombre);
	// TODO Auto-generated constructor stub
}

//getter & setters
public float getVelocidadPromPedaleo() {
	return velocidadPromPedaleo;
}

public void setVelocidadPromPedaleo(float velocidadPromPedaleo) {
	this.velocidadPromPedaleo = velocidadPromPedaleo;
}

// to string
@Override
public String toString() {
	return super.toString() + "\n Velocidad Promedio de Pedaleo: " + velocidadPromPedaleo;
}






}