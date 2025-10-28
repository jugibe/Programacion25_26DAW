package ejerciciosClase;

import ejemplosdeclase.Leer;

/*
 * Mariano Clavero
 * Pedir una palabra por teclado y comprobar si es un verbo infinitivo (acabado en -ar,
-er o -ir).
 */
public class Ejercicio2VerboInfinitivo {

	public static void main(String[] args) {
		do {
			
		}while (!esInfinitivo(Leer.leerFrase("Introduce un verbo en infinitivo")));
		System.out.println("fin de programa");

	}
	public static boolean esInfinitivo(String palabra) {
		return palabra.endsWith("ar") || palabra.endsWith("er") || palabra.endsWith("ir");
	}
}
