package actividadVGestionClase;

public class GestionAlumnos {

	public static void main(String[] args) {
		// Para construir un alumno necesitamos un nombre y un array de calificaciones
		// Pruebas
		String nombre = "Mariano Clavero";
		Calificacion c[] = new Calificacion[2];
		c[0] = new Calificacion("Programacion", 7.5);
		c[1] = new Calificacion("Bases de datos", 9);
		Alumno a = new Alumno(nombre,c);
		System.out.println(a);
		// Un alumno en una linea
		Alumno b = new Alumno("Andres Silva", 
				new Calificacion[]{new Calificacion("Programacion", 18), new Calificacion("Bases de datos", 5)});
		System.out.println(b);
		
		b.insertar(new Calificacion("ingles", 10));
		System.out.println(b);
		b.insertar(new Calificacion("ingles", 9));
		System.out.println(b);
		
		System.out.println(b.consultarMejorNota());
		System.out.println(b.consultarCalificacion("ingles"));
		System.out.println(b.modificarCalificacion(new Calificacion("Programacion", 1)));
		System.out.println(b);
		System.out.println(b.modificarCalificacion("Programacion", 5.5));
		System.out.println(b);
		System.out.println(b.todoAprobado());
		System.out.println(b.obtenerMedia());
		
		//GRupos
		Grupo g = new Grupo("1ºDaw", 10);
		System.out.println(g);
		
	}

}
