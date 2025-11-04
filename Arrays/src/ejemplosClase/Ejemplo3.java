package ejemplosClase;

import java.util.Arrays;

/*
 * 04/11/2025
 * Lorena Arias  
 * Ejemplos de uso de Arrays.
 */

public class Ejemplo3 {

	public static void main(String[] args) {
		//Declaramos Array por enumeración
		String diaSemana [] = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};

		//Recorremos el Array con foreach
		for(String s:diaSemana) {
			System.out.println(s);
			//NO MODIFICA EL VALOR DE s.
			s="Hola";
		}
		
		//Imprime en la misma línea y pone los valores entre corchetes
		System.out.println(Arrays.toString(diaSemana));
	}

}
