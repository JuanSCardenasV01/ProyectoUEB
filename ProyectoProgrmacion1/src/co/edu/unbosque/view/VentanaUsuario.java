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
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class VentanaUsuario extends JFrame{
	private JPanel panelUser;
	private JPanel panelSidebar;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JLabel textAdmin;
	private JLabel logo;
	private JButton btnLogout;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JSeparator line1;

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
		panelSidebar.setBounds(0, 0, 150, 500);
		panelSidebar.setBackground(new Color(12, 116, 127));
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(150, 0, 650, 500);
		panel1.setBackground(Color.green);
		panel1.setVisible(false);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(150, 0, 650, 500);
		panel2.setBackground(Color.yellow);
		panel2.setVisible(false);
		
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(150, 0, 650, 500);
		panel3.setBackground(Color.blue);
		panel3.setVisible(false);

		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(150, 0, 650, 500);
		panel4.setBackground(Color.pink);
		panel4.setVisible(false);

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
		btn1.setBounds(0, 175, 150, 30);
		btn1.setBackground(new Color(12, 116, 127));
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBorderPainted(false);
		
		btn2 = new JButton("OTHER TEAMS");
		btn2.setBounds(0, 225, 150, 30);
		btn2.setBackground(new Color(12, 116, 127));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setBorderPainted(false);
		
		btn3 = new JButton("UPDATE YOUR PROFILE");
		btn3.setBounds(0, 275, 150, 30);
		btn3.setBackground(new Color(12, 116, 127));
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setBorderPainted(false);
		
		btn4 = new JButton("VIEW RACES");
		btn4.setBounds(0, 325, 150, 30);
		btn4.setBackground(new Color(12, 116, 127));
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBorderPainted(false);
		
		btn5 = new JButton("RESULTS");
		btn5.setBounds(0, 325, 150, 30);
		btn5.setBackground(new Color(12, 116, 127));
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBorderPainted(false);

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
		panelUser.add(panel1);
		panelUser.add(panel2);
		panelUser.add(panel3);
		panelUser.add(panel4);
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

	public JPanel getPanel1() {
		return panel1;
	}

	public void setPanel1(JPanel panel1) {
		this.panel1 = panel1;
	}

	public JPanel getPanel2() {
		return panel2;
	}

	public void setPanel2(JPanel panel2) {
		this.panel2 = panel2;
	}

	public JPanel getPanel3() {
		return panel3;
	}

	public void setPanel3(JPanel panel3) {
		this.panel3 = panel3;
	}

	public JPanel getPanel4() {
		return panel4;
	}

	public void setPanel4(JPanel panel4) {
		this.panel4 = panel4;
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
	
	
}
