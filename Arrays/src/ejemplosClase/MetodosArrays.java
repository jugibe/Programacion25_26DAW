package ejemplosClase;

import java.util.Arrays;

/*
 * Esther Ballesteros
 * 05/11/2025
 * Ejercicios sobre metodos de la clase Arrays
 */
public class MetodosArrays {

	public static void main(String[] args) {
		/*
		 * PRIMER EJEMPLO DE METODO copyOf public static int[] copyOf​(int[] original,
		 * int newLength) Copies the specified array, truncating or padding with zeros
		 * (if necessary) so the copy has the specified length. For all indices that are
		 * valid in both the original array and the copy, the two arrays will contain
		 * identical values. For any indices that are valid in the copy but not the
		 * original, the copy will contain 0. Such indices will exist if and only if the
		 * specified length is greater than that of the original array.
		 */
		int[] vector1 = { 1, 2, 3, 4, 5 };
		int[] vector2 = Arrays.copyOf(vector1, 7);
		System.out.println(Arrays.toString(vector1));
		System.out.println(Arrays.toString(vector2));
		vector2 = Arrays.copyOf(vector2, 3);
		System.out.println(Arrays.toString(vector1));
		System.out.println(Arrays.toString(vector2));

		/*
		 * equals public static boolean equals​(int[] a, int[] a2) Returns true if the
		 * two specified arrays of ints are equal to one another. Two arrays are
		 * considered equal if both arrays contain the same number of elements, and all
		 * corresponding pairs of elements in the two arrays are equal. In other words,
		 * two arrays are equal if they contain the same elements in the same order.
		 * Also, two array references are considered equal if both are null.
		 */

		int[] v1 = { 1, 2, 3 };
		int[] v2 = { 1, 2, 3 };
		System.out.println(v1 == v2); // da false porque son 2 vectores distintos
		System.out.println(Arrays.equals(v1, v2)); // da true porque el contenido es el mismo

		// se puede comparar por rangos
		/*
		 * public static boolean equals​(int[] a, int aFromIndex, int aToIndex, int[] b,
		 * int bFromIndex, int bToIndex) Returns true if the two specified arrays of
		 * ints, over the specified ranges, are equal to one another.
		 */
		System.out.println(Arrays.equals(v1, 0, 1, v2, 0, 1)); // da true

		/*
		 * public static void fill​(int[] a, int fromIndex, int toIndex, int val)
		 * Assigns the specified int value to each element of the specified range of the
		 * specified array of ints. The range to be filled extends from index fromIndex,
		 * inclusive, to index toIndex, exclusive. (If fromIndex==toIndex, the range to
		 * be filled is empty.)
		 */

		int[] vectorcito = new int[5];
		System.out.println(Arrays.toString(vectorcito)); // pone ceros porque pone valor por defecto si no esta
															// especificado
															// si fuesen clases pondria null
		Arrays.fill(vectorcito, 7);
		System.out.println(Arrays.toString(vectorcito));

		Arrays.fill(vectorcito, 1, 3, 8);
		System.out.println(Arrays.toString(vectorcito)); // NO INCLUYE EL DEL INDICE FINAL (toINDEX), igual que en
															// strings

		/*
		 * public static void sort​(int[] a) Sorts the specified array into ascending
		 * numerical order.
		 */
		
		int[] nuevoVector = {7,3,12,21,0,-4};
		Arrays.sort(nuevoVector);
		System.out.println(Arrays.toString(nuevoVector));

		
		
		//invertir el vector
		for(int i = 0; i<nuevoVector.length/2; i++) {
			//cambiamos nuevo vector[i] por vector[nuevoVector.length-1 -i]
			int aux=nuevoVector[i];
			nuevoVector[i]=nuevoVector[nuevoVector.length-1-i];
			nuevoVector[nuevoVector.length-1-i]=aux;
		}
		System.out.println(Arrays.toString(nuevoVector));
	}

}
