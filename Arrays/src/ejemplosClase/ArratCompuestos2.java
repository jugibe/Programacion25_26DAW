package ejemplosClase;
/*
 * Lorena Arias 10/11/2025
 * Arrays Compuestos
 * EJERCICIO 2
 * Crea una matriz de 3x3 con los números del 1 al 9. 
 * Muestra los valores y calcula la suma total de todos los elementos. 
 */

public class ArratCompuestos2 {

	public static void main(String[] args) {
		//Crear matriz
		int [][] matrizNumeros = {{1,2,3},{4,5,6},{7,8,9}}; 

		muestraMatriz (matrizNumeros);
		System.out.println(sumaElementos (matrizNumeros));
		System.out.println(sumaFila (matrizNumeros,2));
	}

	//Metodo para sumar los elementos de UNA UNICA FILA, que le pasamos como parametro.
	private static int sumaFila(int[][] matrizNumeros, int f) {
		int sumaFila =0;
		
		for (int c=0; c<matrizNumeros[f].length; c++) {
			sumaFila=sumaFila+ matrizNumeros[f][c];
		}
		
		return sumaFila;
	}
	
	//Metodo para sumar todos los elementos y devolver la suma de todas las filas y columnas
	private static int sumaElementos(int[][] matrizNumeros) {
		int suma =0;
		
		for (int f=0; f<matrizNumeros.length; f++) {
			for (int c=0; c<matrizNumeros[f].length; c++) {
				suma=suma+ matrizNumeros[f][c];
			}
		}
		
		return suma;
	}

	//Muestra la matriz con Printf
	private static void muestraMatriz(int[][] matrizNumeros) {
		for (int f=0; f<matrizNumeros.length; f++) {
			for (int c=0; c<matrizNumeros[f].length; c++) {
				System.out.printf("%4d",matrizNumeros[f][c]);
			}
			System.out.println();
		}
		
	}

}
