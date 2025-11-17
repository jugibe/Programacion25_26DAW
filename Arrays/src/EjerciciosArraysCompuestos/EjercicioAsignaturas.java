package EjerciciosArraysCompuestos;
/*
 * Mariano CLavero 13/11/2025
 * Tenemos 10 asignaturas y 10 alumnos numerados del 1 al 10, introducimos las 10 
 * notas de los 10 alumnos (generación aleatoria de 1 a 10) y pidiendo por teclado  
 * bien número de asignatura ó bien número de alumno, calcular media del  alumno 
 * tecleado ó media de la asignatura tecleada. 
 */
public class EjercicioAsignaturas {

	public static void main(String[] args) {
		int[][] calificacion = new int[4][4];
		String[] alumnos = {"juan", "pedro", "laura", "esther"};
		String[] asignaturas = {"mates", "biologia", "programacion", "informatica"};
		int alumno = 0;
		int asignatura = 0;
		
		llenarArray(calificacion);
		mostrarArray(calificacion);
		// Pedimos un alumno
		// Validarlo con un do while o hacer un menu
		alumno = Leer.leerEntero("Introduce el numero de un alumno: ");
		System.out.println("La media del alumno: "+alumno+ " es "+mediaAlumno(calificacion[alumno]));
		// Pedimos una asignatura
		// Validarlo con un do while o hacer un menu
		asignatura = Leer.leerEntero("Introduce el numero de una asginatura: ");
		System.out.println("La media de la asginatura: "+asignatura+ " es "+mediaAsignatura(calificacion, asignatura));
	}
	public static void llenarArray(int f[][]) {
		for(int i=0;i<f.length;i++) {
			for(int j=0;j<f[i].length;j++) {
				f[i][j]=(int)(Math.random()*9)+1;
			}
		}
	}
	public static void mostrarArray(int f[][]) {
//		for (int i = 0; i < asignaturas.length; i++) {
//			System.out.printf("%14s", asignaturas[i]);
//		}
//		System.out.println("");
		for(int i=0;i<f.length;i++) {
			for(int j=0;j<f[i].length;j++) {
				System.out.printf("%14d",f[i][j]);
			}
			System.out.println("");
		}
	}
	private static double mediaAlumno(int[] a) {
		int suma = 0;
		for (int f = 0; f < a.length; f++) {
			suma += a[f];
		}
		return (double)(suma)/a.length;
	}
	private static double mediaAsignatura(int[][] a, int asignatura) {
		int suma = 0;
		for(int i=0;i<a.length;i++) {
			suma += a[i][asignatura];
		}
		return (double)(suma)/a.length;
	}
}
