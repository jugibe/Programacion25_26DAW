package bucles;

import java.util.Scanner;

/* Esther Ballesteros Solé
 * programa para aprender bucle while - pide numeros enteros hasta que introduzcamos un numero negativo
 * 01/10/2025
 */ 

public class ProgramaWhile2 {

	public static void main(String[] args) {
		// declaramos variables
		int numero = 0;
		int suma = 0;
		int contador = 0;
		String numerosIntroducidos = "";
		Scanner teclado = new Scanner(System.in);
		// introduccion de datos
		System.out.println("introduce un numero");
		numero=teclado.nextInt();

		while (numero>=0) {
			contador++;
			suma = suma+numero;
			numerosIntroducidos=numerosIntroducidos+ " "+numero;
			System.out.println("introduce un numero");
			numero=teclado.nextInt();
		}
		teclado.close();
		System.out.println("has introducido "+contador+" numeros validos");
		System.out.println("la suma de los numeros introducidos es "+ suma);
		System.out.println("los numeros que has introducido son "+numerosIntroducidos);

	}

}
