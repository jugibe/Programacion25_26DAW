package ejercicios;
/*
 * Programa que calcula el primo mas cercano a un numero dado.
 */
public class PrimoCercano {

	public static void main(String[] args) {
		int incremento=0;
		int numero=13;
		while(!(esPrimo(numero-incremento))){
			incremento ++;
		} 
		
		
			System.out.println("El primo mas cercano a " + numero+  " es " + (numero-incremento));		
		
		

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
