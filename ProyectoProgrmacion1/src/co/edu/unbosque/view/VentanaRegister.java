package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class VentanaRegister extends JFrame {

	private JPanel panelLogin;
	private JLabel textTittle;
	private JLabel textName;
	private JLabel textUser;
	private JLabel textPassword;
	private JLabel textGender;
	private JLabel textOcupation;
	private JTextField fieldName;
	private JTextField fieldUser;
	private JPasswordField fieldPassword;
	private JComboBox<String> comboBoxGender;
	private JComboBox<String> comboBoxOcupation;
	private JButton btnBack;
	private JButton btnRegister;
	private JSeparator line1;
	private JSeparator line2;
	private JSeparator line3;
	private String[] gender = { "Masculino", "Femenino", "No decirlo", "Batman" };
	private String[] ocupation = { "Masajista", "Director", "Ciclicista", "Clasicomano","Contrarelojista", "Escalador", "Gregario", "Rodador","Sprinter",};

	public VentanaRegister() {
		setSize(800, 500);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panelLogin = new JPanel();
		panelLogin.setLayout(null);
		panelLogin.setBounds(0, 0, 800, 500);
		panelLogin.setBackground(new Color(255, 255, 255));

		textTittle = new JLabel();
		textTittle.setText("REGISTER TO ISUCI");
		textTittle.setBounds(250, 10, 320, 40);
		textTittle.setForeground(new Color(118, 116, 103));
		textTittle.setFont(new Font("Tahoma", Font.BOLD, 30));

		textName = new JLabel();
		textName.setText("Name");
		textName.setBounds(80, 50, 50, 30);
		textName.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldName = new JTextField();
		fieldName.setBounds(80, 75, 320, 25);
		fieldName.setFont(new Font("Tahoma", 0, 15));
		fieldName.setBorder(null);

		line1 = new JSeparator();
		line1.setBounds(80, 105, 250, 20);
		line1.setForeground(Color.black);

		textUser = new JLabel();
		textUser.setText("Mail");
		textUser.setBounds(80, 120, 50, 30);
		textUser.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldUser = new JTextField();
		fieldUser.setBounds(80, 145, 320, 25);
		fieldUser.setFont(new Font("Tahoma", 0, 15));
		fieldUser.setBorder(null);

		line2 = new JSeparator();
		line2.setBounds(80, 175, 250, 20);
		line2.setForeground(Color.black);

		textPassword = new JLabel();
		textPassword.setText("Password");
		textPassword.setBounds(80, 190, 90, 30);
		textPassword.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldPassword = new JPasswordField();
		fieldPassword.setBounds(80, 215, 320, 25);
		fieldPassword.setFont(new Font("", 0, 25));
		fieldPassword.setBorder(null);

		line3 = new JSeparator();
		line3.setBounds(80, 245, 250, 20);
		line3.setForeground(Color.black);

		textGender = new JLabel();
		textGender.setText("Gender");
		textGender.setBounds(80, 260, 90, 30);
		textGender.setFont(new Font("Tahoma", Font.BOLD, 15));

		comboBoxGender = new JComboBox<>(gender);
		comboBoxGender.setBounds(80, 310, 100, 20);
		comboBoxGender.setBorder(null);
		
		textOcupation = new JLabel();
		textOcupation.setText("Ocupation");
		textOcupation.setBounds(230, 260, 90, 30);
		textOcupation.setFont(new Font("Tahoma", Font.BOLD, 15));

		comboBoxOcupation = new JComboBox<>(ocupation);
		comboBoxOcupation.setBounds(230, 310, 100, 20);
		comboBoxOcupation.setBorder(null);

		btnBack = new JButton("Back");
		btnBack.setBounds(420, 380, 180, 30);
		btnBack.setBackground(new Color(133, 153, 30));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBorderPainted(false);

		btnRegister = new JButton("Register");
		btnRegister.setBounds(180, 380, 180, 30);
		btnRegister.setBackground(new Color(212, 146, 52));
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.setBorderPainted(false);

		add(panelLogin);
		panelLogin.add(textTittle);
		panelLogin.add(textName);
		panelLogin.add(fieldName);
		panelLogin.add(line1);
		panelLogin.add(textUser);
		panelLogin.add(fieldUser);
		panelLogin.add(line2);
		panelLogin.add(textPassword);
		panelLogin.add(fieldPassword);
		panelLogin.add(line3);
		panelLogin.add(textPassword);
		panelLogin.add(fieldPassword);
		panelLogin.add(textGender);
		panelLogin.add(comboBoxGender);
		panelLogin.add(textOcupation);
		panelLogin.add(comboBoxOcupation);
		panelLogin.add(btnBack);
		panelLogin.add(btnRegister);

	}

	public JPanel getPanelLogin() {
		return panelLogin;
	}

	public void setPanelLogin(JPanel panelLogin) {
		this.panelLogin = panelLogin;
	}

	public JLabel getTextTittle() {
		return textTittle;
	}

	public void setTextTittle(JLabel textTittle) {
		this.textTittle = textTittle;
	}

	public JLabel getTextName() {
		return textName;
	}

	public void setTextName(JLabel textName) {
		this.textName = textName;
	}

	public JLabel getTextUser() {
		return textUser;
	}

	public void setTextUser(JLabel textUser) {
		this.textUser = textUser;
	}

	public JLabel getTextPassword() {
		return textPassword;
	}

	public void setTextPassword(JLabel textPassword) {
		this.textPassword = textPassword;
	}

	public JLabel getTextGender() {
		return textGender;
	}

	public void setTextGender(JLabel textGender) {
		this.textGender = textGender;
	}


	public JTextField getFieldName() {
		return fieldName;
	}

	public void setFieldName(JTextField fieldName) {
		this.fieldName = fieldName;
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

	public JComboBox<String> getComboBox() {
		return comboBoxGender;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBoxGender = comboBox;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public JButton getBtnRegister() {
		return btnRegister;
	}

	public void setBtnRegister(JButton btnRegister) {
		this.btnRegister = btnRegister;
	}

	public JSeparator getLine1() {
		return line1;
	}

	public void setLine1(JSeparator line1) {
		this.line1 = line1;
	}

	public JSeparator getLine2() {
		return line2;
	}

	public void setLine2(JSeparator line2) {
		this.line2 = line2;
	}

	public JSeparator getLine3() {
		return line3;
	}

	public void setLine3(JSeparator line3) {
		this.line3 = line3;
	}

	public JLabel getTextOcupation() {
		return textOcupation;
	}

	public void setTextOcupation(JLabel textOcupation) {
		this.textOcupation = textOcupation;
	}

	public JComboBox<String> getComboBoxGender() {
		return comboBoxGender;
	}

	public void setComboBoxGender(JComboBox<String> comboBoxGender) {
		this.comboBoxGender = comboBoxGender;
	}

	public JComboBox<String> getComboBoxOcupation() {
		return comboBoxOcupation;
	}

	public void setComboBoxOcupation(JComboBox<String> comboBoxOcupation) {
		this.comboBoxOcupation = comboBoxOcupation;
	}

	public String[] getGender() {
		return gender;
	}

	public void setGender(String[] gender) {
		this.gender = gender;
	}

	public String[] getOcupation() {
		return ocupation;
	}

	public void setOcupation(String[] ocupation) {
		this.ocupation = ocupation;
	}


	
	

}
