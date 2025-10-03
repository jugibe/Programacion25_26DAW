package ejerciciosClase;

import java.util.Scanner;

/*
 * 30/09/25 Javier Martín
 * Algoritmo que pida dos números y diga si son iguales.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//definimos variables
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		String resultado="";
		//entrada de datos
		System.out.println("Introduzca un numero: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca otro numero: ");
		n2 = sc.nextInt();
		//proceso
		resultado = (n1==n2)?"Los numeros son iguales":"Los numeros NO son iguales";
		//salida de datos
		System.out.println(resultado);
		sc.close();
	}

}
