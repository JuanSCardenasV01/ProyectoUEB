package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.DirectorDTO;

public class DirectorDAO implements CRUDOperation <DirectorDTO>{
	private ArrayList<DirectorDTO> list;
	private final String FILE_NAME = "datos/Director.csv";
	private final String SERIALIZED_FILE_NAME = "datos/Director.maap";

	public DirectorDAO() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
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
			sbBuilder.append(list.get(i).getNacionalidad());
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
			DirectorDTO temp = new DirectorDTO();
			temp.setGenero((columnas[0]));
			temp.setCorreo((columnas[1]));
			temp.setContraseña((columnas[2]));
			temp.setNombre(columnas[3]);
			temp.setNacionalidad(columnas[4]);
			list.add(temp);
		}
	}

	public void leerDesdeArchivoSerializado() {
		Object contenido = FileHandler.abrirYLeerSerializado(SERIALIZED_FILE_NAME);
		if (contenido == null) {
			list = new ArrayList<>();

		} else {
			list = (ArrayList<DirectorDTO>) contenido;
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

	public DirectorDTO getLast() {
		return list.get(list.size() - 1);
	}
	@Override
	public void create(DirectorDTO data) {
		list.add(data);
		FileHandler.abrirYEscribirSerializado(SERIALIZED_FILE_NAME, list);
		escribirArchivo();
	}

	public String readAll() {
		StringBuilder sb = new StringBuilder("Lista de Directors \n");
		list.forEach((e) -> {
			sb.append(e.toString());
		});
		return sb.toString();
	}

	public String update(int index, DirectorDTO newData) {
		if (index < 0) {
			return "Posiciones no pueden ser negativas";
		}
		if (index >= list.size()) {
			return "El indice se ha pasado del tamaño de la lista, tamaño actual: " + list.size() + " datos";
		}
		list.set(index, newData);
		escribirArchivo();
		return "Director actualizada con éxito";
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
		return "Director en el indice " + index + " eliminado con exito";
	}
	public ArrayList<DirectorDTO> getList() {
		return list;
	}

	public void setList(ArrayList<DirectorDTO> list) {
		this.list = list;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIALIZED_FILE_NAME() {
		return SERIALIZED_FILE_NAME;
	}

	public ArrayList<DirectorDTO> getlist() {
		return list;
	}

	public void setlist(ArrayList<DirectorDTO> list) {
		this.list = list;
	}
}
