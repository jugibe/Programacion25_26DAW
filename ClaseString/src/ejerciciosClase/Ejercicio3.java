package ejerciciosClase;
/*
 * Pedir el nombre y los apellidos de una persona y mostrar por pantalla sus iniciales
 con el formato M.C.V.
 Eder Gracia 30/10/2025
 VERSION FACIL, introducimos el nombre y los apellidos en variables diferentes
 */
public class Ejercicio3 {
	
	public static void main(String[] args) {
		//pedir los datos
		String nom=Leer.leerFrase("Introduce tu nombre");
		String ap1=Leer.leerFrase("Introduce tu primer apellido");
		String ap2=Leer.leerFrase("Introduce tu segundo apellido");

		System.out.println(iniciales(nom, ap1, ap2));
	}
	public static String iniciales(String nom, String ap1, String ap2) {
		return (nom.charAt(0) + "." + ap1.charAt(0) + "." + ap2.charAt(0)+".").toUpperCase();
	}

}
