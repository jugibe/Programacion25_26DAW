package bucles;

import java.util.Scanner;

/*
 * 14/10/2015
 * Mariano Clavero
 * Dibujar la figura
  	        *
  	      * *
  	    * * *
  	  * * * *
  	* * * * *	
 */
public class Ejercicio05Anidados {

	public static void main(String[] args) {
		// Declaramos variables
		int filasTotales; 
		
		Scanner sc = new Scanner (System.in);
		
		// introducir numero de filas
		System.out.println("Introduce numero de filas");
		filasTotales = sc.nextInt();
		
		// Dibujar figura
//		for(int i = 1; i <= filasTotales; i++) {
//			for (int j = 1; j <= filasTotales; j++) {
//				if (j <= (filasTotales-i)){
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		for(int i = 1; i <= filasTotales; i++) {
			// Imprimo los espacios
			for (int e = 1; e <= (filasTotales-i);e++) {
				System.out.print(" ");
			}
			// Imprimo "*"
			for (int a = (filasTotales-i)+1; a <= filasTotales; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
