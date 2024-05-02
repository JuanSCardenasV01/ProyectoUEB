package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.w3c.dom.UserDataHandler;

import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

	private ViewFacade vF;

	public Controlador() {
		vF = new ViewFacade();
		asignarLectores();

	}

	public void run() {
		vF.getVenLog().setVisible(true);

	}

	private void asignarLectores() {
		vF.getVenLog().getBtnLogin().addActionListener(this);
		vF.getVenLog().getBtnLogin().setActionCommand("btnLogin");
		vF.getVenLog().getBtnRegister().addActionListener(this);
		vF.getVenLog().getBtnRegister().setActionCommand("btnRegister");
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

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {

		case "btnLogin": {
			vF.getVenLog().setVisible(false);
			String user = vF.getVenLog().getFieldUser().getText();
			String password = vF.getVenLog().getFieldPassword().getText();
			if (user.equals("admin") && password.equals("123")) {
				vF.getVenPA().setVisible(true);
				break;
			}
			break;
		}
		case "btnRegister":{
			vF.getVenLog().setVisible(false);
			vF.getVenRe().setVisible(true);
			break;
		}
		case "btnBack":{
			vF.getVenRe().setVisible(false);
			vF.getVenLog().setVisible(true);
			break;
		}
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
		
		
		}

	}

}
