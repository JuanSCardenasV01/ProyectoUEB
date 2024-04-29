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
		}
		}

	}

}
