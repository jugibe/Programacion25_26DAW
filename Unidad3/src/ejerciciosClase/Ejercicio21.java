package ejerciciosClase;

import java.util.Scanner;

/* Esther Ballesteros
 * 08/10/2025
21) Escribir un programa que vaya pidiendo números hasta que el usuario introduzca un
cero, para cada número introducido, debe mostrar por pantalla si el número es par o
impar. Recuerda que pueden anidarse sentencias de repetición y de selección. 
 */ 
public class Ejercicio21 {

	public static void main(String[] args) {
		// declaramos variables
		int num1 = 0;
		Scanner sc = new Scanner(System.in);
		
		//entrada de datos
		System.out.println("Introduzca numero: ");
		num1 = sc.nextInt();
		
		while (num1!=0) {
			if (num1%2==0) {
				System.out.println("El numero " + num1 + " es par");
			} else {
				System.out.println("El numero " + num1 + " es impar");
			
			}
			System.out.println("Introduzca numero: ");
			num1 = sc.nextInt();
		}
		sc.close();

	}

}
