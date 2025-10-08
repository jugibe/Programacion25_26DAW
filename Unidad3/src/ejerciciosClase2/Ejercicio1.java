package ejerciciosClase2;

import java.util.Scanner;

/*
 * Escribir un programa que calcule e imprima la SUMA de los números impares
comprendidos entre a y b que deben leerse por teclado y filtrarse para que a<=b
08/10/2025 Eder Gracia
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//declaramos variables
		Scanner sc = new Scanner (System.in);
		int a, b, suma=0;
		String lista="";
		
		//entrada de datos
		System.out.println(" introduce el 1er numero");
		a = sc.nextInt();
		System.out.println(" introduce el 2o numero ");
		b = sc.nextInt();
		
		//proceso-salida
		while (a>b) {
			System.out.println("COMBINACION ERRONEA, EL PRIMERO MENOR QUE EL SEGUNDO");
			System.out.println(" introduce el 1er numero");
			a = sc.nextInt();
			System.out.println(" introduce el 2o numero ");
			b = sc.nextInt();
		}
		//aqui seguro que a es menor que b
		lista = " los numeros impares entre " + a + " y " + b + " son ";
		for (int i = a; i<=b; i++) {
			if (i%2!=0) {
				suma+=i;
				lista += i + " ";
			}
		} 
		System.out.println(lista);
		System.out.println("la suma de los numeros impares comprendidos entre " + a + " y " + b +
				" es: " + suma);
		sc.close();
	}

}
