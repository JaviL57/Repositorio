package Clase;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String asignaturas;
	
	public Alumno(String nombre, String apellidos, String asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignaturas = asignaturas;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String asignaturas) {
		this.asignaturas = asignaturas;
	}
	

}
