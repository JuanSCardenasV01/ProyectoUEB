package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class VentanaLogin extends JFrame {

	private JPanel panelLogin;
	private JLabel textTittle;
	private JLabel textUser;
	private JLabel textPassword;
	private JLabel logo;
	private JTextField fieldUser;
	private JPasswordField fieldPassword;
	private JButton btnLogin;
	private JButton btnRegister;
	private JSeparator line1;
	private JSeparator line2;

	public VentanaLogin() {
		setSize(800, 500);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		logo = new JLabel();
		logo.setBounds(450, 0, 350, 500);

		ImageIcon img = new ImageIcon("src/co/edu/unbosque/view/image/a.jpg");
		Icon icon = new ImageIcon(
				img.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
		logo.setIcon(icon);

		panelLogin = new JPanel();
		panelLogin.setLayout(null);
		panelLogin.setBounds(0, 0, 800, 500);
		panelLogin.setBackground(new Color(255, 255, 255));
		
		textTittle = new JLabel();
		textTittle.setText("LOGIN");
		textTittle.setBounds(160, 50, 200, 70);
		textTittle.setForeground(new Color(118, 116, 103));
		textTittle.setFont(new Font("Tahoma", Font.BOLD, 50));

		textUser = new JLabel();
		textUser.setText("User");
		textUser.setBounds(80, 145, 50, 30);
		textUser.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldUser = new JTextField();
		fieldUser.setBounds(80, 180, 320, 25);
		fieldUser.setFont(new Font("Tahoma", 0, 15));
		fieldUser.setBorder(null);

		line1 = new JSeparator();
		line1.setBounds(80, 205, 320, 20);
		line1.setForeground(Color.black);

		textPassword = new JLabel();
		textPassword.setText("Password");
		textPassword.setBounds(80, 225, 90, 30);
		textPassword.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldPassword = new JPasswordField();
		fieldPassword.setBounds(80, 260, 320, 25);
		fieldPassword.setFont(new Font("", 0, 25));
		fieldPassword.setBorder(null);

		line2 = new JSeparator();
		line2.setBounds(80, 285, 320, 20);
		line2.setForeground(Color.black);

		btnLogin = new JButton("Login");
		btnLogin.setBounds(150, 330, 180, 30);
		btnLogin.setBackground(new Color(133, 153, 30));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBorderPainted(false);

		btnRegister = new JButton("Register");
		btnRegister.setBounds(150, 380, 180, 30);
		btnRegister.setBackground(new Color(212, 146, 52));
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.setBorderPainted(false);

		add(panelLogin);
		panelLogin.add(textTittle);
		panelLogin.add(logo);
		panelLogin.add(textUser);
		panelLogin.add(fieldUser);
		panelLogin.add(line1);
		panelLogin.add(textPassword);
		panelLogin.add(fieldPassword);
		panelLogin.add(line2);
		panelLogin.add(btnLogin);
		panelLogin.add(btnRegister);

		
	}

	public JTextField getFieldUser() {
		return fieldUser;
	}

	public void setFieldUser(JTextField fieldUser) {
		this.fieldUser = fieldUser;
	}

	public JPasswordField getFieldPassword() {
		return fieldPassword;
	}

	public void setFieldPassword(JPasswordField fieldPassword) {
		this.fieldPassword = fieldPassword;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JButton getBtnRegister() {
		return btnRegister;
	}

	public void setBtnRegister(JButton btnRegister) {
		this.btnRegister = btnRegister;
	}

	public JPanel getPanelLogin() {
		return panelLogin;
	}

	public void setPanelLogin(JPanel panelLogin) {
		this.panelLogin = panelLogin;
	}

	
	
	
	
}
