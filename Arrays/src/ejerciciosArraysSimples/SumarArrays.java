package ejerciciosArraysSimples;
/*
 * Alejandro Lozano 10/11/2025
 * Crea dos arrays del mismo tamaño con valores enteros.
 * Genera un tercer array que contenga la suma elemento a elemento de los dos anteriores.
 */
public class SumarArrays {

	public static void main(String[] args) {
		//Crear los arrays
		int []array1 = {1,2,3,4,5};
		int []array2 = {6,7,8,9,10};
		int []arraySuma = sumaArrays(array1, array2);
		
		//Imprimir resultados
		imprimirVector(array1);
		System.out.println("+");
		imprimirVector(array2);
		System.out.println("------------------------");
		imprimirVector(arraySuma);
		
	}
	//Metodo al que le pasamos como parametros 2 int[] y devuelve otro int[] con la suma
	//Presuponemos que todos los int[] tienen la misma dimension //si no fuesen de la misma rellenar con 0 el más pequeño
	private static int[] sumaArrays(int[]v1, int[]v2) {
		int[]resultado = new int [v1.length];
		//hacemos un for para recorrer los vectores
		for (int i = 0; i < v1.length; i++) {
			resultado[i] = v1[i] + v2[i];
		}
		return resultado;
	}
	//Metodo que imprime un vector usando Printf (formato determinado)
	private static void imprimirVector(int[]vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%4d",vector[i]);
		}
		System.out.println();//Salto de linea despues de cada vector
	}
}
