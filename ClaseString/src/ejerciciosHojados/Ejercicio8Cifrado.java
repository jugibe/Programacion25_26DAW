package ejerciciosHojados;

import ejemplosdeclase.Leer;

/*
 * 05/11/2025
 * MAriano Clavero
 * Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y 
dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del 
modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada 
carácter se transforme en 3 códigos ASCII mas es decir : 
Frase inicial  PROGRAMACION  resultado SURJUDPDFLRQ. 
Desarrollar los programas de codificar y descodificar mediante dos funciones.
 */
public class Ejercicio8Cifrado {

	public static void main(String[] args) {
		String frase = "",fraseCodificada="";
		do {
			frase = Leer.leerFrase("Introduce una frase en mayusculas: ");
		} while(!esMayuscula(frase));
		fraseCodificada=codificar(frase, 500);
		System.out.println(fraseCodificada);
		//decodificar, es codificar con el numero en negativo
		System.out.println(decodificar(fraseCodificada,500));
		
	}
	// Me devuelve true si la frase es en mayus y no tiene espacios ni "Ñ"
	public static boolean esMayuscula(String s) {
		return s.matches("[A-Z]+");
	}
	// Me codifica una frase utilizando el algoritmo CESAR sumandole "n"
	public static String codificar(String s, int n) {
		String fraseCodificada = "";
		for (int i = 0; i < s.length(); i++) {
			fraseCodificada += ""+(char)(((s.charAt(i) + n)));
			// Corregir
			
		}
		return fraseCodificada;
	}
	// decodifica una frase utilizando el algoritmo CESAR restando "n"
		public static String decodificar(String s, int n) {
			String fraseCodificada = "";
			for (int i = 0; i < s.length(); i++) {
				fraseCodificada += ""+(char)(((s.charAt(i) - n)));	
			}
			return fraseCodificada;
		}

}
