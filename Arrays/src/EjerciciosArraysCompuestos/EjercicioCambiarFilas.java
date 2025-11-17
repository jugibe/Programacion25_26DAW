package EjerciciosArraysCompuestos;

import java.util.Arrays;

public class EjercicioCambiarFilas {
	/*
	 * Esther Ballesteros Solé 12/11/2025
	 * 
	 * Ej 7 Generar una matriz de 5x5 numérica entera, a continuación pedir dos
	 * números de fila, que se deben filtrar entre 1 y 5 e intercambiar ambas filas.
	 * Presentar las matrices antes y después del cambio.
	 */
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int fila1 = 0;
		int fila2 = 0;

		llenarArray(array);
		mostrarArray(array);
		System.out.println("*****************");

		// pedir fila
		fila1 = pedirFila("Introduce la primera fila: ");
		fila2 = pedirFila("Introduce la segunda fila: ");

		cambiarLineas(array, fila1 - 1, fila2 - 1);
		mostrarArray(array);
	}

	private static void llenarArray(int f[][]) {
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				f[i][j] = (int) (Math.random() * 9) + 1;
			}
		}
	}

	private static void mostrarArray(int f[][]) {
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				System.out.printf("%4d", f[i][j]);
			}
			System.out.println("");
		}
	}

	// metodo que recibe 1 array y 2 filas y las intercambia
	// tenemos que intercambiar las filas: array[f1] por array[f2]
	private static void cambiarLineas(int[][] array, int f1, int f2) {
		int[] aux = array[f1];
		array[f1] = array[f2];
		array[f2] = aux;
	}

	private static int pedirFila(String mensaje) {
		int resultado = 0;
		do {
			resultado = Leer.leerEntero(mensaje);
		} while (resultado <= 0 || resultado > 5);
		return resultado;
	}
}
