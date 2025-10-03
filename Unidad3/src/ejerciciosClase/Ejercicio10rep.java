package ejerciciosClase;
/*Mario Laborda
 * 30/09/2025
 * Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor.
 */

import java.util.Scanner;

public class Ejercicio10rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos variables 
		int n1 , n2 , n3 , mayor;
		Scanner sc = new Scanner(System.in);
		//Entrada de datos 
		System.out.println("introduce el primer numero");
		n1=sc.nextInt();
		System.out.println("introduce el segundo numero");
		n2=sc.nextInt();
		System.out.println("introduce el tercer numero");
		n3=sc.nextInt();
		//Proceso
		mayor=n1;
		if (mayor<n2) {
			mayor=n2;
		}
		//mayor= (mayor<n2)? n2:;
		if (mayor<n3) {
			mayor=n3;
			
		}
		//mayor= (mayor<n3)? n3:;
		System.out.println("El numero mayor es "+mayor);
		sc.close();
	} 

}
