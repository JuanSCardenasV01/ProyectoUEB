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
		vF.getVenUsu().setVisible(true);
		
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
		vF.getVenPA().getBtnPanelShowU().addActionListener(this);
		vF.getVenPA().getBtnPanelShowU().setActionCommand("btnPanelShowU");
		vF.getVenPA().getBtnPanelDeleteU().addActionListener(this);
		vF.getVenPA().getBtnPanelDeleteU().setActionCommand("btnPanelDeleteU");
		vF.getVenPA().getBtnPanelShowT().addActionListener(this);
		vF.getVenPA().getBtnPanelShowT().setActionCommand("btnPanelShowT");
		vF.getVenPA().getBtnPanelDeleteT().addActionListener(this);
		vF.getVenPA().getBtnPanelDeleteT().setActionCommand("btnPanelDeleteT");
		vF.getVenRe().getBtnRegister().addActionListener(this);
		vF.getVenRe().getBtnRegister().setActionCommand("btnRegister");
		vF.getVenRe().getComboBoxOcupation().addActionListener(this);
		vF.getVenRe().getComboBoxOcupation().setActionCommand("comboBoxG");
		vF.getVenUsu().getBtnViewRaces().addActionListener(this);
		vF.getVenUsu().getBtnViewRaces().setActionCommand("btnViewRaces");
		vF.getVenUsu().getBtnCreateTeam().addActionListener(this);
		vF.getVenUsu().getBtnCreateTeam().setActionCommand("btnCreateTeam");
		vF.getVenUsu().getBtnOtherTeams().addActionListener(this);
		vF.getVenUsu().getBtnOtherTeams().setActionCommand("btnOtherTeams");
		vF.getVenUsu().getBtnUpdateProfile().addActionListener(this);
		vF.getVenUsu().getBtnUpdateProfile().setActionCommand("bnUpdateProfile");

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
					vF.getVenUsu().setVisible(false);
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
		case "btnPanelShowU": {
			// Ocultar todos los paneles
			vF.getVenPA().getPanelDeleteU().setVisible(false);
			vF.getVenPA().getPanelShowT().setVisible(false);
			vF.getVenPA().getPanelDeleteT().setVisible(false);
			// Mostrar el panel correspondiente
			vF.getVenPA().getPanelShowU().setVisible(true);
			break;
		}
		case "btnPanelDeleteU": {
			// Ocultar todos los paneles
			vF.getVenPA().getPanelShowU().setVisible(false);
			vF.getVenPA().getPanelShowT().setVisible(false);
			vF.getVenPA().getPanelDeleteT().setVisible(false);
			// Mostrar el panel correspondiente
			vF.getVenPA().getPanelDeleteU().setVisible(true);
			break;
		}
		case "btnPanelShowT": {
			// Ocultar todos los paneles
			vF.getVenPA().getPanelShowU().setVisible(false);
			vF.getVenPA().getPanelDeleteU().setVisible(false);
			vF.getVenPA().getPanelDeleteT().setVisible(false);
			// Mostrar el panel correspondiente
			vF.getVenPA().getPanelShowT().setVisible(true);
			break;
		}
		case "btnPanelDeleteT": {
			// Ocultar todos los paneles
			vF.getVenPA().getPanelShowU().setVisible(false);
			vF.getVenPA().getPanelDeleteU().setVisible(false);
			vF.getVenPA().getPanelShowT().setVisible(false);
			// Mostrar el panel correspondiente
			vF.getVenPA().getPanelDeleteT().setVisible(true);
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
				vF.getVenRe().getPanelClassicalCyclist().setVisible(false);
				vF.getVenRe().getPanelCounterCyclist().setVisible(false);
				vF.getVenRe().getPanelClassicalCyclist().setVisible(false);
				break;
			}
			case"Time Trialist":{
				vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(false);
				vF.getVenRe().getPanelCyclist().setVisible(true);
				vF.getVenRe().getPanelCounterCyclist().setVisible(true);
				 break;
			}
			case "Climber":{
				vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(false);
				vF.getVenRe().getPanelCyclist().setVisible(true);
				vF.getVenRe().getPanelClimber().setVisible(true);
				break;
			}
			case "Rider":{
				vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(false);vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(false);
				vF.getVenRe().getPanelRider().setVisible(true);
				vF.getVenRe().getPanelCyclist().setVisible(true);
				break;
			}
			case "Classical Cyclist":{
				vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(false);vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(false);
				vF.getVenRe().getPanelRider().setVisible(false);
				vF.getVenRe().getPanelCyclist().setVisible(true);
				vF.getVenRe().getPanelClassicalCyclist().setVisible(true);
				break;
			}
			case "Gregarius":{
				vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(false);vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(false);
				vF.getVenRe().getPanelRider().setVisible(false);
				vF.getVenRe().getPanelCyclist().setVisible(true);
				vF.getVenRe().getPanelGregarious().setVisible(true);
				break;
			}
			case "Sprinter":{
				vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(false);vF.getVenRe().getPanelMasseur().setVisible(false);
				vF.getVenRe().getPanelDirector().setVisible(false);
				vF.getVenRe().getPanelRider().setVisible(false);
				vF.getVenRe().getPanelCyclist().setVisible(true);
				vF.getVenRe().getPanelGregarious().setVisible(false);
				vF.getVenRe().getPanelSprinter().setVisible(true);
				break;
			}
			}

			break;
		}
		
		
		// USURIO
		case "btnViewRaces": {
			vF.getVenUsu().getPanelViewRaces().setVisible(true);
			vF.getVenUsu().getPanelCreateTeam().setVisible(false);
			vF.getVenUsu().getPanelViewOtherTeams().setVisible(false);
			vF.getVenUsu().getPanelUpdateProfile().setVisible(false);
			break;
		}
		case "btnCreateTeam": {
			vF.getVenUsu().getPanelViewRaces().setVisible(false);
			vF.getVenUsu().getPanelCreateTeam().setVisible(true);
			vF.getVenUsu().getPanelViewOtherTeams().setVisible(false);
			vF.getVenUsu().getPanelUpdateProfile().setVisible(false);
			break;
		}
		case "btnOtherTeams": {
			vF.getVenUsu().getPanelViewRaces().setVisible(false);
			vF.getVenUsu().getPanelCreateTeam().setVisible(false);
			vF.getVenUsu().getPanelViewOtherTeams().setVisible(true);
			vF.getVenUsu().getPanelUpdateProfile().setVisible(false);
			break;
		}
		case "bnUpdateProfile": {
			vF.getVenUsu().getPanelViewRaces().setVisible(false);
			vF.getVenUsu().getPanelCreateTeam().setVisible(false);
			vF.getVenUsu().getPanelViewOtherTeams().setVisible(false);
			vF.getVenUsu().getPanelUpdateProfile().setVisible(true);
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
