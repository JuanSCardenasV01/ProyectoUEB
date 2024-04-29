package co.edu.unbosque.model;

public class EscaladorDTO extends UsuarioDTO {
private float aceleracionPromedio;
private float gradoRamapaMax;
private int id;
private int tiempoAcumulado;
private String especialidad;
private String contextura;
private String equipo;
private String pais;
public EscaladorDTO() {
	// TODO Auto-generated constructor stub
}
public EscaladorDTO(String genero, String correo, String contraseña, String nombre) {
	super(genero, correo, contraseña, nombre);
	// TODO Auto-generated constructor stub
}
public EscaladorDTO(float aceleracionPromedio, float gradoRamapaMax, int id, int tiempoAcumulado, String especialidad,
		String contextura, String equipo, String pais) {
	super();
	this.aceleracionPromedio = aceleracionPromedio;
	this.gradoRamapaMax = gradoRamapaMax;
	this.id = id;
	this.tiempoAcumulado = tiempoAcumulado;
	this.especialidad = especialidad;
	this.contextura = contextura;
	this.equipo = equipo;
	this.pais = pais;
}
public EscaladorDTO(String genero, String correo, String contraseña, String nombre, float aceleracionPromedio,
		float gradoRamapaMax, int id, int tiempoAcumulado, String especialidad, String contextura, String equipo,
		String pais) {
	super(genero, correo, contraseña, nombre);
	this.aceleracionPromedio = aceleracionPromedio;
	this.gradoRamapaMax = gradoRamapaMax;
	this.id = id;
	this.tiempoAcumulado = tiempoAcumulado;
	this.especialidad = especialidad;
	this.contextura = contextura;
	this.equipo = equipo;
	this.pais = pais;
}
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
	return "EscaladorDTO [aceleracionPromedio=" + aceleracionPromedio + ", gradoRamapaMax=" + gradoRamapaMax + ", id="
			+ id + ", tiempoAcumulado=" + tiempoAcumulado + ", especialidad=" + especialidad + ", contextura="
			+ contextura + ", equipo=" + equipo + ", pais=" + pais + ", getGenero()=" + getGenero() + ", getCorreo()="
			+ getCorreo() + ", getContraseña()=" + getContraseña() + ", getNombre()=" + getNombre() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}


}
