package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.MasajistaDTO;

public class MasajistaDAO implements CRUDOperation<MasajistaDTO>{
	private ArrayList<MasajistaDTO> list;
	private final String FILE_NAME = "datos/Masajista.csv";
	private final String SERIALIZED_FILE_NAME = "datos/Masajista.maap";

	public MasajistaDAO() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
	
		
		escribirArchivo();
	}
	public void escribirArchivo() {
		StringBuilder sbBuilder = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sbBuilder.append(list.get(i).getGenero());
			sbBuilder.append(list.get(i).getCorreo());
			sbBuilder.append(list.get(i).getContraseña());
			sbBuilder.append(list.get(i).getNombre()).append(";");
			sbBuilder.append(list.get(i).getAniosExperiencia());
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
			MasajistaDTO temp = new MasajistaDTO();
			temp.setGenero((columnas[0]));
			temp.setCorreo((columnas[1]));
			temp.setContraseña((columnas[2]));
			temp.setNombre(columnas[3]);
			temp.setAniosExperiencia(Integer.parseInt(columnas[4]));
			list.add(temp);
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

	public MasajistaDTO getLast() {
		return list.get(list.size() - 1);
	}
	@Override
	public void create(MasajistaDTO data) {
		list.add(data);
		FileHandler.abrirYEscribirSerializado(SERIALIZED_FILE_NAME, list);
		escribirArchivo();
	}

	public String readAll() {
		StringBuilder sb = new StringBuilder("Lista de Masajistas \n");
		list.forEach((e) -> {
			sb.append(e.toString());
		});
		return sb.toString();
	}

	public String update(int index, MasajistaDTO newData) {
		if (index < 0) {
			return "Posiciones no pueden ser negativas";
		}
		if (index >= list.size()) {
			return "El indice se ha pasado del tamaño de la lista, tamaño actual: " + list.size() + " datos";
		}
		list.set(index, newData);
		escribirArchivo();
		return "Masajista actualizada con éxito";
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
		return "Masajista en el indice " + index + " eliminado con exito";
	}
	public ArrayList<MasajistaDTO> getList() {
		return list;
	}

	public void setList(ArrayList<MasajistaDTO> list) {
		this.list = list;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIALIZED_FILE_NAME() {
		return SERIALIZED_FILE_NAME;
	}

	public ArrayList<MasajistaDTO> getlist() {
		return list;
	}

	public void setlist(ArrayList<MasajistaDTO> list) {
		this.list = list;
	}
}
