package Clase;

public class Notas {
	
	public static void main(String[] args) {
		
		Asignatura asignatura1Alumno1 = new Asignatura("Calculo","1.2");
		Asignatura asignatura2Alumno1 = new Asignatura("Matemáticas","3.0");
		
		Asignatura[] asignaturasAlumno2 = {asignatura1Alumno2,asignatura2Alumno2};
		
		Alumno alumno2 = new Alumno("A1","X1");
		alumno2.setAsignaturas(asignaturasAlumno);
		
		
		
		Alumno [] alumnos = {alumno1,alumno2};
		
		//alumnos[1].getAsignaturas()[2].getNota();
		
		
		System.out.println("Hay "+alumnos.length+" alumnos en el aula");
		
		
		double notasAlumnos = 0;
		for Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
			Asignatura[] asignaturasAlumno = alumno.getAsignaturas();
			for (Asignatura asignatura : asignaturasAlumno) {
				notasAlumnos+=asignatura.getNota();
			
			}
					
		}
		
	//System.out.println(alumnos[1].getAsignaturas()[1].getNota());
		
		
	
	
	
		
		
		
		
		
				
	}

}
