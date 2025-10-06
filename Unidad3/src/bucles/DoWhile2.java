package bucles;

import java.util.Scanner;

/*
 * programa que pida un numero por teclado y escriba la tabla del numero introducido
 * 06/10/2025 Eder Gracia
 */
public class DoWhile2 {

	public static void main(String[] args) {
		// declarar variables
		int numero;//numero introducido por teclado
		int contador;
		Scanner teclado=new Scanner(System.in);
		
		//entrada de datos
		System.out.println("introduce un numero");
		numero =teclado.nextInt();
		
		//proceso salida
		contador=1;
		do {
			System.out.println(numero + " multiplicado por " + contador + " es igual a " + numero*contador);
			contador++;
		} while (contador<=10);
		teclado.close();
	}

}
