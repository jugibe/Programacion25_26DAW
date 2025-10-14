package bucles;

import java.util.Scanner;

/*
 * 14/10/2025
 * Mariano Clavero
 * Dibujar la siguiente figura. Introducir fila por teclado
 	* * * * * *
 	* * * *
 	* * *
 	* *
 	*
 */
public class Ejercicio04Anidados {

	public static void main(String[] args) {
		// Declaramos variables
		int filasTotales; 
		
		Scanner sc = new Scanner (System.in);
		
		// introducir numero de filas
		System.out.println("Introduce numero de filas");
		filasTotales = sc.nextInt();
		
		// dibujar figura
		for (int i = filasTotales; i >= 1; i--) {
			// El bucle interior dibuja i*
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();

	}

}
