 package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CiclistaDTO;

public class CiclistaDAO implements CRUDOperation <CiclistaDTO>{
	private ArrayList<CiclistaDTO> list;
	private final String FILE_NAME = "datos/Ciclista.csv";
	private final String SERIALIZED_FILE_NAME = "datos/Ciclista.maap";

	public CiclistaDAO() {
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
			sbBuilder.append(list.get(i).getId());
			sbBuilder.append(list.get(i).getTiempoAcumulado());
			sbBuilder.append(list.get(i).getContextura());
			sbBuilder.append(list.get(i).getEquipo());
			sbBuilder.append(list.get(i).getPais());
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
			CiclistaDTO temp = new CiclistaDTO();
			temp.setGenero((columnas[0]));
			temp.setCorreo((columnas[1]));
			temp.setContraseña((columnas[2]));
			temp.setNombre(columnas[3]);
			temp.setId(Integer.parseInt(columnas[4]));
			temp.setTiempoAcumulado(Integer.parseInt(columnas[5]));
			temp.setContextura(columnas[6]);
			temp.setEquipo(columnas[7]);
			temp.setPais(columnas[8]);
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

	public CiclistaDTO getLast() {
		return list.get(list.size() - 1);
	}
@Override
	public void create(CiclistaDTO data) {
		list.add(data);
		FileHandler.abrirYEscribirSerializado(SERIALIZED_FILE_NAME, list);
		escribirArchivo();
	}
@Override
	public String readAll() {
		StringBuilder sb = new StringBuilder("Lista de Ciclistas \n");
		list.forEach((e) -> {
			sb.append(e.toString());
		});
		return sb.toString();
	}
@Override
	public String update(int index, CiclistaDTO newData) {
		if (index < 0) {
			return "Posiciones no pueden ser negativas";
		}
		if (index >= list.size()) {
			return "El indice se ha pasado del tamaño de la lista, tamaño actual: " + list.size() + " datos";
		}
		list.set(index, newData);
		escribirArchivo();
		return "Ciclista actualizada con éxito";
	}
@Override
	public String delete(int index) {
		if (index < 0) {
			return "Posiciones no pueden ser negativas";
		}
		if (index >= list.size()) {
			return "El indice se ha pasado del tamaño de la lista, tamaño actual: " + list.size() + " datos";
		}
		list.remove(index);
		escribirArchivo();
		return "Ciclista en el indice " + index + " eliminado con exito";
	}
	public ArrayList<CiclistaDTO> getList() {
		return list;
	}

	public void setList(ArrayList<CiclistaDTO> list) {
		this.list = list;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIALIZED_FILE_NAME() {
		return SERIALIZED_FILE_NAME;
	}

	public ArrayList<CiclistaDTO> getlist() {
		return list;
	}

	public void setlist(ArrayList<CiclistaDTO> list) {
		this.list = list;
	}
}
