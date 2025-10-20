package ejemplosClase;

import java.util.Scanner;

/*
 * Autor: Lorena Arias
 * Fecha: 14/10/2025
 * Enunciado: Ejemplo de clase para trabajar la creación de métodos
 */
public class Ejemplo1 {

	public static void main(String[] args) {
		//LLamamos al metodo saludar
		saludar("Juanjo");
		saludar("Esther");
		saludar(); //No hay conflicto, puede haber dos metodos con diferentes argumentos
		saludarVeces("Lorena", 4);
		dibujarCuadrado(10,15);
	}
	
	/* public + static + tipo de dato que devuelve + nombre del metodo + (argumentos del metodo)*/
	public static void saludar () {
		//Cuerpo del metodo
		System.out.println("Hola soy Lorena :)");
	}

	/*Crear un metodo saludar al que le pasamos un argumento*/
	//Le pasamos como argumento un String con el nombre de la persona a saludar
	public static void saludar(String n) {
		System.out.println("Hola soy " + n );
	}
	
	public static void saludarVeces (String n, int v) {
		for (int i=1; i<=v; i++) {
			System.out.println("Hola soy " + n + " vez " + i);
		}
	}
	
	public static void dibujarCuadrado (int columnasTotales, int filasTotales) {
		// Recorre filas
		for(int f = 1; f <= filasTotales; f++) {
			// Recorre columnas para cada fila
			for (int c = 1; c <= columnasTotales; c++) {
				// Decidimos si imprimimos "*" o espacio
				if (f == filasTotales || f == 1 || c == 1 || c == columnasTotales) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
