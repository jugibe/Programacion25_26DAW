package ejerciciosClase;

import java.util.Scanner;

/* Esther Ballesteros
 * 08/10/2025
23) Desarrollar un algoritmo que calcule y muestre el cuadrado de los 9 primeros
números naturales. 
 
 */ 
public class Ejercicio23 {

	public static void main(String[] args) {

		for (int i=1;i<=9;i++) {
			System.out.println("El cuadrado de " + i + " es " + Math.pow(i, 2));
		}
		
	}

}
