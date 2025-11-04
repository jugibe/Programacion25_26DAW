package ejemplosClase;

import java.util.Arrays;

/*
 * 04/11/2025
 * Lorena Arias  
 * Ejemplos de uso de Arrays.
 */

public class Ejemplo4 {

	public static void main(String[] args) {
		
		//Declaramos Array 5 enteros
		int arrayEnteros [] = new int [10];
		//En este array voy a llevar el conteo de las veces que sale cada numero
		int arrayContar[] = new int [6];
		
		/*
		//ESTA MANERA DE RELLENAR EL ARRAY NO ES FACTIBLE CUANDO SON DEMASIADAS POSICIONES
		//Lo llenamos de numeros aleatorios
		arrayEnteros[0] = (int) (Math.random()*6+1); 
		arrayEnteros[1] = (int) (Math.random()*6+1);
		arrayEnteros[2] = (int) (Math.random()*6+1);
		arrayEnteros[3] = (int) (Math.random()*6+1);
		arrayEnteros[4] = (int) (Math.random()*6+1);
		*/
		
		/*
		//ESTE METODO ES LA FACTIBLE CUANDO HAY MUCHAS POSICIONES
		///Rellenamos el array con un bucle
		for(int i=0; i<arrayEnteros.length; i++) {
			arrayEnteros[i] = (int) (Math.random()*6+1);
		}
		*/
		
		//Rellenamos el array con un metodo
		rellenarArray(arrayEnteros);
		
		//Imprimimos Array
		System.out.println(Arrays.toString(arrayEnteros));
		
		//Contamos las veces que aparece cada numero
		for (int x:arrayEnteros) {
			//Sumar 1 a la posicion x-1 del arrayContador
			arrayContar [x-1]++;
		}
		
		System.out.println(Arrays.toString(arrayContar));
		
	}

	private static void rellenarArray(int[] arrayEnteros) {
		for(int i=0; i<arrayEnteros.length; i++) {
			arrayEnteros[i] = (int) (Math.random()*6+1);
		}
		
	}

}
