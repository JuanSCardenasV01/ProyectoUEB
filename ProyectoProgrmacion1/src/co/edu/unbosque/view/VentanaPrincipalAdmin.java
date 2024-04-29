package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class VentanaPrincipalAdmin extends JFrame {

	private JPanel panelAdmin;
	private JPanel panelActions;
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

	public VentanaPrincipalAdmin() {
		setSize(700, 700);
		setLayout(null);
		setLocationRelativeTo(null);

		logo = new JLabel();
		logo.setBounds(5, 5, 100, 100);

		ImageIcon img = new ImageIcon("src/co/edu/unbosque/view/image/rick.gif");
		Icon icon = new ImageIcon(
				img.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
		logo.setIcon(icon);

		panelAdmin = new JPanel();
		panelAdmin.setLayout(null);
		panelAdmin.setBounds(0, 0, 700, 700);
		panelAdmin.setBackground(new Color(255, 255, 255));

		panelActions = new JPanel();
		panelActions.setLayout(null);
		panelActions.setBounds(0, 0, 100, 700);
		panelActions.setBackground(new Color(118, 116, 103));



		textTittle = new JLabel();
		textTittle.setText("ADMIN");
		textTittle.setBounds(20, 120, 100, 50);
		textTittle.setForeground(Color.black);
		textTittle.setFont(new Font("Tahoma", 0, 20));

		textUser = new JLabel();
		textUser.setText("xxxxx");
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

		add(panelAdmin);
		panelAdmin.add(panelActions);
		panelActions.add(textTittle);
		panelActions.add(logo);
		panelAdmin.add(textUser);
		panelAdmin.add(fieldUser);
		panelAdmin.add(line1);
		panelAdmin.add(textPassword);
		panelAdmin.add(fieldPassword);
		panelAdmin.add(line2);
		panelAdmin.add(btnLogin);
		panelAdmin.add(btnRegister);
	}
}
