package ejerciciosClase;

import java.util.Scanner;

/*
 * 07/10/2025 Javier Martín Bosque
 * Escribir un programa que vaya pidiendo números hasta que el usuario introduzca un
	cero. Cuando termine tiene que mostrar la suma de todos los números introducidos
	y cuántos números se han introducido en total (el 0 no cuenta).
 */
public class Ejercicio19 {

	public static void main(String[] args) {
		//declaración de variables
		int n1, suma=0, contador=0;
		Scanner sc = new Scanner(System.in);
		//entrada y proceso
		System.out.println("Introduzca un numero: ");
		n1=sc.nextInt();
		while(n1!=0) {
			contador++;
			suma+=n1;
			System.out.println("Introduzca un numero: ");
			n1=sc.nextInt();
		}
		//salida de datos
		System.out.println("Has introducido "+contador+" numeros");
		System.out.println("Su suma es "+suma);
		sc.close();
	}

}
