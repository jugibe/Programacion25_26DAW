package condicionales;

import java.util.Scanner;

/*
 * fecha 25/09/2025
 * nombre javier
 * programa para manejar condicionales de tipo IF anidados
 * programa que pide un numero y me dice si es par o impar si es positivo
 * 
 */
public class IfAnidado {

	public static void main(String[] args) {
		// declaracion de variables
		int n1;
		Scanner sc = new Scanner(System.in);
		//entrada de datos
		System.out.println("Dime un numero");
		n1 = sc.nextInt();
		//proceso
		if (n1<0) {
			System.out.println("El numero es negativo");
		}else {
			if(n1%2==0) {
				System.out.println("El numero es par");
			}else {
				System.out.println("El numero es impar");
			}
		}
		sc.close();
	}

}
