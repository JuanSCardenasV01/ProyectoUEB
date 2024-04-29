package co.edu.unbosque.model;

public class ClasicomanosDTO extends UsuarioDTO{
private float velocidadPromPedaleo;
private int id;
private int tiempoAcumulado;
private String especialidad;
private String contextura;
private String equipo;
private String pais;
public ClasicomanosDTO() {
	// TODO Auto-generated constructor stub
}
public ClasicomanosDTO(String genero, String correo, String contraseña, String nombre) {
	super(genero, correo, contraseña, nombre);
	// TODO Auto-generated constructor stub
}
public ClasicomanosDTO(float velocidadPromPedaleo, int id, int tiempoAcumulado, String especialidad, String contextura,
		String equipo, String pais) {
	super();
	this.velocidadPromPedaleo = velocidadPromPedaleo;
	this.id = id;
	this.tiempoAcumulado = tiempoAcumulado;
	this.especialidad = especialidad;
	this.contextura = contextura;
	this.equipo = equipo;
	this.pais = pais;
}
public ClasicomanosDTO(String genero, String correo, String contraseña, String nombre, float velocidadPromPedaleo,
		int id, int tiempoAcumulado, String especialidad, String contextura, String equipo, String pais) {
	super(genero, correo, contraseña, nombre);
	this.velocidadPromPedaleo = velocidadPromPedaleo;
	this.id = id;
	this.tiempoAcumulado = tiempoAcumulado;
	this.especialidad = especialidad;
	this.contextura = contextura;
	this.equipo = equipo;
	this.pais = pais;
}
public float getVelocidadPromPedaleo() {
	return velocidadPromPedaleo;
}
public void setVelocidadPromPedaleo(float velocidadPromPedaleo) {
	this.velocidadPromPedaleo = velocidadPromPedaleo;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTiempoAcumulado() {
	return tiempoAcumulado;
}
public void setTiempoAcumulado(int tiempoAcumulado) {
	this.tiempoAcumulado = tiempoAcumulado;
}
public String getEspecialidad() {
	return especialidad;
}
public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}
public String getContextura() {
	return contextura;
}
public void setContextura(String contextura) {
	this.contextura = contextura;
}
public String getEquipo() {
	return equipo;
}
public void setEquipo(String equipo) {
	this.equipo = equipo;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
@Override
public String toString() {
	return "ClasicomanosDTO [velocidadPromPedaleo=" + velocidadPromPedaleo + ", id=" + id + ", tiempoAcumulado="
			+ tiempoAcumulado + ", especialidad=" + especialidad + ", contextura=" + contextura + ", equipo=" + equipo
			+ ", pais=" + pais + ", getGenero()=" + getGenero() + ", getCorreo()=" + getCorreo() + ", getContraseña()="
			+ getContraseña() + ", getNombre()=" + getNombre() + ", toString()=" + super.toString() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + "]";
}

}
