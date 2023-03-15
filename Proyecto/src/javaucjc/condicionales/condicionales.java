package javaucjc.condicionales;

public class condicionales {
	
	public static void main(String[] args) {
		
		int numero1 = 8;
		int numero2 = 9;
		
		if (numero1>numero2)
			System.out.println("Numero1 es mayor");
		    System.out.println("--Numero1 es mayor");
		    
	
	}else if (numero2>0) {
		System.out.println("Numero2 es mayor de cero");
	}
	
	}else {
		System.out.println("No se cumple ninguna condición")
	}
	
	//Condiciones con Switch
	String mensaje="Hola";
	switch(mensaje) {
	
	}
import java.util.Scanner;


public class EjercicioCondicionales {
	
	public static void main(String[] args) {
		String mes = "Enero";
		Scanner scan = new Scanner(System.in);
		System.outprintln(Math.random());
		mes = scan.nextLine();
		System.out.println("Mes introducido: "+mes);
	}
	
	
	//Realizamos con el if
	String estacion = "";
	if (mes=="Enero" || mes=="Febrero" || mes=="Marzo") {
		estacion = "Invierno";
	}
	
	System.out.println("La estacion del mes "+mes + " es"+estacion);
	
	
		
		
	}

}
