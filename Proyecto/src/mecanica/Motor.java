package mecanica;

public class Motor {
	
	private String marca;
	private int caballos;
	private String piston;
	public Motor(String marca, String caballos, String piston) {
		super();
		this.marca = marca;
		this.caballos = caballos;
		this.piston = piston;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCaballos() {
		return caballos;
	}
	public void setCaballos(String caballos) {
		this.caballos = caballos;
	}
	public String getPiston() {
		return piston;
	}
	public void setPiston(String piston) {
		this.piston = piston;
	}
	
	

}
