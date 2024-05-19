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
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
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
		logo.setBounds(32, 10, 100, 100);

		ImageIcon img = new ImageIcon("src/co/edu/unbosque/view/image/admin.png");
		Icon icon = new ImageIcon(
				img.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
		logo.setIcon(icon);

		panelUser = new JPanel();
		panelUser.setLayout(null);
		panelUser.setBounds(0, 0, 800, 500);
		panelUser.setBackground(new Color(255, 255, 255));

		panelSidebar = new JPanel();
		panelSidebar.setLayout(null);
		panelSidebar.setBounds(0, 0, 220, 500);
		panelSidebar.setBackground(new Color(12, 116, 127));
		
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
		textAdmin.setBounds(25, 100, 150, 50);
		textAdmin.setForeground(Color.WHITE);
		textAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		textAdmin.setFont(new Font("Tahoma", Font.BOLD, 15));

		line1 = new JSeparator();
		line1.setBounds(25, 140, 100, 20);
		line1.setForeground(Color.white);

		btnLogout = new JButton("Logout");
		btnLogout.setBounds(25, 400, 100, 25);
		btnLogout.setBackground(Color.red);
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogout.setBorderPainted(false);

		
		btn1 = new JButton("CREATE YOUR TEAM");
		btn1.setBounds(0, 175, 200, 30);
		btn1.setBackground(new Color(12, 116, 127));
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBorderPainted(false);
		
		btn2 = new JButton("OTHER TEAMS");
		btn2.setBounds(0, 225, 200, 30);
		btn2.setBackground(new Color(12, 116, 127));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBorderPainted(false);
		
		btn3 = new JButton("UPDATE PROFILE");
		btn3.setBounds(0, 275, 200, 30);
		btn3.setBackground(new Color(12, 116, 127));
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBorderPainted(false);
		
		btn4 = new JButton("VIEW RACES");
		btn4.setBounds(0, 325, 200, 30);
		btn4.setBackground(new Color(12, 116, 127));
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBorderPainted(false);
		
		btn5 = new JButton("RESULTS");
		btn5.setBounds(0, 325, 200, 30);
		btn5.setBackground(new Color(12, 116, 127));
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBorderPainted(false);
		
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
		panelSidebar.add(btn1);
		panelSidebar.add(btn2);
		panelSidebar.add(btn3);
		panelSidebar.add(btn4);
		panelSidebar.add(btnLogout);
		panelUser.add(panelCreateTeam);
		panelUser.add(panelUpdateProfile);
		panelUser.add(panelViewOtherTeams);
		panelUser.add(panelViewRaces);
		panelViewRaces.add(simulationBar1);
	}

	public JButton getBtnsimulationBar1() {
		return btnStartSimulation;
	}

	public void setBtnsimulationBar1(JButton btnsimulationBar1) {
		this.btnStartSimulation = btnsimulationBar1;
	}

	public JPanel getpanelUser() {
		return panelUser;
	}

	public void setpanelUser(JPanel panelUser) {
		this.panelUser = panelUser;
	}

	public JPanel getPanelSidebar() {
		return panelSidebar;
	}

	public void setPanelSidebar(JPanel panelSidebar) {
		this.panelSidebar = panelSidebar;
	}

	public JPanel getpanelCreateTeam() {
		return panelCreateTeam;
	}

	public void setpanelCreateTeam(JPanel panelCreateTeam) {
		this.panelCreateTeam = panelCreateTeam;
	}

	public JPanel getpanelUpdateProfile() {
		return panelUpdateProfile;
	}

	public void setpanelUpdateProfile(JPanel panelUpdateProfile) {
		this.panelUpdateProfile = panelUpdateProfile;
	}

	public JPanel getpanelViewOtherTeams() {
		return panelViewOtherTeams;
	}

	public void setpanelViewOtherTeams(JPanel panelViewOtherTeams) {
		this.panelViewOtherTeams = panelViewOtherTeams;
	}

	public JPanel getpanelViewRaces() {
		return panelViewRaces;
	}

	public void setpanelViewRaces(JPanel panelViewRaces) {
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

	public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public void setBtn4(JButton btn4) {
		this.btn4 = btn4;
	}

	public JSeparator getLine1() {
		return line1;
	}

	public void setLine1(JSeparator line1) {
		this.line1 = line1;
	}

	public JButton getBtn5() {
		return btn5;
	}

	public void setBtn5(JButton btn5) {
		this.btn5 = btn5;
	}

	public JPanel getPanelUser() {
		return panelUser;
	}

	public void setPanelUser(JPanel panelUser) {
		this.panelUser = panelUser;
	}

	public JProgressBar getsimulationBar1() {
		return simulationBar1;
	}

	public void setsimulationBar1(JProgressBar simulationBar1) {
		this.simulationBar1 = simulationBar1;
	}
	
	
}
