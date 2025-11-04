package ejemplosClase;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * 04/11/2025
 * Lorena Arias  
 * Ejemplos de uso de Arrays.
 */

public class Ejemplo2 {
	public static void main(String[] args) {
		//Declaramos Arrays
		int array1 []= {1,2,3};
		int array2 []= {4,5,6};
		
		//Imprimir Array
		//¡¡SOLO UTILIZAR PARA PRUEBA!!
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		array1=array2;
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		//Si modifico un elemento se modifica en los dos Arrays
		array1[0]= 55;
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		//Voy a pasar el Array a un método para modificar el Array
		metodoPrueba(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

	private static void metodoPrueba(int[] array1) {
		array1[0]=1000;
		
		
	}
}
