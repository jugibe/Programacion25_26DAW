package EjerciciosArraysCompuestos;
/*
 * Crea una matriz de 4x4. Llénala con valores aleatorios entre 1 y 9. 
Muestra la matriz y calcula la suma de su diagonal principal. 
 */
public class SumaDiagonal {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		llenarArray(array);
		mostrarArray(array);
		System.out.println("la suma de la diagonal principal vale: "+ sumarDiagonal(array));

	}
	//Metodo que suma la diagonal principal y devuelve su valor
	//la matriz debe ser cuadrada, si no puede generar una excepcion
	private static int sumarDiagonal(int[][] array) {
		int suma=0;
		for (int i = 0; i < array.length; i++) {
			suma+=array[i][i];
		}
		return suma;
	}
	//metodo que llena el array con numeros aleatorios del 1 al 100
	public static void llenarArray(int f[][]) {
		for(int i=0;i<f.length;i++) {
			for(int j=0;j<f[i].length;j++) {
				f[i][j]=(int)(Math.random()*9)+1;
			}
		}
	}
	//metodo que muestra el array
	public static void mostrarArray(int f[][]) {
		for(int i=0;i<f.length;i++) {
			for(int j=0;j<f[i].length;j++) {
				System.out.printf("%4d",f[i][j]);
			}
			System.out.println("");
		}
	}

}
