package ejercicios;
/*
 * 23/10/2025
 * Mariano Clavero
 * Crear una método maximo(int n1, int n2, int n3) que devuelva el valor máximo de los tres
números
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println(maximo(3,1,2));

	}
	public static int maximo(int n1, int n2, int n3) {
//		if (n1 >= n2 && n1 >= n3) {
//			return n1;
//		}else if (n2 >= n1 && n2 >= n3) {
//			return n2;
//		}else {
//			return n3;
//		}
		return Math.max(n1, Math.max(n2, n3));
	}
}
