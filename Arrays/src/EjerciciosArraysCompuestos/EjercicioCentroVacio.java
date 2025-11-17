package EjerciciosArraysCompuestos;
/*
 * Mariano CLavero 13/11/2025
 * Crea una matriz de 3x3 con valores enteros. 
Muestra los elementos del borde (primera y última fila y columna), dejando el centro vacío 
en pantalla. 
 */
public class EjercicioCentroVacio {

	public static void main(String[] args) {
		int [][] array = new int[5][4];
		
		llenarArray(array);
		mostrarArrayVacio(array);

	}
	public static void llenarArray(int f[][]) {
		for(int i=0;i<f.length;i++) {
			for(int j=0;j<f[i].length;j++) {
				f[i][j]=(int)(Math.random()*9)+1;
			}
		}
	}
	public static void mostrarArrayVacio(int f[][]) {
		for(int i=0;i<f.length;i++) {
			for(int j=0;j<f[i].length;j++) {
				if (i == 0 || i == f.length-1 || j == 0 || j == f[i].length-1) {
					System.out.printf("%4d",f[i][j]);
				} else {
					System.out.printf("    ");
				}
			}
			System.out.println("");
		}
	}
}
