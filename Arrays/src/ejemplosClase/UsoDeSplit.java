package ejemplosClase;

import java.util.Arrays;

/*
 * Mariano Clavero 11/11/2025
 * public String[] split(String regex)
Splits this string around matches of the given regular expression.
This method works as if by invoking the two-argument split method 
with the given expression and a limit argument of zero. Trailing 
empty strings are therefore not included in the resulting array.
 */
public class UsoDeSplit {

	public static void main(String[] args) {
		String cadena = "La casa es  azul";
		// El metodo split() me devuelve un array de Strings 
		// Parte la cadena principal utilizando una expresion regular 
		// En este caso separa las palabras de la frase teniendo en cuenta cada espacio entre ellas
		String[] listaPalabras = cadena.split(" +"); //Expresion regular uno o mas espacios
		System.out.println(Arrays.toString(listaPalabras));
		System.out.println("La frase tiene: "+ listaPalabras.length + " palabras");
		for (int i = 0; i < listaPalabras.length; i++) {
			System.out.println("palabra "+i+":"+listaPalabras[i]);
		}
		
		// Ejemplo ficheros csv.
		String datos = "3,5,6,8,1";
		String[] listaDatos = datos.split(",");
		System.out.println(Arrays.toString(listaDatos));
		int suma = 0;
		for (int i = 0; i < listaDatos.length; i++) {
			suma += Integer.parseInt(listaDatos[i]);
		}
		System.out.println("La suma vale: "+suma);
	}

}
