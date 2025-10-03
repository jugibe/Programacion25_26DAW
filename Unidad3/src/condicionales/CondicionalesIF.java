package condicionales;

import java.util.Scanner;

/*
 * fecha 25/09/2025
 * nombre javier
 * programa para manejar condicionales de tipo IF
 * programa que pide un numero y me dice si es par o impar 
 * 
 */
public class CondicionalesIF {

	public static void main(String[] args) {
		// declaramos variables
		int n1;
		Scanner sc = new Scanner(System.in);
		String resultado;
		//entrada de datos
		System.out.println("Introduzca un numero: ");
		n1 = sc.nextInt();
		//proceso
		if (n1%2==0) {
			resultado="el numero es par";
		}else {
			resultado="el numero es impar";
		}
		//salida
		System.out.println(resultado);
		sc.close();
	}

}
