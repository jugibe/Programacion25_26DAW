package condicionales;

import java.util.Scanner;

/*
 *29/09/2025 Alejandro Lozano López
 *Programa que me pida por teclado el numero de dia de la semana del 1 al 7 
 *y que me indique si es lectivo, festivo o indeterminado (Hacer con IF y SWITCH)
 */
public class EjemploCondicionales {

	
	public static void main(String[] args) {
		//Declaramos variables
		int numeroDia;
		Scanner teclado=new Scanner(System.in);
		String resultadoFinal;
		//Entrada de datos
		System.out.println("Introduce el día de la semana");
		numeroDia = teclado.nextInt();
		//Proceso
		/*Proceso utilizando if - else if:
		 * if (numeroDia>=1 && numeroDia<=5){ resultadoFinal = "Es un dia lectivo";
		 * }else if (numeroDia==6 || numeroDia==7) { resultadoFinal =
		 * "Es un dia festivo"; }else { resultadoFinal = "Es un dia incorrecto"; }
		 */
		
		
		
		/*Proceso utilizando switch:
		 * switch (numeroDia) { case 1: case 2: case 3: case 4: case 5: resultadoFinal =
		 * "El dia es lectivo"; break; case 6: case 7: resultadoFinal =
		 * "El dia es festivo"; break; default: resultadoFinal = "Es un dia incorrecto";
		 * }
		 */
		
		
		//Utilizamos el operador ternario (?)
		resultadoFinal=(numeroDia>=1 && numeroDia<=5)?"El dia es lectivo":
			((numeroDia==6 || numeroDia==7)?"El dia es festivo":"El dia es incorrecto");
		//Salida de datos
		System.out.println(resultadoFinal);
		teclado.close();
		
	}

}
