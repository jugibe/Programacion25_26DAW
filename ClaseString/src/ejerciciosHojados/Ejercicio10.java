package ejerciciosHojados;

import java.util.Arrays;

import ejerciciosClase.Leer;

/*
 * Jeyson Delgado
 * 06/11/2025
 *  Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas letras 
	distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras 
	debemos trabajar solo con mayúsculas.
	
	En este ejercicio utilizamos Arrays.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		String abcd = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//Alfabeto con las letras a buscar
		String frase="";
		//array de reultados, frecuencia [i] tendrá la cantidad de veces que
		//aparece alfabeto.charAt(i) 
		int [] frecuencia = new int [abcd.length()];
		
		do {
			frase=Leer.leerFrase("Introduce una frase");
		}while(frase.length()>=60);
		
		//Pasamos a MAYUS con .toUpperCase
		frase = frase.toUpperCase();
		for(int i=0; i<abcd.length(); i++) {
			frecuencia[i]=contarCaracter(frase,abcd.charAt(i));
		}
		System.out.println(letrasDist(frecuencia));
		imprimirResultado(abcd, frecuencia);
	}
	public static int contarCaracter (String s, char c ) {
		int contador = 0;
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i)==c) {
				contador++;
			}
		}
		return contador;
	}
	public static int letrasDist(int[] f) {
		int contador=0;
		for(int i:f){
			if (i!=0) {
				contador++;
			}
		}
		return contador;
	}
	
	public static void imprimirResultado(String s, int[] f) {
		System.out.println("La frase:");
		System.out.println("tiene "+letrasDist(f)+" Letras distintas");
		System.out.println("Su frecuencia son: ");
		for(int i=0; i<s.length(); i++) {
			if (f [i]!=0) {
				System.out.println(s.charAt(i)+" "+f[i]);
			}
		}
	}
	
}
