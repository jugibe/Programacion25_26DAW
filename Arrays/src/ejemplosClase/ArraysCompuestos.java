package ejemplosClase;

import java.util.Arrays;

/*
 * Lorena Arias 10/11/2025
 * Arrays Compuestos
 */

public class ArraysCompuestos {

	public static void main(String[] args) {
		//Definir un array cuyos elementos son arrays
		int [][] arrayCompuesto = {{1,2,3,4},{5,6,7,8,9},{10,11,12}};
		
		//Acceder a un elemento del Array compuesto
		System.out.println(arrayCompuesto [1][1]);
		System.out.println(arrayCompuesto [2][0]);
		System.out.println(arrayCompuesto [1][0]);
		System.out.println(arrayCompuesto [2][1]);
		
		//Acceder a un elemento de la posición del Array compuesto
		System.out.println(Arrays.toString(arrayCompuesto [1]));
		
		//Recorrer el array
		//OPCION1 --> A través de los índices [fila][columna]
		for (int f=0; f<arrayCompuesto.length; f++) {
			for (int c=0; c<arrayCompuesto[f].length; c++) {
				System.out.printf("%4d",arrayCompuesto[f][c]);
			}
			System.out.println();
		}
		
		
		

	}

}
