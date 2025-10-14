package bucles;

import java.util.Scanner;

/*
 * 14/10/2015
 * Mariano Clavero
 * Dibuja un marco (rectángulo) de ancho m y alto n con borde de asteriscos y el interior
vacío.
 */
public class Ejercicio08Anidados {

	public static void main(String[] args) {
		int columnasTotales;
		int filasTotales;
		
		Scanner sc = new Scanner (System.in);
		
		// introducir numero de filas
		System.out.println("Introduce numero de filas");
		filasTotales = sc.nextInt();
		System.out.println("Introduce el numero de columnas");
		columnasTotales = sc.nextInt();
		
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
		sc.close();
	}

}
