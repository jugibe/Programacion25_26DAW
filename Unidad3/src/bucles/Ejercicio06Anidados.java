package bucles;

import java.util.Scanner;

/*
 * 14/10/2015
 * Mariano Clavero
 * Dibujar la figura
 */
/*
    *
   ***
  *****
 *******
*********
*/
public class Ejercicio06Anidados {

	public static void main(String[] args) {
		// Declaramos variables
		int filasTotales; 
		
		Scanner sc = new Scanner (System.in);
		
		// introducir numero de filas
		System.out.println("Introduce numero de filas");
		filasTotales = sc.nextInt();
		// dibujamos figura
		for (int f = 1; f <= filasTotales; f++) {
			// Dibujo los espacios para cada fila
			for (int e = 1; e <= (filasTotales-f); e++) {
				System.out.print(" ");
			}
			// Dibujo los "*"
			for (int a = 1; a <= 2*f-1; a++){
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
