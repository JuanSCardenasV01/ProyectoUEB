package co.edu.unbosque.model;


//La clase RodadoresDTO representa a un ciclista "Rodador" 
//en el sistema. Extiende la clase CiclistaDTO, lo que significa que hereda
//todos los atributos y métodos de la clase CiclistaDTO.
public class RodadoresDTO extends CiclistaDTO {
private float velocidadPromedioPendiente;
// constructores
public RodadoresDTO() {
	// TODO Auto-generated constructor stub
}

public RodadoresDTO(float velocidadPromedioPendiente) {
	super();
	this.velocidadPromedioPendiente = velocidadPromedioPendiente;
}

public RodadoresDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais, float velocidadPromedioPendiente) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	this.velocidadPromedioPendiente = velocidadPromedioPendiente;
}

public RodadoresDTO(int id, int tiempoAcumulado, String especialidad, String contextura, String equipo, String pais) {
	super(id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}

public RodadoresDTO(String genero, String correo, String contraseña, String nombre, int id, int tiempoAcumulado,
		String especialidad, String contextura, String equipo, String pais) {
	super(genero, correo, contraseña, nombre, id, tiempoAcumulado, especialidad, contextura, equipo, pais);
	// TODO Auto-generated constructor stub
}

public RodadoresDTO(String genero, String correo, String contraseña, String nombre) {
	super(genero, correo, contraseña, nombre);
	// TODO Auto-generated constructor stub
}

public float getVelocidadPromedioPendiente() {
	return velocidadPromedioPendiente;
}


//getters y setter
public void setVelocidadPromedioPendiente(float velocidadPromedioPendiente) {
	this.velocidadPromedioPendiente = velocidadPromedioPendiente;
}

@Override
public String toString() {
	return super.toString() + "\n Velocidad Promedio Pendiente: " + velocidadPromedioPendiente;
}




}