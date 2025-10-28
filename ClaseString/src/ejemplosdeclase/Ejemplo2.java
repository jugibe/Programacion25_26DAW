package ejemplosdeclase;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * Jeyson Delgado
 * 27/10/2025
 */
public class Ejemplo2 {

	public static void main(String[] args) {
		//Comparar cadenas
		String s1 = "Literal";
		String s2 = "Literal";
		String s3 = new String ("Literal");
		if (s1==s3) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintas");
		}
		//Para comparar condadenas utilizaremos .equals
		if (s1.equals(s3)) {
			System.out.println("Tienen el mismo contenido");
		}else {
			System.out.println("No Tienen el mismo contenido");
		}
		
		/*
		 * Comparar dos cadenas lexicográficamente: int compareTo(String otraCadena)
			Realiza la comparación lexicográfica entre la cadena y la otra cadena indicada por parámetro. La
			comparación se basa en los códigos Unicode de cada carácter de las cadenas.
			Si la cadena precede lexicográficamente a la otra cadena, devuelve un número entero negativo.
			Si la cadena es igual a la otra cadena, devuelve cero.
			Si la cadena sucede lexicográficamente a la otra cadena, devuelve un número entero positivo.
		 */
		
		String c1="Cosa";
		String c2="Casa";
		System.out.println(c1.compareTo(c2));
	}

}
