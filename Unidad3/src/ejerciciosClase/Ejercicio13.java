package ejerciciosClase;
import java.util.Scanner;

/*
 * Dadas dos variables numéricas a y b, que el usuario debe introducir por teclado, se
	pide realizar un algoritmo que intercambie los valores de ambas variables y
	muestre por pantalla cuánto valen al final las dos variables.
	30/09/2025
	Jeyson Alejandro Delgado
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		//Declarar variables
		int a=5, b=15;
		int aux;
		System.out.println("Antes del intercambio a= "+a +" b= "+b);
		
		//proceso
		
		aux=a;
		a=b;
		b=aux;
		
		//salida datos
		System.out.println("despues del intercambio a= "+a +" b= "+b);

	}

}
