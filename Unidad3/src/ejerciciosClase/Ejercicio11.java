package ejerciciosClase;

import java.util.Scanner;

/*
 * Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo,
	debe imprimir el producto de los tres y si no lo es, imprimirá la suma.
	30/09/2025
	Jeyson Alejandro Delgado
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		// Declarar variable
		int n1,n2,n3;
		Scanner sc = new Scanner (System.in);
		
		//Entrada datos
		System.out.println("Introduce numero1");
		n1 = sc.nextInt();
		System.out.println("Introduce numero2");
		n2 = sc.nextInt();
		System.out.println("Introduce numero3");
		n3 = sc.nextInt();
		
		//Proceso
		if (n1<0) {
			System.out.println("El producto es"+(n1*n2*n3));
		}else {
			System.out.println("La suma es "+(n1+n2+n3));
		}
		sc.close();
	}

}
