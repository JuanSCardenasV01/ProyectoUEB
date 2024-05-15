package co.edu.unbosque.model.persistence;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandler {
	private static File archivo;
	private static Scanner lectorArchivo;
	private static PrintWriter escritorArchivo;
	// Serializable
	private static FileInputStream fis; // ir y buscar el archivo
	private static ObjectInputStream ois; // lee un objeto completo entrado en un archivo por fis

	private static FileOutputStream fos; // va y busca el archivo
	private static ObjectOutputStream oos;

	public static void verificarFolderDatos() {
		archivo = new File("data");
		if (archivo.mkdir()) {
			System.out.println("Carpeta creada por primera vez en " + archivo.toURI());

		}

	}

	public static void abrirYEscribirSerializado(String url, Object contenido) {
		archivo = new File(url);

		try {
			if (!archivo.exists()) {
				archivo.createNewFile();

			}

			fos = new FileOutputStream(archivo);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(contenido);
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("Problemas al abrir el archivo serealizado (escritura)");
			e.printStackTrace();
		}
	}
	
		
		
		
	


	public static String abrirYLeerArchivo(String url) {
		String contenido = "";
		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			lectorArchivo = new Scanner(archivo);
			while (lectorArchivo.hasNext()) {
				contenido += lectorArchivo.nextLine() + "\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		lectorArchivo.close();
		return contenido;
	}

	public static void abrirYEscribirArchivo(String url, String contenido) {
		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			escritorArchivo = new PrintWriter(archivo);
			escritorArchivo.println(contenido);
		} catch (IOException e) {
			e.printStackTrace();
		}
		escritorArchivo.close();
	}
}