package entradaDeDatos;

import java.util.Scanner;

/*
 * Programa para aprender a utilizar la clase Scaner
 * para introducir datos desde el teclado. 
 * 24/09/2025 Eder Gracia
 */
public class EntradaTeclado {

	public static void main(String[] args) {
		//declaramos variables 
		Scanner teclado=new Scanner(System.in);
		int num1;
		int num2;
		String nombre;
		int suma, resta, multiplicacion;
		double cociente;
		//introducir numeros
		System.out.println("introduce un numero");
		num1=teclado.nextInt();
		System.out.println("introduce otro numero");
		num2=teclado.nextInt();
		System.out.println("introduce tu nombre");
		teclado.nextLine(); //limpiar el teclado 
		nombre=teclado.nextLine();
		//realizamos las operaciones
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		cociente = (double)num1/num2;
		//impresion de resultados
		System.out.println("hola, bienvenido " + nombre + 
				" has introducido los numeros " + num1 + "," + num2);
		System.out.println("la suma de los numeros es " + suma);
		System.out.println("la resta de los numeros es " + resta);
		System.out.println("la multiplicacion de los numeros es " + multiplicacion);
		System.out.println("la division de los numeros es " + cociente);
		teclado.close();
		System.out.println("Fin de programa");

	}

}
