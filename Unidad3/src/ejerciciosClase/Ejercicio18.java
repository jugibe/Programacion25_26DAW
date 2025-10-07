package ejerciciosClase;

import java.util.Scanner;

/*
 * 07/10/2025 Javier Martín Bosque
 *  Realizar un algoritmo que vaya pidiendo números enteros hasta que el usuario
	introduzca un cero. Hay que ir visualizando cada uno de los números insertados,
	excepto el 0.
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		//declaración de variables
		int n1;
		Scanner sc = new Scanner(System.in);
		//entrada de datos
		System.out.println("Introduce un numero: ");
		n1=sc.nextInt();
		while(n1!=0) {
			System.out.println("Acabas de introducir: "+n1);
			System.out.println("Introduce un numero: ");
			n1=sc.nextInt();
		}
		sc.close();
		System.out.println("Fin del programa");
	}

}
