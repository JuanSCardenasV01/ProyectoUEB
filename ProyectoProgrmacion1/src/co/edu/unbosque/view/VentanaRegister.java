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
	private JPanel panelMasseur;
	private JPanel panelDirector;
	private JPanel panelCyclist;
	private JPanel panelClassicalCyclist;
	private JPanel panelCounterCyclist;
	private JPanel panelClimber;
	private JPanel panelGregarious;
	private JPanel panelRider;
	private JPanel panelSprinter;
	private JLabel textTittle;
	private JLabel textName;
	private JLabel textUser;
	private JLabel textPassword;
	private JLabel textGender;
	private JLabel textOcupation;
	private JLabel textMasseur;
	private JLabel textCyclistAccumTime;
	private JLabel textCyclistTeam;
	private JLabel textCyclistId;
	private JLabel textCyclistContexture;
	private JLabel textCyclistCountry;
	private JLabel textAverageVelRodador;
	private JLabel textAveragePedPowSprinter;
	private JLabel textAveragevelocitySprinter;
	private JLabel textPelotonFunctionGregario;
	private JLabel textAverageAccelEscalador;
	private JLabel textmaxRampDegreeEscalator;
	private JLabel textmaxVelContrarrelojista;
	private JLabel textAveragePedalSpeedClasico;
	private JLabel textDirector;
	private JTextField fieldName;
	private JTextField fieldUser;
	private JTextField fieldCyclistAccumTime;
	private JTextField fieldCyclistTeam;
	private JTextField fieldCyclistId;
	private JTextField fieldCyclistContexture;
	private JTextField fieldCyclistCountry;
	private JTextField fieldAverageVelRodador;
	private JTextField fieldAveragePedPowSprinter;
	private JTextField fieldAveragevelocitySprinter;
	private JTextField fieldPelotonFunctionGregario;
	private JTextField fieldAverageAccelEscalador;
	private JTextField fieldmaxRampDegreeEscalator;
	private JTextField fieldmaxVelContrarrelojista;
	private JTextField fieldAveragePedalSpeedClasico;
	private JPasswordField fieldPassword;
	private JComboBox<String> comboBoxGender;
	private JComboBox<String> comboBoxOcupation;
	private JTextField fieldMasseur;
	private JTextField fieldDirector;
	private JButton btnBack;
	private JButton btnRegister;
	private JSeparator line1;
	private JSeparator line2;
	private JSeparator line3;
	private JSeparator line4;
	private JSeparator line5;
	private JSeparator line6;
	private JSeparator line7;
	private JSeparator line8;
	private JSeparator line9;
	private JSeparator line10;
	private JSeparator line11;
	private JSeparator line12;
	private JSeparator line13;
	private JSeparator line14;
	private String[] gender = { "Male", "Femala", "not to say it", "Batman" };
	private String[] ocupation = { "Massage", "Director", "Cyclicist", "Classical Cyclist", "Time Trialist", "Climber",
			"Gregarius", "Rider", "Sprinter", };

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
		fieldName.setBounds(80, 75, 250, 25);
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
		fieldUser.setBounds(80, 145, 250, 25);
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
		fieldPassword.setBounds(80, 215, 250, 25);
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
// PANELES DEL COMOBO BOX
		panelMasseur = new JPanel();
		panelMasseur.setLayout(null);
		panelMasseur.setBounds(400, 50, 350, 300);
		panelMasseur.setBackground(new Color(255, 255, 255));
		panelMasseur.setVisible(false);

		textMasseur = new JLabel();
		textMasseur.setText("Years of Experience");
		textMasseur.setBounds(0, 100, 150, 30);
		textMasseur.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldMasseur = new JTextField();
		fieldMasseur.setBounds(180, 100, 50, 25);
		fieldMasseur.setFont(new Font("Tahoma", 0, 15));
		fieldMasseur.setBorder(null);

		line4 = new JSeparator();
		line4.setBounds(170, 130, 50, 20);
		line4.setForeground(Color.black);
		
		panelDirector = new JPanel();
		panelDirector.setLayout(null);
		panelDirector.setBounds(400, 50, 350, 300);
		panelDirector.setBackground(new Color(255, 255, 255));
		panelDirector.setVisible(false);

		textDirector = new JLabel();
		textDirector.setText("Nacionality");
		textDirector.setBounds(0, 100, 90, 30);
		textDirector.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldDirector = new JTextField();
		fieldDirector.setBounds(100, 100, 150, 25);
		fieldDirector.setFont(new Font("Tahoma", 0, 15));
		fieldDirector.setBorder(null);

		line5 = new JSeparator();
		line5.setBounds(100, 130, 150, 20);
		line5.setForeground(Color.black);
		//Cyclist panel
		panelCyclist = new JPanel();
		panelCyclist.setLayout(null);
		panelCyclist.setBounds(400, 50, 350, 300);
		panelCyclist.setBackground(new Color(255, 255, 255));
		panelCyclist.setVisible(false);

		textCyclistId = new JLabel();
		textCyclistId.setText("Id of the Cyclist");
		textCyclistId.setBounds(0, 100, 150, 30);
		textCyclistId.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldCyclistId = new JTextField();
		fieldCyclistId.setBounds(180, 100, 50, 25);
		fieldCyclistId.setFont(new Font("Tahoma", 0, 15));
		fieldCyclistId.setBorder(null);

		line6 = new JSeparator();
		line6.setBounds(170, 130, 50, 20);
		line6.setForeground(Color.black);
		
		textCyclistAccumTime = new JLabel();
		textCyclistAccumTime.setText("Cyclist Accumulated Time");
		textCyclistAccumTime.setBounds(0, 100, 150, 30);
		textCyclistAccumTime.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldCyclistAccumTime = new JTextField();
		fieldCyclistAccumTime.setBounds(180, 100, 50, 25);
		fieldCyclistAccumTime.setFont(new Font("Tahoma", 0, 15));
		fieldCyclistAccumTime.setBorder(null);

		line6 = new JSeparator();
		line6.setBounds(170, 130, 50, 20);
		line6.setForeground(Color.black);
	
		textCyclistContexture = new JLabel();
		textCyclistContexture.setText("Id of the Cyclist");
		textCyclistContexture.setBounds(0, 100, 150, 30);
		textCyclistContexture.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldCyclistContexture = new JTextField();
		fieldCyclistContexture.setBounds(180, 100, 50, 25);
		fieldCyclistContexture.setFont(new Font("Tahoma", 0, 15));
		fieldCyclistContexture.setBorder(null);

		line6 = new JSeparator();
		line6.setBounds(170, 130, 50, 20);
		line6.setForeground(Color.black);
		
		textCyclistTeam = new JLabel();
		textCyclistTeam.setText("Id of the Cyclist");
		textCyclistTeam.setBounds(0, 100, 150, 30);
		textCyclistTeam.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldCyclistTeam = new JTextField();
		fieldCyclistTeam.setBounds(180, 100, 50, 25);
		fieldCyclistTeam.setFont(new Font("Tahoma", 0, 15));
		fieldCyclistTeam.setBorder(null);

		line6 = new JSeparator();
		line6.setBounds(170, 130, 50, 20);
		line6.setForeground(Color.black);
		
		textCyclistCountry = new JLabel();
		textCyclistCountry.setText("Id of the Cyclist");
		textCyclistCountry.setBounds(0, 100, 150, 30);
		textCyclistCountry.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldCyclistCountry = new JTextField();
		fieldCyclistCountry.setBounds(180, 100, 50, 25);
		fieldCyclistCountry.setFont(new Font("Tahoma", 0, 15));
		fieldCyclistCountry.setBorder(null);

		line6 = new JSeparator();
		line6.setBounds(170, 130, 50, 20);
		line6.setForeground(Color.black);
		
		textAverageVelRodador = new JLabel();
		textAverageVelRodador.setText("Id of the Cyclist");
		textAverageVelRodador.setBounds(0, 100, 150, 30);
		textAverageVelRodador.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldAverageVelRodador = new JTextField();
		fieldAverageVelRodador.setBounds(180, 100, 50, 25);
		fieldAverageVelRodador.setFont(new Font("Tahoma", 0, 15));
		fieldAverageVelRodador.setBorder(null);

		line7 = new JSeparator();
		line7.setBounds(170, 130, 50, 20);
		line7.setForeground(Color.black);
		
		textAveragePedPowSprinter = new JLabel();
		textAveragePedPowSprinter.setText("Id of the Cyclist");
		textAveragePedPowSprinter.setBounds(0, 100, 150, 30);
		textAveragePedPowSprinter.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldAveragePedPowSprinter = new JTextField();
		fieldAveragePedPowSprinter.setBounds(180, 100, 50, 25);
		fieldAveragePedPowSprinter.setFont(new Font("Tahoma", 0, 15));
		fieldAveragePedPowSprinter.setBorder(null);

		line8 = new JSeparator();
		line8.setBounds(170, 130, 50, 20);
		line8.setForeground(Color.black);
		
		textAveragevelocitySprinter = new JLabel();
		textAveragevelocitySprinter.setText("Id of the Cyclist");
		textAveragevelocitySprinter.setBounds(0, 100, 150, 30);
		textAveragevelocitySprinter.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldAveragevelocitySprinter = new JTextField();
		fieldAveragevelocitySprinter.setBounds(180, 100, 50, 25);
		fieldAveragevelocitySprinter.setFont(new Font("Tahoma", 0, 15));
		fieldAveragevelocitySprinter.setBorder(null);

		line9 = new JSeparator();
		line9.setBounds(170, 130, 50, 20);
		line9.setForeground(Color.black);
		
		textPelotonFunctionGregario = new JLabel();
		textPelotonFunctionGregario.setText("Id of the Cyclist");
		textPelotonFunctionGregario.setBounds(0, 100, 150, 30);
		textPelotonFunctionGregario.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldPelotonFunctionGregario = new JTextField();
		fieldPelotonFunctionGregario.setBounds(180, 100, 50, 25);
		fieldPelotonFunctionGregario.setFont(new Font("Tahoma", 0, 15));
		fieldPelotonFunctionGregario.setBorder(null);

		line10 = new JSeparator();
		line10.setBounds(170, 130, 50, 20);
		line10.setForeground(Color.black);
		
		textAverageAccelEscalador = new JLabel();
		textAverageAccelEscalador.setText("Id of the Cyclist");
		textAverageAccelEscalador.setBounds(0, 100, 150, 30);
		textAverageAccelEscalador.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldAverageAccelEscalador = new JTextField();
		fieldAverageAccelEscalador.setBounds(180, 100, 50, 25);
		fieldAverageAccelEscalador.setFont(new Font("Tahoma", 0, 15));
		fieldAverageAccelEscalador.setBorder(null);

		line11 = new JSeparator();
		line11.setBounds(170, 130, 50, 20);
		line11.setForeground(Color.black);
		
		textmaxRampDegreeEscalator = new JLabel();
		textmaxRampDegreeEscalator.setText("Id of the Cyclist");
		textmaxRampDegreeEscalator.setBounds(0, 100, 150, 30);
		textmaxRampDegreeEscalator.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldmaxRampDegreeEscalator = new JTextField();
		fieldmaxRampDegreeEscalator.setBounds(180, 100, 50, 25);
		fieldmaxRampDegreeEscalator.setFont(new Font("Tahoma", 0, 15));
		fieldmaxRampDegreeEscalator.setBorder(null);

		line12 = new JSeparator();
		line12.setBounds(170, 130, 50, 20);
		line12.setForeground(Color.black);
		
		textmaxVelContrarrelojista = new JLabel();
		textmaxVelContrarrelojista.setText("Id of the Cyclist");
		textmaxVelContrarrelojista.setBounds(0, 100, 150, 30);
		textmaxVelContrarrelojista.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldmaxVelContrarrelojista = new JTextField();
		fieldmaxVelContrarrelojista.setBounds(180, 100, 50, 25);
		fieldmaxVelContrarrelojista.setFont(new Font("Tahoma", 0, 15));
		fieldmaxVelContrarrelojista.setBorder(null);

		line13 = new JSeparator();
		line13.setBounds(170, 130, 50, 20);
		line13.setForeground(Color.black);
		
		textAveragePedalSpeedClasico = new JLabel();
		textAveragePedalSpeedClasico.setText("Id of the Cyclist");
		textAveragePedalSpeedClasico.setBounds(0, 100, 150, 30);
		textAveragePedalSpeedClasico.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldAveragePedalSpeedClasico = new JTextField();
		fieldAveragePedalSpeedClasico.setBounds(180, 100, 50, 25);
		fieldAveragePedalSpeedClasico.setFont(new Font("Tahoma", 0, 15));
		fieldAveragePedalSpeedClasico.setBorder(null);

		line14 = new JSeparator();
		line14.setBounds(170, 130, 50, 20);
		line14.setForeground(Color.black);
