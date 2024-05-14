package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import org.w3c.dom.UserDataHandler;

import co.edu.unbosque.model.DirectorDTO;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

//	Constructor de la clase Controlador.
//	Inicializa las instancias de ViewFacade y ModelFacade,
//    y asigna los ActionListeners a los botones y combobox.

	private ViewFacade vF;
	private ModelFacade mF;

	public Controlador() {
		vF = new ViewFacade();
		mF = new ModelFacade();
		asignarLectores();

	}

	// Método que hace visible la ventana de registro inicialmente.
	public void run() {
		vF.getVenRe().setVisible(true);

	}

	// Método que asigna ActionListeners a los botones y combobox para escuchar
	// eventos.
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
		vF.getVenRe().getComboBoxOcupation().addActionListener(this);
		vF.getVenRe().getComboBoxOcupation().setActionCommand("comboBoxG");

	}

	// Método que maneja los eventos de los botones y combobox.
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
//		Maneja el clic en el botón "Iniciar sesión" en la ventana de inicio de sesión.
//		Valida las credenciales del usuario y muestra el panel correspondiente (administrador o usuario).
		case "btnLogin": {
			vF.getVenLog().setVisible(false);
			String user = vF.getVenLog().getFieldUser().getText();
			String password = vF.getVenLog().getFieldPassword().getText();
			UsuarioDTO usuario = mF.getUsuarioDAO().buscarUsuario(user, password); // Implementa este método en tu DAO

			if (usuario != null) {
				if (user.equals("admin") && password.equals("123")) {
					vF.getVenPA().setVisible(true); // Mostrar panel de administrador
				} else {
					vF.getVenUsu().setVisible(true);
					vF.getVenUsu().getTextAdmin().setText(user);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error de inicio de sesión",
						JOptionPane.ERROR_MESSAGE);

			}
			break;
		}
		
//		Maneja el clic en el botón "Registrarse" en la ventana de inicio de sesión.
//		Oculta la ventana de inicio de sesión y muestra la ventana de registro.
		case "btnVRegister": {
			vF.getVenLog().setVisible(false);
			vF.getVenRe().setVisible(true);
			break;
		}
//		Maneja el clic en el botón "Atrás" en la ventana de registro.
//		Oculta la ventana de registro y muestra la ventana de inicio de sesión.
		case "btnBack": {
			vF.getVenRe().setVisible(false);
			vF.getVenLog().setVisible(true);
			break;
		}
		
//		Maneja el clic en el botón "Cerrar sesión" en el panel del administrador.
//		Oculta el panel del administrador y muestra la ventana de inicio de sesión.
		case "btnLogout": {
			vF.getVenPA().setVisible(false);
			vF.getVenLog().setVisible(true);
			break;
		}
		case "btn1": {
			// Ocultar todos los paneles
			vF.getVenPA().getPanel2().setVisible(false);
			vF.getVenPA().getPanel3().setVisible(false);
			vF.getVenPA().getPanel4().setVisible(false);
			// Mostrar el panel correspondiente
			vF.getVenPA().getPanel1().setVisible(true);
			break;
		}
		case "btn2": {
			// Ocultar todos los paneles
			vF.getVenPA().getPanel1().setVisible(false);
			vF.getVenPA().getPanel3().setVisible(false);
			vF.getVenPA().getPanel4().setVisible(false);
			// Mostrar el panel correspondiente
			vF.getVenPA().getPanel2().setVisible(true);
			break;
		}
		case "btn3": {
			// Ocultar todos los paneles
			vF.getVenPA().getPanel1().setVisible(false);
			vF.getVenPA().getPanel2().setVisible(false);
			vF.getVenPA().getPanel4().setVisible(false);
			// Mostrar el panel correspondiente
			vF.getVenPA().getPanel3().setVisible(true);
			break;
		}
		case "btn4": {
			// Ocultar todos los paneles
			vF.getVenPA().getPanel1().setVisible(false);
			vF.getVenPA().getPanel2().setVisible(false);
			vF.getVenPA().getPanel3().setVisible(false);
			// Mostrar el panel correspondiente
			vF.getVenPA().getPanel4().setVisible(true);
			break;
		}
//		Maneja el cambio de selección en el combobox de ocupación en la ventana de registro.
//		Muestra el panel correspondiente (masajista o director) según la ocupación seleccionada.
		case "comboBoxG": {
			String selectedOcupation = (String) vF.getVenRe().getComboBoxOcupation().getSelectedItem();
			switch (selectedOcupation) {
			case "Massage": {
				vF.getVenRe().getPanelMasseur().setVisible(true);
				vF.getVenRe().getPanelDirector().setVisible(false);
				vF.getVenRe().getPanelCyclist().setVisible(false);
				break;
			}
			case "Director": {
				vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(true);
				vF.getVenRe().getPanelCyclist().setVisible(false);
				break;
			}
			case "Cyclicist": {
				vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(false);
				vF.getVenRe().getPanelCyclist().setVisible(true);
				break;
			}
			}

			break;
		}
//		Maneja el clic en el botón "Registrarse" en la ventana de registro.
//		Crea nuevos objetos UsuarioDTO y DirectorDTO basados en la información ingresada.
//		Guarda el nuevo usuario y director en la base de datos.
//		Muestra un mensaje de éxito.
		case "btnRegister": {
			String nombre = vF.getVenRe().getFieldName().getText();
			String correo = vF.getVenRe().getFieldUser().getText();
			String contraseña = vF.getVenRe().getFieldPassword().getText();
			String genero = (String) vF.getVenRe().getComboBox().getSelectedItem();
			String nacionalidad = vF.getVenRe().getFieldDirector().getText();
			mF.getUsuarioDAO().create(new UsuarioDTO(genero, correo, contraseña, nombre));
			mF.getDirectorDAO().create(new DirectorDTO(genero, correo, contraseña, nombre, nacionalidad));
			JOptionPane.showMessageDialog(null, null, "Usuario Creado", JOptionPane.INFORMATION_MESSAGE);

		}

		}

	}

}
