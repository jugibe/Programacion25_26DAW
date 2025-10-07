package ejerciciosClase;
import java.util.Scanner;

/*
 * 07/10/2025 Javier Martín Bosque
 *  Realizar un algoritmo que vaya pidiendo números enteros hasta que el usuario
	introduzca un cero. Hay que ir visualizando cada uno de los números insertados,
	excepto el 0 con Do While.
 */
public class Ejercicio18DoWhile {

	public static void main(String[] args) {
		//declaración de variables
		int n1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un numero: ");
			n1=sc.nextInt();
			if(n1!=0) {
				System.out.println("El numero introducido es: "+n1);
			}
		}while(n1!=0);
		sc.close();
		System.out.println("Fin de programa");
	}

}
