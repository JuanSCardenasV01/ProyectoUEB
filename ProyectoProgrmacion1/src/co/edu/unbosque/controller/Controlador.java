//Esta clase es el controlador de la aplicación. Se encarga de manejar los eventos
//generados por la vista (ventanas) e interactuar con el modelo (datos) a través de la fachada del modelo.
//implementa la interfaz `ActionListener` para responder a los eventos de los botones.

package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import org.w3c.dom.UserDataHandler;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

	private ViewFacade vF;
	private ModelFacade mF;

	public Controlador() {
		//Fachada de la vista que provee métodos para acceder a los elementos de la interfaz gráfica.
		vF = new ViewFacade();
	    //Fachada del modelo que provee métodos para acceder y manipular los datos de la aplicación.
		mF = new ModelFacade();
		asignarLectores();

	}
	//Inicia la aplicación haciendo visible la ventana de login.
	public void run() {
		vF.getVenRe().setVisible(true);

	}
	//Asigna los lectoresa los botones de las distintas ventanas.
	private void asignarLectores() {
		vF.getVenLog().getBtnLogin().addActionListener(this);
		vF.getVenLog().getBtnLogin().setActionCommand("btnLogin");
		vF.getVenLog().getBtnRegister().addActionListener(this);
		vF.getVenLog().getBtnRegister().setActionCommand("btnVRegister");
		vF.getVenRe().getBtnBack().addActionListener(this);
		vF.getVenRe().getBtnBack().setActionCommand("btnBack");
		vF.getVenPA().getBtnLogout().addActionListener(this);
		vF.getVenPA().getBtnLogout().setActionCommand("btnLogout");
		vF.getVenPA().getBtn1().addActionListener(this);
		vF.getVenPA().getBtn1().setActionCommand("btn1");
		vF.getVenPA().getBtn2().addActionListener(this);
		vF.getVenPA().getBtn2().setActionCommand("btn2");
		vF.getVenPA().getBtn3().addActionListener(this);
		vF.getVenPA().getBtn3().setActionCommand("btn3");
		vF.getVenPA().getBtn4().addActionListener(this);
		vF.getVenPA().getBtn4().setActionCommand("btn4");
		vF.getVenRe().getBtnRegister().addActionListener(this);
		vF.getVenRe().getBtnRegister().setActionCommand("btnRegister");

	}
//	Responde a los eventos generados por los botones de la interfaz. Este método se invoca
//    cada vez que se presiona un botón u otro elemento con un escucha de eventos asignado.
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		//oculta la ventana de login y obtener credenciales del usuario
		case "btnLogin": {
			 vF.getVenLog().setVisible(false);
			    String user = vF.getVenLog().getFieldUser().getText();
			    String password = vF.getVenLog().getFieldPassword().getText();
			    UsuarioDTO usuario = mF.getUsuarioDAO().buscarUsuario(user, password); // Implementa este método en tu DAO

                // Buscar el usuario en el modelo 
			    if (usuario != null) {
			        if (user.equals("admin") && password.equals("123")) {
			            vF.getVenPA().setVisible(true); // Mostrar panel de administrador
			        } else {
			        	JOptionPane.showMessageDialog(null, null, "Panel en Proceso", JOptionPane.INFORMATION_MESSAGE);
			        }
			    } else {
			        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
			        
			    }
			  break; 
		}
		//mantiene la ventana login oculta y muestra la de registro.
		case "btnVRegister":{
			vF.getVenLog().setVisible(false);
			vF.getVenRe().setVisible(true);
			break;
		}
		//muestra la ventana login y oculta la de registro.
		case "btnBack":{
			vF.getVenRe().setVisible(false);
			vF.getVenLog().setVisible(true);
			break;
		}
		//oculta el panel administrador y muestra la ventana login
		case "btnLogout":{
			vF.getVenPA().setVisible(false);
			vF.getVenLog().setVisible(true);
			break;
		}
		case "btn1":{
            // Ocultar todos los paneles
            vF.getVenPA().getPanel2().setVisible(false);
            vF.getVenPA().getPanel3().setVisible(false);
            vF.getVenPA().getPanel4().setVisible(false);
            // Mostrar el panel correspondiente
            vF.getVenPA().getPanel1().setVisible(true);
            break;
        }
        case "btn2":{
            // Ocultar todos los paneles
            vF.getVenPA().getPanel1().setVisible(false);
            vF.getVenPA().getPanel3().setVisible(false);
            vF.getVenPA().getPanel4().setVisible(false);
            // Mostrar el panel correspondiente
            vF.getVenPA().getPanel2().setVisible(true);
            break;
        }
        case "btn3":{
            // Ocultar todos los paneles
            vF.getVenPA().getPanel1().setVisible(false);
            vF.getVenPA().getPanel2().setVisible(false);
            vF.getVenPA().getPanel4().setVisible(false);
            // Mostrar el panel correspondiente
            vF.getVenPA().getPanel3().setVisible(true);
            break;
        }
        case "btn4":{
            // Ocultar todos los paneles
            vF.getVenPA().getPanel1().setVisible(false);
            vF.getVenPA().getPanel2().setVisible(false);
            vF.getVenPA().getPanel3().setVisible(false);
            // Mostrar el panel correspondiente
            vF.getVenPA().getPanel4().setVisible(true);
            break;
        }
        
        case "btnRegister": { // Caso para el botón "btnRegister"
            // Obtener los datos del formulario de registro
            String nombre = vF.getVenRe().getFieldName().getText();
            String correo = vF.getVenRe().getFieldUser().getText();
            String contraseña = vF.getVenRe().getFieldPassword().getText();
            String genero = (String) vF.getVenRe().getComboBox().getSelectedItem();

            // Crear un objeto UsuarioDTO con los datos del formulario
            UsuarioDTO usuario = new UsuarioDTO(genero, correo, contraseña, nombre);

            // Llamar al método del DAO para crear el usuario en el modelo (implementar en tu DAO)
            mF.getUsuarioDAO().create(usuario);

            // Mostrar un mensaje de confirmación al usuario
            JOptionPane.showMessageDialog(null, null, "Usuario Creado", JOptionPane.INFORMATION_MESSAGE);
            break;
        }
		
		
		}

	}

}
