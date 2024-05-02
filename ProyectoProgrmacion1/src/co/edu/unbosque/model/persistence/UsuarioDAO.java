package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.UsuarioDTO;



public class UsuarioDAO implements CRUDOperation <UsuarioDTO> {
private ArrayList<UsuarioDTO> list;
private final String FILE_NAME = "datos/Ususario.csv";
private final String SERIALIZED_FILE_NAME = "datos/Ususario.maap";

public UsuarioDAO() {
	// TODO Auto-generated constructor stub
	list = new ArrayList<>();
	leerArchivo();
	leerDesdeArchivoSerializado();
	escribirArchivo();
}
public void escribirArchivo() {
	StringBuilder sbBuilder = new StringBuilder();
	for (int i = 0; i < list.size(); i++) {
		sbBuilder.append(list.get(i).getGenero());
		sbBuilder.append(list.get(i).getCorreo());
		sbBuilder.append(list.get(i).getContraseña());
		sbBuilder.append(list.get(i).getNombre()).append(";");
		if (i < list.size() - 1) {
			sbBuilder.append("\n");
		}
	}
	FileHandler.abrirYEscribirArchivo(FILE_NAME, sbBuilder.toString());
}

public void leerArchivo() {
	String contenido = FileHandler.abrirYLeerArchivo(FILE_NAME);
	if (contenido.equals("")) {
		list = new ArrayList<>();
		return;
	}
	list = new ArrayList<>();
	String[] filas = contenido.split("\n");
	for (int i = 0; i < filas.length; i++) {
		String[] columnas = filas[i].split(";");
		UsuarioDTO temp = new UsuarioDTO();
		temp.setGenero((columnas[0]));
		temp.setCorreo((columnas[1]));
		temp.setContraseña((columnas[2]));
		temp.setNombre(columnas[3]);
		list.add(temp);
	}
}

public void leerDesdeArchivoSerializado() {
	Object contenido = FileHandler.abrirYLeerSerializado(SERIALIZED_FILE_NAME);
	if (contenido == null) {
		list = new ArrayList<>();

	} else {
		list = (ArrayList<UsuarioDTO>) contenido;
	}
}

public String checkIndex(int index) {
	if (index < 0) {
		return "n";
	}
	if (index >= list.size()) {
		return "o";
	}
	return "g";
}

public UsuarioDTO getLast() {
	return list.get(list.size() - 1);
}

public void create(UsuarioDTO data) {
	list.add(data);
	FileHandler.abrirYEscribirSerializado(SERIALIZED_FILE_NAME, list);
	escribirArchivo();
}

public String readAll() {
	StringBuilder sb = new StringBuilder("Lista de Usuarios \n");
	list.forEach((e) -> {
		sb.append(e.toString());
	});
	return sb.toString();
}

public String update(int index, UsuarioDTO newData) {
	if (index < 0) {
		return "Posiciones no pueden ser negativas";
	}
	if (index >= list.size()) {
		return "El indice se ha pasado del tamaño de la lista, tamaño actual: " + list.size() + " datos";
	}
	list.set(index, newData);
	escribirArchivo();
	return "Usuario actualizada con éxito";
}

public String delete(int index) {
	if (index < 0) {
		return "Posiciones no pueden ser negativas";
	}
	if (index >= list.size()) {
		return "El indice se ha pasado del tamaño de la lista, tamaño actual: " + list.size() + " datos";
	}
	list.remove(index);
	escribirArchivo();
	return "Usuario en el indice " + index + " eliminado con exito";
}
public ArrayList<UsuarioDTO> getList() {
	return list;
}

public void setList(ArrayList<UsuarioDTO> list) {
	this.list = list;
}

public String getFILE_NAME() {
	return FILE_NAME;
}

public String getSERIALIZED_FILE_NAME() {
	return SERIALIZED_FILE_NAME;
}

public ArrayList<UsuarioDTO> getlist() {
	return list;
}

public void setlist(ArrayList<UsuarioDTO> list) {
	this.list = list;
}
}
