package co.edu.unbosque.view;

public class ViewFacade {
	private VentanaLogin venLog;
	private VentanaPrincipalAdmin venPA;
	private VentanaRegister venRe;
	private VentanaUsuario venUsu;
	public ViewFacade() {
		venLog = new VentanaLogin();
		venPA = new VentanaPrincipalAdmin();
		venRe = new VentanaRegister();
		venUsu = new VentanaUsuario();
	}

	public VentanaLogin getVenLog() {
		return venLog;
	}

	public void setVenLog(VentanaLogin venLog) {
		this.venLog = venLog;
	}

	public VentanaPrincipalAdmin getVenPA() {
		return venPA;
	}

	public void setVenPA(VentanaPrincipalAdmin venPA) {
		this.venPA = venPA;
	}

	public VentanaRegister getVenRe() {
		return venRe;
	}

	public void setVenRe(VentanaRegister venRe) {
		this.venRe = venRe;
	}

	public VentanaUsuario getVenUsu() {
		return venUsu;
	}

	public void setVenUsu(VentanaUsuario venUsu) {
		this.venUsu = venUsu;
	}
	
	
	
	
	

}
