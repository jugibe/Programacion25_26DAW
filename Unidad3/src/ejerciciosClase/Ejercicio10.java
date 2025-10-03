package ejerciciosClase;

import java.util.Scanner;

/*Mario Laborda
 * 30/09/2025
 * Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor.
 */
public class Ejercicio10 {
	public static void main(String[] args ) {
		//Declaramos variables 
		int n1 , n2 , n3;
		Scanner sc = new Scanner(System.in);
		//Entrada de datos 
		System.out.println("introduce el primer numero");
		n1=sc.nextInt();
		System.out.println("introduce el segundo numero");
		n2=sc.nextInt();
		System.out.println("introduce el tercer numero");
		n3=sc.nextInt();
		//proceso
		if (n1>=n2) {
			if (n1>=n3) {
				System.out.println("El mayor es "+n1);
			}else {
				System.out.println("El mayor es "+n3);
			}
		}else {
			if (n2>=n3) {
				System.out.println("El mayor es "+n2);
			}else{
				System.out.println("El mayor es "+n3);
			}
		}
		sc.close();
		
	}
}
