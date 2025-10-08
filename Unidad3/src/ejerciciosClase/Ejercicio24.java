package ejerciciosClase;

import java.util.Scanner;

/* Esther Ballesteros
 * 08/10/2025
24)Realizar un algoritmo que pida dos números, un dividendo y un divisor. Si el
divisor es distinto de 0, mostrará el resultado de la operación. En caso contrario le
dirá al usuario “En una división, el divisor no puede ser 0”. 
 
 */ 
public class Ejercicio24 {

	public static void main(String[] args) {
		//declaracion de variables
		double dividendo;
		double divisor;

		//entrada de datos
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca dividendo: ");
		dividendo = sc.nextDouble();
		System.out.println("Introduzca divisor: ");
		divisor = sc.nextDouble();

		if (divisor!=0) {
			System.out.println("El resultado de dividir " + dividendo + " entre " + divisor + " es: " + dividendo/divisor);
		} else {
			System.out.println("En una división, el divisor no puede ser 0");
		}
		sc.close();
	}

}
