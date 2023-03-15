package Clase;

public class Asignatura {
	
	private String nombre;
	private Int nota;
	public Asignatura(String nombre, Int nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
		
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Int getNota() {
		return nota;
	}
	public void setNota(Int nota) {
		this.nota = nota;
	}
	

}
