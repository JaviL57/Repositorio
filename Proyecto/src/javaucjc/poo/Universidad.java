package javaucjc.poo;

public class Universidad {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		persona1.nombre = "Maria";
		
		Persona persona2 = persona1;
		persona2.nombre = "Juan";
		
		System.out.println(persona1.nombre);
		
		Persona persona3 = new Persona();
		persona3.nombre="Eva";
		System.out.println(persona3.nombre);
		
		persona2 = persona3;
		
		
		persona3=null;
		System.out.println(persona2.edad);
		
		
		
	

	}

}
