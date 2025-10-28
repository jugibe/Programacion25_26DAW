package ejercicios;
/*
 * 23/10/2025
 * Mariano Clavero
 * Crea una método sumatorio(int n) que devuelva la suma de todos los números desde 1 hasta
	n.
 */

public class Ejercicio7 {
	

	public static void main(String[] args) {
		System.out.println(sumatorio(-7));
		System.out.println(sumatorioRecursivo(-7)); // Arreglar para que calcule con numeros negativos

	}
	// Metodo que le paso n y devuelve su sumatorio
	public static int sumatorio(int n) {
		int sumatorio = 0;
		
		for(int i=1;i <= n;i++) { // Sumamos todos los numeros desde el 1 hasta n
			sumatorio += i;
		}
		return sumatorio;
	}
	// Metodo que calcula el sumatorio de forma recursiva
	public static int sumatorioRecursivo(int n) {
		if (n == 1) {
			return 1;
		}else if (n == 0){
			return 0;
		}
		else {
			return n + sumatorioRecursivo(n-1);
		}
	}
	

}
