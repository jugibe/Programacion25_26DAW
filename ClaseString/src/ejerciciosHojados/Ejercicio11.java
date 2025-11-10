package ejerciciosHojados;

import ejerciciosClase.Leer;

/*
 * Jeyson Delgado
 * 06/11/2025
 *  Hacer un programa para que pida una palabra de no más de 20 caracteres  y efectúe todas 
	las rotaciones posibles de dicha palabra de forma que el último carácter pase al primero y 
	los demás corran un espacio, es decir si la palabra fuera “HOLA”  el resultado debe ser : 
	HOLA 
	AHOL 
	LAHO 
	OLAH 
	Observar que una palabra de n caracteres tiene n rotaciones.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		String palabra="";
		
		//Bucle para solicitar la palabra 
		do {
			palabra=Leer.leerFrase("Palabra menor a 20 caracteres");
		}while(palabra.length()>20);
		
		//En cada paso del ford hacemos una rotacion de la frase 
		System.out.println(palabra);
		for(int i=0; i<palabra.length()-1; i++) {
			palabra=palabra.charAt(palabra.length()-1) + palabra.substring(0, palabra.length()-1);
			System.out.println(palabra);
		}
		
	}
	
}
