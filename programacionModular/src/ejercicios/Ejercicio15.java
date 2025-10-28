package ejercicios;

public class Ejercicio15 {

	public static void main(String[] args) {
		final int LIMITEMAX=1000;
		for(int n=1;n<=LIMITEMAX;n++) {
			if(esPerfecto(n)) {
				System.out.println("El numero "+ n + " es perfecto");
			}
		}

	}

	//Metodo que le pasa un numero y que te devuelve la suma de sus divisores sin conarlo.
	public static int sumaDivisores (int n) {
		int sumaDiv = 0;
		for(int i=1; i<n; i++) {
			if (n%i==0) {
				sumaDiv+=i;
			}
		}
		return sumaDiv;
	}
	//metodo q	ue me dice si un numero es perfecto
	public static boolean esPerfecto(int n) {
		return n==sumaDivisores(n);
		
	}

}