//
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
		panelLogin.add(panelMasseur);
		panelLogin.add(panelDirector);
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
		panelMasseur.add(textMasseur);
		panelMasseur.add(fieldMasseur);
		panelMasseur.add(line4);
		panelDirector.add(textDirector);
		panelDirector.add(fieldDirector);
		panelDirector.add(line5);

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

	public JPanel getPanelMasseur() {
		return panelMasseur;
	}

	public void setPanelMasseur(JPanel panelMasseur) {
		this.panelMasseur = panelMasseur;
	}

	public JPanel getPanelDirector() {
		return panelDirector;
	}

	public void setPanelDirector(JPanel panelDirector) {
		this.panelDirector = panelDirector;
	}

	public JPanel getPanelCyclist() {
		return panelCyclist;
	}

	public void setPanelCyclist(JPanel panelCyclist) {
		this.panelCyclist = panelCyclist;
	}

	public JPanel getPanelClassicalCyclist() {
		return panelClassicalCyclist;
	}

	public void setPanelClassicalCyclist(JPanel panelClassicalCyclist) {
		this.panelClassicalCyclist = panelClassicalCyclist;
	}

	public JPanel getPanelCounterCyclist() {
		return panelCounterCyclist;
	}

	public void setPanelCounterCyclist(JPanel panelCounterCyclist) {
		this.panelCounterCyclist = panelCounterCyclist;
	}

	public JPanel getPanelClimber() {
		return panelClimber;
	}

	public void setPanelClimber(JPanel panelClimber) {
		this.panelClimber = panelClimber;
	}

	public JPanel getPanelGregarious() {
		return panelGregarious;
	}

	public void setPanelGregarious(JPanel panelGregarious) {
		this.panelGregarious = panelGregarious;
	}

	public JPanel getPanelRider() {
		return panelRider;
	}

	public void setPanelRider(JPanel panelRider) {
		this.panelRider = panelRider;
	}

	public JPanel getPanelSprinter() {
		return panelSprinter;
	}

	public void setPanelSprinter(JPanel panelSprinter) {
		this.panelSprinter = panelSprinter;
	}

	public JLabel getTextMasseur() {
		return textMasseur;
	}

	public void setTextMasseur(JLabel textMasseur) {
		this.textMasseur = textMasseur;
	}

	public JTextField getFieldMasseur() {
		return fieldMasseur;
	}

	public void setFieldMasseur(JTextField fieldMasseur) {
		this.fieldMasseur = fieldMasseur;
	}

	public JSeparator getLine4() {
		return line4;
	}

	public void setLine4(JSeparator line4) {
		this.line4 = line4;
	}

	public JLabel getTextCyclistAccumTime() {
		return textCyclistAccumTime;
	}

	public void setTextCyclistAccumTime(JLabel textCyclistAccumTime) {
		this.textCyclistAccumTime = textCyclistAccumTime;
	}

	public JLabel getTextCyclistTeam() {
		return textCyclistTeam;
	}

	public void setTextCyclistTeam(JLabel textCyclistTeam) {
		this.textCyclistTeam = textCyclistTeam;
	}

	public JLabel getTextCyclistId() {
		return textCyclistId;
	}

	public void setTextCyclistId(JLabel textCyclistId) {
		this.textCyclistId = textCyclistId;
	}

	public JLabel getTextCyclistContexture() {
		return textCyclistContexture;
	}

	public void setTextCyclistContexture(JLabel textCyclistContexture) {
		this.textCyclistContexture = textCyclistContexture;
	}

	public JLabel getTextCyclistCountry() {
		return textCyclistCountry;
	}

	public void setTextCyclistCountry(JLabel textCyclistCountry) {
		this.textCyclistCountry = textCyclistCountry;
	}

	public JTextField getFieldCyclistAccumTime() {
		return fieldCyclistAccumTime;
	}

	public void setFieldCyclistAccumTime(JTextField fieldCyclistAccumTime) {
		this.fieldCyclistAccumTime = fieldCyclistAccumTime;
	}

	public JTextField getFieldCyclistTeam() {
		return fieldCyclistTeam;
	}

	public void setFieldCyclistTeam(JTextField fieldCyclistTeam) {
		this.fieldCyclistTeam = fieldCyclistTeam;
	}

	public JTextField getFieldCyclistId() {
		return fieldCyclistId;
	}

	public void setFieldCyclistId(JTextField fieldCyclistId) {
		this.fieldCyclistId = fieldCyclistId;
	}

	public JTextField getFieldCyclistContexture() {
		return fieldCyclistContexture;
	}

	public void setFieldCyclistContexture(JTextField fieldCyclistContexture) {
		this.fieldCyclistContexture = fieldCyclistContexture;
	}

	public JTextField getFieldCyclistCountry() {
		return fieldCyclistCountry;
	}

	public void setFieldCyclistCountry(JTextField fieldCyclistCountry) {
		this.fieldCyclistCountry = fieldCyclistCountry;
	}

	public JLabel getTextAverageVelRodador() {
		return textAverageVelRodador;
	}

	public void setTextAverageVelRodador(JLabel textAverageVelRodador) {
		this.textAverageVelRodador = textAverageVelRodador;
	}

	public JTextField getFieldAverageVelRodador() {
		return fieldAverageVelRodador;
	}

	public void setFieldAverageVelRodador(JTextField fieldAverageVelRodador) {
		this.fieldAverageVelRodador = fieldAverageVelRodador;
	}

	public JLabel getTextAveragePedPowSprinter() {
		return textAveragePedPowSprinter;
	}

	public void setTextAveragePedPowSprinter(JLabel textAveragePedPowSprinter) {
		this.textAveragePedPowSprinter = textAveragePedPowSprinter;
	}

	public JLabel getTextAveragevelocitySprinter() {
		return textAveragevelocitySprinter;
	}

	public void setTextAveragevelocitySprinter(JLabel textAveragevelocitySprinter) {
		this.textAveragevelocitySprinter = textAveragevelocitySprinter;
	}

	public JTextField getFieldAveragePedPowSprinter() {
		return fieldAveragePedPowSprinter;
	}

	public void setFieldAveragePedPowSprinter(JTextField fieldAveragePedPowSprinter) {
		this.fieldAveragePedPowSprinter = fieldAveragePedPowSprinter;
	}

	public JTextField getFieldAveragevelocitySprinter() {
		return fieldAveragevelocitySprinter;
	}

	public void setFieldAveragevelocitySprinter(JTextField fieldAveragevelocitySprinter) {
		this.fieldAveragevelocitySprinter = fieldAveragevelocitySprinter;
	}

	public JLabel getTextPelotonFunctionGregario() {
		return textPelotonFunctionGregario;
	}

	public void setTextPelotonFunctionGregario(JLabel textPelotonFunctionGregario) {
		this.textPelotonFunctionGregario = textPelotonFunctionGregario;
	}

	public JTextField getFieldPelotonFunctionGregario() {
		return fieldPelotonFunctionGregario;
	}

	public void setFieldPelotonFunctionGregario(JTextField fieldPelotonFunctionGregario) {
		this.fieldPelotonFunctionGregario = fieldPelotonFunctionGregario;
	}

	public JLabel getTextAverageAccelEscalador() {
		return textAverageAccelEscalador;
	}

	public void setTextAverageAccelEscalador(JLabel textAverageAccelEscalador) {
		this.textAverageAccelEscalador = textAverageAccelEscalador;
	}

	public JLabel getTextmaxRampDegreeEscalator() {
		return textmaxRampDegreeEscalator;
	}

	public void setTextmaxRampDegreeEscalator(JLabel textmaxRampDegreeEscalator) {
		this.textmaxRampDegreeEscalator = textmaxRampDegreeEscalator;
	}

	public JLabel getTextmaxVelContrarrelojista() {
		return textmaxVelContrarrelojista;
	}

	public void setTextmaxVelContrarrelojista(JLabel textmaxVelContrarrelojista) {
		this.textmaxVelContrarrelojista = textmaxVelContrarrelojista;
	}

	public JLabel getTextAveragePedalSpeedClasico() {
		return textAveragePedalSpeedClasico;
	}

	public void setTextAveragePedalSpeedClasico(JLabel textAveragePedalSpeedClasico) {
		this.textAveragePedalSpeedClasico = textAveragePedalSpeedClasico;
	}

	public JTextField getFieldAverageAccelEscalador() {
		return fieldAverageAccelEscalador;
	}

	public void setFieldAverageAccelEscalador(JTextField fieldAverageAccelEscalador) {
		this.fieldAverageAccelEscalador = fieldAverageAccelEscalador;
	}

	public JTextField getFieldmaxRampDegreeEscalator() {
		return fieldmaxRampDegreeEscalator;
	}

	public void setFieldmaxRampDegreeEscalator(JTextField fieldmaxRampDegreeEscalator) {
		this.fieldmaxRampDegreeEscalator = fieldmaxRampDegreeEscalator;
	}

	public JTextField getFieldmaxVelContrarrelojista() {
		return fieldmaxVelContrarrelojista;
	}

	public void setFieldmaxVelContrarrelojista(JTextField fieldmaxVelContrarrelojista) {
		this.fieldmaxVelContrarrelojista = fieldmaxVelContrarrelojista;
	}

	public JTextField getFieldAveragePedalSpeedClasico() {
		return fieldAveragePedalSpeedClasico;
	}

	public void setFieldAveragePedalSpeedClasico(JTextField fieldAveragePedalSpeedClasico) {
		this.fieldAveragePedalSpeedClasico = fieldAveragePedalSpeedClasico;
	}
	

}
