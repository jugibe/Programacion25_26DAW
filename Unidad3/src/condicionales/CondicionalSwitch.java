package condicionales;
/*
 *29/09/2025 Alejandro Lozano López
 *Programa para conocer el funcionamiento del condicional Switch
 *Programa que nos pide un numero y nos dice el dia de la semana que corresponde
 * 1 lunes, 2 martes... 
 */

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		//Declarar variables
		int numeroDia;
		Scanner teclado= new Scanner(System.in);
		String resultadoFinal;
		//Entrada de datos
		System.out.println("Introduce el numero de dia");
		numeroDia = teclado.nextInt();
		//Proceso 
		switch (numeroDia){
			case 1:
				resultadoFinal = "Lunes";
				break;
			case 2:
				resultadoFinal = "Martes";
				break;
			case 3:
				resultadoFinal = "Miercoles";
				break;
			case 4:
				resultadoFinal = "Jueves";
				break;
			case 5:
				resultadoFinal = "Viernes";
				break;
			case 6:
				resultadoFinal = "Sabado";
				break;
			case 7:
				resultadoFinal = "Domingo";
				break;
			default: 
				resultadoFinal = "Dia desconocido";
		}
		//Imprimimos resultados 
		System.out.println("El dia que has elegido es " + resultadoFinal);
		teclado.close();

	}

}
