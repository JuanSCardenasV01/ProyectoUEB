package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ClasicomanosDTO;

public class ClasicomanosDAO implements CRUDOperation <ClasicomanosDTO>{
	private ArrayList<ClasicomanosDTO> list;
	private final String FILE_NAME = "datos/Clasicomanos.csv";
	private final String SERIALIZED_FILE_NAME = "datos/Clasicomanos.maap";

	public ClasicomanosDAO() {
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
			sbBuilder.append(list.get(i).getId());
			sbBuilder.append(list.get(i).getTiempoAcumulado());
			sbBuilder.append(list.get(i).getEspecialidad());
			sbBuilder.append(list.get(i).getContextura());
			sbBuilder.append(list.get(i).getEquipo());
			sbBuilder.append(list.get(i).getPais());
			sbBuilder.append(list.get(i).getEspecialidad());
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
			ClasicomanosDTO temp = new ClasicomanosDTO();
			temp.setGenero((columnas[0]));
			temp.setCorreo((columnas[1]));
			temp.setContraseña((columnas[2]));
			temp.setNombre(columnas[3]);
			temp.setId(Integer.parseInt(columnas[4]));
			temp.setTiempoAcumulado(Integer.parseInt(columnas[5]));
			temp.setEspecialidad(columnas[6]);
			temp.setContextura(columnas[7]);
			temp.setEquipo(columnas[8]);
			temp.setPais(columnas[9]);
			temp.setVelocidadPromPedaleo(Float.parseFloat(columnas[10]));
			list.add(temp);
		}
	}

	public void leerDesdeArchivoSerializado() {
		Object contenido = FileHandler.abrirYLeerSerializado(SERIALIZED_FILE_NAME);
		if (contenido == null) {
			list = new ArrayList<>();

		} else {
			list = (ArrayList<ClasicomanosDTO>) contenido;
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

	public ClasicomanosDTO getLast() {
		return list.get(list.size() - 1);
	}

	public void create(ClasicomanosDTO data) {
		list.add(data);
		FileHandler.abrirYEscribirSerializado(SERIALIZED_FILE_NAME, list);
		escribirArchivo();
	}

	public String readAll() {
		StringBuilder sb = new StringBuilder("Lista de Clasicomanoss \n");
		list.forEach((e) -> {
			sb.append(e.toString());
		});
		return sb.toString();
	}

	public String update(int index, ClasicomanosDTO newData) {
		if (index < 0) {
			return "Posiciones no pueden ser negativas";
		}
		if (index >= list.size()) {
			return "El indice se ha pasado del tamaño de la lista, tamaño actual: " + list.size() + " datos";
		}
		list.set(index, newData);
		escribirArchivo();
		return "Clasicomanos actualizada con éxito";
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
		return "Clasicomanos en el indice " + index + " eliminado con exito";
	}
	public ArrayList<ClasicomanosDTO> getList() {
		return list;
	}

	public void setList(ArrayList<ClasicomanosDTO> list) {
		this.list = list;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIALIZED_FILE_NAME() {
		return SERIALIZED_FILE_NAME;
	}

	public ArrayList<ClasicomanosDTO> getlist() {
		return list;
	}

	public void setlist(ArrayList<ClasicomanosDTO> list) {
		this.list = list;
	}
}
