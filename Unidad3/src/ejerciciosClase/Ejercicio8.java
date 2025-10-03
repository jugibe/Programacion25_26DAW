package ejerciciosClase;

import java.util.Scanner;

/*
 * 30/09/25 Javier Martín
 * Algoritmo que pida dos números y diga cuál de ellos es mayor o bien si son iguales.
 */
public class Ejercicio8 {
	
	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		String resultado="";
		//entrada de datos
		System.out.println("Introduzca un numero: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca otro numero: ");
		n2 = sc.nextInt();
		//proceso
		if(n1>n2) {
			resultado="El mayor es: "+n1;
		}else if(n1==n2) {
			resultado="Son iguales";
		}else {
			resultado="El mayor es: "+n2;
		}
		//salida de datos
		System.out.println(resultado);
		sc.close();
		
	}

}
