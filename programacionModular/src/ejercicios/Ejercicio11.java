package ejercicios;
/*
 * Vamos hacer un programa que calcule los primos del 1 al 1000
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		for (int  i =1;i<=1000; i++) {
			if (esPrimo(i)) {
				System.out.println(i + " es primo ");
			}
			
		}

	}
	//Metodo que le pasa un numero y que te devuelve cuantos divisore tiene.
		public static int numeroDivisores (int n) {
			int numeroDivisores = 0;
			for(int i=1; i<=n; i++) {
				if (n%i==0) {
					numeroDivisores++;
				}
			}
			return numeroDivisores;
		}
		//Metodo que indica si un numero es primo o no es primo
		public static boolean esPrimo (int n) {
			return numeroDivisores (n)==2;
		}	
}
