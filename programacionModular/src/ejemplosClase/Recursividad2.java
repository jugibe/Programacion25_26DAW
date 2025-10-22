package ejemplosClase;
/*
 * Alejandro Lozano 22/10/2025
 * Ejemplos de recursividad: Resolver el problema del factorial usando recursividad.
 */
public class Recursividad2 {

	public static void main(String[] args) {
		System.out.println(factorial(5));

	}
	public static long factorial(int n) {
		if (n == 0 || n == 1) {//condición/clausula de salida
			return 1;
		}else {
			return n * factorial(n - 1);//Recursividad(el metodo se llama a si mismo)
		} 
			
	}
}
