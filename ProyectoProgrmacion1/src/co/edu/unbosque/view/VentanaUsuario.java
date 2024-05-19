package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.ObjectStreamField;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaUsuario extends JFrame{
	private JPanel panelUser;
	private JPanel panelSidebar;
	private JPanel panelCreateTeam;
	private JPanel panelUpdateProfile;
	private JPanel panelViewOtherTeams;
	private JPanel panelViewRaces;
	private JLabel textAdmin;
	private JLabel logo;
	private JButton btnLogout;
	private JButton btnCreateTeam;
	private JButton btnOtherTeams;
	private JButton btnUpdateProfile;
	private JButton btnViewRaces;
	private JButton btnResults;
	private JButton btnMountainRace;
	private JButton btnPlainWCurvesRace;
	private JButton btnSemiPlainRace;
	private JButton btnStraightPlainRace;
	private JButton btnOneDayRace;
	private JButton btnStartSimulation;
	private JTextField fieldNewName;
	private JTextField fieldNewPassword;
	private JTextField fieldNewMail;
	private JTextField fieldNewGender;
	private JLabel textNewName;
	private JLabel textNewPassword;
	private JLabel textNewMail;
	private JLabel textNewGender;
	private JSeparator line1;
	private JProgressBar simulationBar1;

	public VentanaUsuario() {
		setSize(800, 500);
		setLayout(null);
		setLocationRelativeTo(null);

		logo = new JLabel();
		logo.setBounds(25, 5, 100, 100);

		ImageIcon img = new ImageIcon("src/co/edu/unbosque/view/image/logoUser.png");
		Icon icon = new ImageIcon(
				img.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
		logo.setIcon(icon);

		panelUser = new JPanel();
		panelUser.setLayout(null);
		panelUser.setBounds(0, 0, 800, 500);
		panelUser.setBackground(new Color(255, 255, 255));

		panelSidebar = new JPanel();
		panelSidebar.setLayout(null);
		panelSidebar.setBounds(0, 0, 150, 500);
		panelSidebar.setBackground(new Color(0, 0, 0));
		
		panelCreateTeam = new JPanel();
		panelCreateTeam.setLayout(null);
		panelCreateTeam.setBounds(150, 0, 650, 500);
		panelCreateTeam.setBackground(Color.green);
		panelCreateTeam.setVisible(false);

		panelUpdateProfile = new JPanel();
		panelUpdateProfile.setLayout(null);
		panelUpdateProfile.setBounds(0, 0, 800, 500);
		panelUpdateProfile.setBackground(Color.yellow);
		panelUpdateProfile.setVisible(false);
	
		textNewName = new JLabel();
		textNewName.setText("New name");
		textNewName.setBounds(0, 200, 90, 30);
		textNewName.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldNewName = new JTextField();
		fieldNewName.setBounds(100, 200, 150, 25);
		fieldNewName.setFont(new Font("Tahoma", 0, 15));
		fieldNewName.setBorder(null);
		
		textNewMail = new JLabel();
		textNewMail.setText("New Mail");
		textNewMail.setBounds(0, 160, 90, 30);
		textNewMail.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldNewMail = new JTextField();
		fieldNewMail.setBounds(100, 160, 150, 25);
		fieldNewMail.setFont(new Font("Tahoma", 0, 15));
		fieldNewMail.setBorder(null);
		
		textNewPassword = new JLabel();
		textNewPassword.setText("New Password");
		textNewPassword.setBounds(0, 120, 90, 30);
		textNewPassword.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldNewPassword = new JTextField();
		fieldNewPassword.setBounds(100, 120, 150, 25);
		fieldNewPassword.setFont(new Font("Tahoma", 0, 15));
		fieldNewPassword.setBorder(null);
		
		textNewGender = new JLabel();
		textNewGender.setText("New Gender");
		textNewGender.setBounds(0, 100, 90, 30);
		textNewGender.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldNewGender = new JTextField();
		fieldNewGender.setBounds(100, 100, 150, 25);
		fieldNewGender.setFont(new Font("Tahoma", 0, 15));
		fieldNewGender.setBorder(null);
		
		//
		panelViewOtherTeams = new JPanel();
		panelViewOtherTeams.setLayout(null);
		panelViewOtherTeams.setBounds(150, 0, 650, 500);
		panelViewOtherTeams.setBackground(Color.blue);
		panelViewOtherTeams.setVisible(false);
		//
		panelViewRaces = new JPanel();
		panelViewRaces.setLayout(null);
		panelViewRaces.setBounds(150, 0, 650, 500);
		panelViewRaces.setBackground(Color.pink);
		panelViewRaces.setVisible(false);
		
		btnMountainRace = new JButton("Mountain Race");
		btnMountainRace.setBounds(0, 20, 150, 30);
		btnMountainRace.setBackground(new Color(12, 116, 127));
		btnMountainRace.setForeground(new Color(255, 255, 255));
		btnMountainRace.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMountainRace.setBorderPainted(true);
		
		btnPlainWCurvesRace = new JButton("Plain With Curves Race");
		btnPlainWCurvesRace.setBounds(0, 60, 150, 30);
		btnPlainWCurvesRace.setBackground(new Color(12, 116, 127));
		btnPlainWCurvesRace.setForeground(new Color(255, 255, 255));
		btnPlainWCurvesRace.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlainWCurvesRace.setBorderPainted(true);
		
		btnSemiPlainRace = new JButton("Semi Plain Race");
		btnSemiPlainRace.setBounds(0, 100, 150, 30);
		btnSemiPlainRace.setBackground(new Color(12, 116, 127));
		btnSemiPlainRace.setForeground(new Color(255, 255, 255));
		btnSemiPlainRace.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSemiPlainRace.setBorderPainted(true);
		
		btnStraightPlainRace = new JButton("Straight Plain Race");
		btnStraightPlainRace.setBounds(0, 140, 150, 30);
		btnStraightPlainRace.setBackground(new Color(12, 116, 127));
		btnStraightPlainRace.setForeground(new Color(255, 255, 255));
		btnStraightPlainRace.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStraightPlainRace.setBorderPainted(true);
		
		btnOneDayRace = new JButton("One Day Race");
		btnOneDayRace.setBounds(0, 140, 150, 30);
		btnOneDayRace.setBackground(new Color(12, 116, 127));
		btnOneDayRace.setForeground(new Color(255, 255, 255));
		btnOneDayRace.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOneDayRace.setBorderPainted(true);

		textAdmin = new JLabel();
		textAdmin.setText("");
		textAdmin.setBounds(25, 90, 150, 50);
		textAdmin.setForeground(Color.WHITE);
		textAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		textAdmin.setFont(new Font("Tahoma", Font.BOLD, 10));

		line1 = new JSeparator();
		line1.setBounds(25, 120, 100, 20);
		line1.setForeground(new Color(246, 71, 71));

		btnLogout = new JButton("Logout");
		btnLogout.setBounds(25, 400, 100, 25);
		btnLogout.setBackground(Color.red);
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnLogout.setBorderPainted(false);

		
		btnCreateTeam = new JButton("CREATE YOUR TEAM");
		btnCreateTeam.setBounds(0, 150, 150, 30);
		btnCreateTeam.setBackground(new Color(246, 71, 71));
		btnCreateTeam.setForeground(new Color(255, 255, 255));
		btnCreateTeam.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCreateTeam.setBorderPainted(false);
		
		btnOtherTeams = new JButton("OTHER TEAMS");
		btnOtherTeams.setBounds(0, 200, 150, 30);
		btnOtherTeams.setBackground(new Color(246, 71, 71));
		btnOtherTeams.setForeground(new Color(255, 255, 255));
		btnOtherTeams.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnOtherTeams.setBorderPainted(false);
		
		btnUpdateProfile = new JButton("UPDATE PROFILE");
		btnUpdateProfile.setBounds(0, 250, 150, 30);
		btnUpdateProfile.setBackground(new Color(246, 71, 71));
		btnUpdateProfile.setForeground(new Color(255, 255, 255));
		btnUpdateProfile.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnUpdateProfile.setBorderPainted(false);
		
		btnViewRaces = new JButton("VIEW RACES");
		btnViewRaces.setBounds(0, 300, 150, 30);
		btnViewRaces.setBackground(new Color(246, 71, 71));
		btnViewRaces.setForeground(new Color(255, 255, 255));
		btnViewRaces.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnViewRaces.setBorderPainted(false);
		
		btnResults = new JButton("RESULTS");
		btnResults.setBounds(0, 350, 150, 30);
		btnResults.setBackground(new Color(246, 71, 71));
		btnResults.setForeground(new Color(255, 255, 255));
		btnResults.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnResults.setBorderPainted(false);
		
		btnStartSimulation = new JButton("Start simulation");
		btnStartSimulation.setBounds(0, 325, 150, 30);
		btnStartSimulation.setBackground(new Color(12, 116, 127));
		btnStartSimulation.setForeground(new Color(255, 255, 255));
		btnStartSimulation.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnStartSimulation.setBorderPainted(false);
		
		simulationBar1 = new JProgressBar();
		simulationBar1.setBounds(0, 275, 300, 127);
		simulationBar1.setBackground(new Color(12, 116, 127));
		simulationBar1.setForeground(new Color(255, 255, 255));
		simulationBar1.setFont(new Font("Tahoma", Font.BOLD, 25));
		simulationBar1.setBorderPainted(true);
		simulationBar1.setStringPainted(true);
		
	

		add(panelUser);
		panelUser.add(panelSidebar);
		panelSidebar.add(logo);
		panelSidebar.add(textAdmin);
		panelSidebar.add(line1);
		panelSidebar.add(btnCreateTeam);
		panelSidebar.add(btnOtherTeams);
		panelSidebar.add(btnUpdateProfile);
		panelSidebar.add(btnViewRaces);
		panelSidebar.add(btnResults);
		panelSidebar.add(btnLogout);
		panelUser.add(panelCreateTeam);
		panelUser.add(panelUpdateProfile);
		panelUser.add(panelViewOtherTeams);
		panelUser.add(panelViewRaces);
		panelViewRaces.add(simulationBar1);
		panelViewRaces.add(btnMountainRace);
		panelViewRaces.add(btnOneDayRace);
		panelViewRaces.add(btnPlainWCurvesRace);
		panelViewRaces.add(btnSemiPlainRace);
		panelViewRaces.add(btnStraightPlainRace);
	}

	public JPanel getPanelUser() {
		return panelUser;
	}

	public void setPanelUser(JPanel panelUser) {
		this.panelUser = panelUser;
	}

	public JPanel getPanelSidebar() {
		return panelSidebar;
	}

	public void setPanelSidebar(JPanel panelSidebar) {
		this.panelSidebar = panelSidebar;
	}

	public JPanel getPanelCreateTeam() {
		return panelCreateTeam;
	}

	public void setPanelCreateTeam(JPanel panelCreateTeam) {
		this.panelCreateTeam = panelCreateTeam;
	}

	public JPanel getPanelUpdateProfile() {
		return panelUpdateProfile;
	}

	public void setPanelUpdateProfile(JPanel panelUpdateProfile) {
		this.panelUpdateProfile = panelUpdateProfile;
	}

	public JPanel getPanelViewOtherTeams() {
		return panelViewOtherTeams;
	}

	public void setPanelViewOtherTeams(JPanel panelViewOtherTeams) {
		this.panelViewOtherTeams = panelViewOtherTeams;
	}

	public JPanel getPanelViewRaces() {
		return panelViewRaces;
	}

	public void setPanelViewRaces(JPanel panelViewRaces) {
		this.panelViewRaces = panelViewRaces;
	}

	public JLabel getTextAdmin() {
		return textAdmin;
	}

	public void setTextAdmin(JLabel textAdmin) {
		this.textAdmin = textAdmin;
	}

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

	public JButton getBtnLogout() {
		return btnLogout;
	}

	public void setBtnLogout(JButton btnLogout) {
		this.btnLogout = btnLogout;
	}

	public JButton getBtnCreateTeam() {
		return btnCreateTeam;
	}

	public void setBtnCreateTeam(JButton btnCreateTeam) {
		this.btnCreateTeam = btnCreateTeam;
	}

	public JButton getBtnOtherTeams() {
		return btnOtherTeams;
	}

	public void setBtnOtherTeams(JButton btnOtherTeams) {
		this.btnOtherTeams = btnOtherTeams;
	}

	public JButton getBtnUpdateProfile() {
		return btnUpdateProfile;
	}

	public void setBtnUpdateProfile(JButton btnUpdateProfile) {
		this.btnUpdateProfile = btnUpdateProfile;
	}

	public JButton getBtnViewRaces() {
		return btnViewRaces;
	}

	public void setBtnViewRaces(JButton btnViewRaces) {
		this.btnViewRaces = btnViewRaces;
	}

	public JButton getBtnResults() {
		return btnResults;
	}

	public void setBtnResults(JButton btnResults) {
		this.btnResults = btnResults;
	}

	public JButton getBtnMountainRace() {
		return btnMountainRace;
	}

	public void setBtnMountainRace(JButton btnMountainRace) {
		this.btnMountainRace = btnMountainRace;
	}

	public JButton getBtnPlainWCurvesRace() {
		return btnPlainWCurvesRace;
	}

	public void setBtnPlainWCurvesRace(JButton btnPlainWCurvesRace) {
		this.btnPlainWCurvesRace = btnPlainWCurvesRace;
	}

	public JButton getBtnSemiPlainRace() {
		return btnSemiPlainRace;
	}

	public void setBtnSemiPlainRace(JButton btnSemiPlainRace) {
		this.btnSemiPlainRace = btnSemiPlainRace;
	}

	public JButton getBtnStraightPlainRace() {
		return btnStraightPlainRace;
	}

	public void setBtnStraightPlainRace(JButton btnStraightPlainRace) {
		this.btnStraightPlainRace = btnStraightPlainRace;
	}

	public JButton getBtnOneDayRace() {
		return btnOneDayRace;
	}

	public void setBtnOneDayRace(JButton btnOneDayRace) {
		this.btnOneDayRace = btnOneDayRace;
	}

	public JButton getBtnStartSimulation() {
		return btnStartSimulation;
	}

	public void setBtnStartSimulation(JButton btnStartSimulation) {
		this.btnStartSimulation = btnStartSimulation;
	}

	public JTextField getFieldNewName() {
		return fieldNewName;
	}

	public void setFieldNewName(JTextField fieldNewName) {
		this.fieldNewName = fieldNewName;
	}

	public JTextField getFieldNewPassword() {
		return fieldNewPassword;
	}

	public void setFieldNewPassword(JTextField fieldNewPassword) {
		this.fieldNewPassword = fieldNewPassword;
	}

	public JTextField getFieldNewMail() {
		return fieldNewMail;
	}

	public void setFieldNewMail(JTextField fieldNewMail) {
		this.fieldNewMail = fieldNewMail;
	}

	public JTextField getFieldNewGender() {
		return fieldNewGender;
	}

	public void setFieldNewGender(JTextField fieldNewGender) {
		this.fieldNewGender = fieldNewGender;
	}

	public JLabel getTextNewName() {
		return textNewName;
	}

	public void setTextNewName(JLabel textNewName) {
		this.textNewName = textNewName;
	}

	public JLabel getTextNewPassword() {
		return textNewPassword;
	}

	public void setTextNewPassword(JLabel textNewPassword) {
		this.textNewPassword = textNewPassword;
	}

	public JLabel getTextNewMail() {
		return textNewMail;
	}

	public void setTextNewMail(JLabel textNewMail) {
		this.textNewMail = textNewMail;
	}

	public JLabel getTextNewGender() {
		return textNewGender;
	}

	public void setTextNewGender(JLabel textNewGender) {
		this.textNewGender = textNewGender;
	}

	public JSeparator getLine1() {
		return line1;
	}

	public void setLine1(JSeparator line1) {
		this.line1 = line1;
	}

	public JProgressBar getSimulationBar1() {
		return simulationBar1;
	}

	public void setSimulationBar1(JProgressBar simulationBar1) {
		this.simulationBar1 = simulationBar1;
	}

	
	
}
