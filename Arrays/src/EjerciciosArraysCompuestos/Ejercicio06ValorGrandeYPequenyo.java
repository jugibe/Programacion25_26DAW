package EjerciciosArraysCompuestos;
/*
 * Generar una matriz de 5x5  (numérica entera) e imprimir el valor más grande 
 * y el más pequeño y los lugares donde se encuentran. 
 */
public class Ejercicio06ValorGrandeYPequenyo {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		llenarArray(array);
		mostrarArray(array);
		System.out.println("El mayor es: "+valoresMayoresArray(array)[0]);
		System.out.println("La fila es: "+valoresMayoresArray(array)[1]);
		System.out.println("El columna es: "+valoresMayoresArray(array)[2]);

		System.out.println("El menor es: "+valoresMenoresArray(array)[0]);
		System.out.println("La fila es: "+valoresMenoresArray(array)[1]);
		System.out.println("El columna es: "+valoresMenoresArray(array)[2]);
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
	private static int[] valoresMayoresArray (int[][] array) {
		int[] datos = new int[3]; 
		datos[0] = array[0][0]; // Guardamos el valor mayor
		datos[1] = 0; // Guardamos la fila del valor mayor
		datos[2] = 0; // Guardamos la columna del valor mayor
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > datos[0]) { // Condicion de mayor
					datos[0] = array[i][j];
					datos[1] = i;
					datos[2] = j;
				}
			}
		}
		return datos;
	}
	private static int[] valoresMenoresArray (int[][] array) {
		int[] datos = new int[3]; 
		datos[0] = array[0][0]; // Guardamos el valor menor
		datos[1] = 0; // Guardamos la fila del valor menor
		datos[2] = 0; // Guardamos la columna del valor menor
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < datos[0]) { // Condicion de menor
					datos[0] = array[i][j];
					datos[1] = i;
					datos[2] = j;
				}
			}
		}
		return datos;
	}
}
