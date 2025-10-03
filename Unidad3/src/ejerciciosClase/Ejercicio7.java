package ejerciciosClase;

import java.util.Scanner;

/*
 * 30/09/25 Javier Martín
 * Algoritmo que pida dos números y muestre el mayor.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		//definimos variables
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		int mayor;
		//entrada de datos
		System.out.println("Introduzca un numero: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca otro numero: ");
		n2 = sc.nextInt();
		//proceso
		mayor=(n1<n2)?n2:n1;
		//salida de datos
		System.out.println("El mayor es: "+mayor);

	}

}
