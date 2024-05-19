package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.model.CiclistaDTO;

public class VentanaPrincipalAdmin extends JFrame {

	private JPanel panelAdmin;
	private JPanel panelSidebar;
	private JPanel panelDeleteU;
	private JPanel panelDeleteT;
	private JPanel panelShowU;
	private JPanel panelShowT;
	private JPanel panelTableUsers;
	private JLabel textAdmin;
	private JLabel textDeleteU;
	private JLabel textDeleteT;
	private JLabel logo;
	private JTextField fieldDeleteU;
	private JTextField fieldDeleteT;
	private JButton btnLogout;
	private JButton btnPanelDeleteU;
	private JButton btnPanelDeleteT;
	private JButton btnPanelShowU;
	private JButton btnPanelShowT;
	private JButton btnDeleteU;
	private JButton btnDeleteT;
	private JSeparator line1;
	private JSeparator line2;
	private JSeparator line3;
	private JTable tableUsers;
	private JTable tableTeams;

	public VentanaPrincipalAdmin() {
		setSize(800, 500);
		setLayout(null);
		setLocationRelativeTo(null);

		logo = new JLabel();
		logo.setBounds(32, 10, 100, 100);

		ImageIcon img = new ImageIcon("src/co/edu/unbosque/view/image/admin.png");
		Icon icon = new ImageIcon(
				img.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
		logo.setIcon(icon);
		
		panelTableUsers = new JPanel();
		panelTableUsers.setLayout(null);
		panelTableUsers.setBounds(0, 0, 800, 500);
		panelTableUsers.setBackground(new Color(255, 255, 255));
		
			tableUsers = new JTable();
			tableUsers.setLayout(null);
			tableUsers.setBounds(0, 0, 800, 500);
			tableUsers.setBackground(new Color(255, 255, 255));
			
			String[] columnNames = {"Id", "Name", "Mail", "Password", "Gender"};
			DefaultTableModel model = new DefaultTableModel(columnNames, 0);
			
			
		panelAdmin = new JPanel();
		panelAdmin.setLayout(null);
		panelAdmin.setBounds(0, 0, 800, 500);
		panelAdmin.setBackground(new Color(255, 255, 255));

		panelSidebar = new JPanel();
		panelSidebar.setLayout(null);
		panelSidebar.setBounds(0, 0, 150, 500);
		panelSidebar.setBackground(new Color(12, 116, 127));

		panelShowU = new JPanel();
		panelShowU.setLayout(null);
		panelShowU.setBounds(150, 0, 650, 500);
		panelShowU.setBackground(Color.green);
		panelShowU.setVisible(false);

		panelDeleteU = new JPanel();
		panelDeleteU.setLayout(null);
		panelDeleteU.setBounds(150, 0, 650, 500);
		panelDeleteU.setBackground(Color.white);
		panelDeleteU.setVisible(false);

		panelShowT = new JPanel();
		panelShowT.setLayout(null);
		panelShowT.setBounds(150, 0, 650, 500);
		panelShowT.setBackground(Color.blue);
		panelShowT.setVisible(false);

		panelDeleteT = new JPanel();
		panelDeleteT.setLayout(null);
		panelDeleteT.setBounds(150, 0, 650, 500);
		panelDeleteT.setBackground(Color.white);
		panelDeleteT.setVisible(false);

		textAdmin = new JLabel();
		textAdmin.setText("Administrator");
		textAdmin.setBounds(25, 100, 110, 50);
		textAdmin.setForeground(Color.WHITE);
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

		btnPanelShowU = new JButton("USERS");
		btnPanelShowU.setBounds(0, 175, 150, 30);
		btnPanelShowU.setBackground(new Color(12, 116, 127));
		btnPanelShowU.setForeground(new Color(255, 255, 255));
		btnPanelShowU.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPanelShowU.setBorderPainted(false);

		btnPanelDeleteU = new JButton("DELETE USERS");
		btnPanelDeleteU.setBounds(0, 225, 150, 30);
		btnPanelDeleteU.setBackground(new Color(12, 116, 127));
		btnPanelDeleteU.setForeground(new Color(255, 255, 255));
		btnPanelDeleteU.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPanelDeleteU.setBorderPainted(false);

		textDeleteU = new JLabel();
		textDeleteU.setText("Enter user ID you wanna delete :");
		textDeleteU.setBounds(100, 200, 270, 20);
		textDeleteU.setForeground(Color.black);
		textDeleteU.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldDeleteU = new JTextField();
		fieldDeleteU.setBounds(380, 200, 50, 25);
		fieldDeleteU.setFont(new Font("Tahoma", 0, 15));
		fieldDeleteU.setBorder(null);

		line2 = new JSeparator();
		line2.setBounds(380, 230, 50, 20);
		line2.setForeground(Color.black);

		btnDeleteU = new JButton("Delete user");
		btnDeleteU.setBounds(200, 300, 180, 30);
		btnDeleteU.setBackground(Color.red);
		btnDeleteU.setForeground(new Color(255, 255, 255));
		btnDeleteU.setBorderPainted(false);

		btnPanelShowT = new JButton("TEAMS");
		btnPanelShowT.setBounds(0, 275, 150, 30);
		btnPanelShowT.setBackground(new Color(12, 116, 127));
		btnPanelShowT.setForeground(new Color(255, 255, 255));
		btnPanelShowT.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPanelShowT.setBorderPainted(false);

		btnPanelDeleteT = new JButton("DELETE TEAMS");
		btnPanelDeleteT.setBounds(0, 325, 150, 30);
		btnPanelDeleteT.setBackground(new Color(12, 116, 127));
		btnPanelDeleteT.setForeground(new Color(255, 255, 255));
		btnPanelDeleteT.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPanelDeleteT.setBorderPainted(false);

		textDeleteT = new JLabel();
		textDeleteT.setText("Enter team ID you wanna delete");
		textDeleteT.setBounds(100, 200, 270, 20);
		textDeleteT.setForeground(Color.black);
		textDeleteT.setFont(new Font("Tahoma", Font.BOLD, 15));

		fieldDeleteT = new JPasswordField();
		fieldDeleteT.setBounds(380, 200, 50, 25);
		fieldDeleteT.setFont(new Font("", 0, 25));
		fieldDeleteT.setBorder(null);

		line3 = new JSeparator();
		line3.setBounds(380, 230, 50, 20);
		line3.setForeground(Color.black);

		btnDeleteT = new JButton("Delete team");
		btnDeleteT.setBounds(200, 300, 180, 30);
		btnDeleteT.setBackground(Color.red);
		btnDeleteT.setForeground(new Color(255, 255, 255));
		btnDeleteT.setBorderPainted(false);
		
		
		add(panelAdmin);
		panelAdmin.add(panelSidebar);
		panelSidebar.add(logo);
		panelSidebar.add(textAdmin);
		panelSidebar.add(line1);
		panelSidebar.add(btnPanelShowU);
		panelSidebar.add(btnPanelDeleteU);
		panelSidebar.add(btnPanelShowT);
		panelSidebar.add(btnPanelDeleteT);
		panelSidebar.add(btnLogout);
		panelAdmin.add(panelShowU);
		panelAdmin.add(panelDeleteU);
		panelAdmin.add(panelShowT);
		panelAdmin.add(panelDeleteT);
		panelDeleteU.add(textDeleteU);
		panelDeleteU.add(fieldDeleteU);
		panelDeleteU.add(line2);
		panelDeleteU.add(btnDeleteU);
		panelDeleteT.add(textDeleteT);
		panelDeleteT.add(fieldDeleteT);
		panelDeleteT.add(line3);
		panelDeleteT.add(btnDeleteT);
	}

	public JPanel getPanelAdmin() {
		return panelAdmin;
	}

	public void setPanelAdmin(JPanel panelAdmin) {
		this.panelAdmin = panelAdmin;
	}

	public JPanel getPanelSidebar() {
		return panelSidebar;
	}

	public void setPanelSidebar(JPanel panelSidebar) {
		this.panelSidebar = panelSidebar;
	}

	public JPanel getPanelDeleteU() {
		return panelDeleteU;
	}

	public void setPanelDeleteU(JPanel panelDeleteU) {
		this.panelDeleteU = panelDeleteU;
	}

	public JPanel getPanelDeleteT() {
		return panelDeleteT;
	}

	public void setPanelDeleteT(JPanel panelDeleteT) {
		this.panelDeleteT = panelDeleteT;
	}

	public JPanel getPanelShowU() {
		return panelShowU;
	}

	public void setPanelShowU(JPanel panelShowU) {
		this.panelShowU = panelShowU;
	}

	public JPanel getPanelShowT() {
		return panelShowT;
	}

	public void setPanelShowT(JPanel panelShowT) {
		this.panelShowT = panelShowT;
	}

	public JLabel getTextAdmin() {
		return textAdmin;
	}

	public void setTextAdmin(JLabel textAdmin) {
		this.textAdmin = textAdmin;
	}

	public JLabel getTextDeleteU() {
		return textDeleteU;
	}

	public void setTextDeleteU(JLabel textDeleteU) {
		this.textDeleteU = textDeleteU;
	}

	public JLabel getTextDeleteT() {
		return textDeleteT;
	}

	public void setTextDeleteT(JLabel textDeleteT) {
		this.textDeleteT = textDeleteT;
	}

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

	public JTextField getFieldDeleteU() {
		return fieldDeleteU;
	}

	public void setFieldDeleteU(JTextField fieldDeleteU) {
		this.fieldDeleteU = fieldDeleteU;
	}

	public JTextField getFieldDeleteT() {
		return fieldDeleteT;
	}

	public void setFieldDeleteT(JTextField fieldDeleteT) {
		this.fieldDeleteT = fieldDeleteT;
	}

	public JButton getBtnLogout() {
		return btnLogout;
	}

	public void setBtnLogout(JButton btnLogout) {
		this.btnLogout = btnLogout;
	}

	public JButton getBtnPanelDeleteU() {
		return btnPanelDeleteU;
	}

	public void setBtnPanelDeleteU(JButton btnPanelDeleteU) {
		this.btnPanelDeleteU = btnPanelDeleteU;
	}

	public JButton getBtnPanelDeleteT() {
		return btnPanelDeleteT;
	}

	public void setBtnPanelDeleteT(JButton btnPanelDeleteT) {
		this.btnPanelDeleteT = btnPanelDeleteT;
	}

	public JButton getBtnPanelShowU() {
		return btnPanelShowU;
	}

	public void setBtnPanelShowU(JButton btnPanelShowU) {
		this.btnPanelShowU = btnPanelShowU;
	}

	public JButton getBtnPanelShowT() {
		return btnPanelShowT;
	}

	public void setBtnPanelShowT(JButton btnPanelShowT) {
		this.btnPanelShowT = btnPanelShowT;
	}

	public JButton getBtnDeleteU() {
		return btnDeleteU;
	}

	public void setBtnDeleteU(JButton btnDeleteU) {
		this.btnDeleteU = btnDeleteU;
	}

	public JButton getBtnDeleteT() {
		return btnDeleteT;
	}

	public void setBtnDeleteT(JButton btnDeleteT) {
		this.btnDeleteT = btnDeleteT;
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



}
