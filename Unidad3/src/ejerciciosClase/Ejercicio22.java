package ejerciciosClase;

import java.util.Scanner;

/* Esther Ballesteros
 * 08/10/2025
22) Pedir 2 números enteros y decir si el primero es múltiplo del segundo. 
 */ 
public class Ejercicio22 {

	public static void main(String[] args) {
		// declaramos variables
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		
		//entrada de datos
		System.out.println("Introduzca el primer numero: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		num2 = sc.nextInt();
		
		if (num1%num2==0) {
			System.out.println(num1 + " es multiplo de " + num2);
		} else {
			System.out.println(num1 + " no es multiplo de " + num2);
		}
		sc.close();
	}

}
