//Esta clase sirve como punto de entrada principal para la aplicación.
//Crea una instancia de la clase `Controlador` y llama a su método `run`
//para iniciar la ejecución del programa.

package co.edu.unbosque.controller;

public class AplMain {
public static void main(String[] args) {
	
	//Crea una instancia de la clase Controlador, responsable de la lógica principal de la aplicación. 
	Controlador con = new Controlador();
	
	//Llama al método run del objeto Controlador para iniciar la funcionalidad del programa.
	con.run();
}
}
