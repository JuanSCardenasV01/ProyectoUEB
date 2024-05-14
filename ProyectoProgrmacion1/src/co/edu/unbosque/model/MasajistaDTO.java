package co.edu.unbosque.model;

//La clase MasajistaDTO representa a un masajista en el sistema. 
//Extiende la clase UsuarioDTO, lo que significa que hereda 
//todos los atributos y métodos de la clase UsuarioDTO.
public class MasajistaDTO extends UsuarioDTO{
private int AniosExperiencia;

//constructores
public MasajistaDTO() {
	// TODO Auto-generated constructor stub
}
public MasajistaDTO(String genero, String correo, String contraseña, String nombre) {
	super(genero, correo, contraseña, nombre);
	// TODO Auto-generated constructor stub
}
public MasajistaDTO(int aniosExperiencia) {
	super();
	AniosExperiencia = aniosExperiencia;
}
public MasajistaDTO(String genero, String correo, String contraseña, String nombre, int aniosExperiencia) {
	super(genero, correo, contraseña, nombre);
	AniosExperiencia = aniosExperiencia;
}

//getters y setter
public int getAniosExperiencia() {
	return AniosExperiencia;
}
public void setAniosExperiencia(int aniosExperiencia) {
	AniosExperiencia = aniosExperiencia;
}
@Override
public String toString() {
	return "MasajistaDTO [AniosExperiencia=" + AniosExperiencia + ", getGenero()=" + getGenero() + ", getCorreo()="
			+ getCorreo() + ", getContraseña()=" + getContraseña() + ", getNombre()=" + getNombre() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

}
