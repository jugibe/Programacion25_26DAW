package ejemplosClase;
import java.util.Scanner;
/*
 * Autor: Lorena Arias
 * Fecha: 14/10/2025
 * Enunciado: Ejemplo de clase para trabajar la creación de métodos
 */
public class Ejemplo2 {

	public static void main(String[] args) {
		//System.out.println(suma (5,8));
		//System.out.println(numeroMayor (40, 30));
		//System.out.println(esPar (31));
		//System.out.println(numeroDivisores(20));
		for (int i=1; i<=100; i++) {
			if( esPrimo (i)) {
				System.out.println("el numero " + i + " es primo");
			}
		}
	}

	/*Crear un metodo que le pasemos 2 enteros y nos devuelva la suma*/
	/* public + static + tipo de dato que devuelve (int) + nombre del metodo + (argumentos del metodo)*/
	public static int suma (int n1, int n2) {
		System.out.println("He entrado en metodo Suma");
		return n1+n2;
	}
	//Metodo que le pasa dos numeros y te devuelve el mayor de ellos.
	public static int numeroMayor(int n1, int n2) {
		if (n1>=n2) {
			return n1;
		}else {
			return n2;
		}
	} 
	
	// metodo que devuelve un boleano que indica si el numero que se le pasa es par o impar.
	public static boolean esPar(int n) {
		/*if (n%2==0)         {
			return true ;
		}else {
			return false;
		
		}*/
		return n%2==0;
		
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
	
