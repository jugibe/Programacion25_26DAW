package expresionesRegulares;

import ejemplosdeclase.Leer;

/*
 * 04/11/2025
 * Mariano Clavero 
 * Programa que me pida un DNI y si no es correcto que lo vuelva a pedir.
 */
public class Ejemplo2 {

	public static void main(String[] args) {
		String dni = "";
		do {
			dni = Leer.leerFrase("Introduce tu DNI");
		} while (!dniValido(dni));
		System.out.println("El dni: "+dni+" es valido");
	}
	public static boolean dniValido(String dni) {
		return dni.matches("\\d{8}-?[A-Z]");
	}
}
