package ejerciciosHojados;

import ejemplosdeclase.Leer;

/*
 * Esther Ballesteros
 * 
 * 
 * 9. Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro 
primeros sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo 
(H ó M) sexo, el sexto un numero que representa el curso 1 ó 2 y los caracteres séptimo y 
octavo pueden tener cualquier valor. Deben rechazarse los códigos que no cumplan estas  condiciones, la 
finalización de entrada de códigos se produce cuando se introduce el código 
“00000000”. Al final el programa debe sacar un informe indicando cuántos hombres y 
mujeres, cuantos hay matriculados en primero y segundo y cuántos códigos correctos han sido 
leídos.
 */
public class Ejercicio09Codigos {

	public static void main(String[] args) {

		String codigo = "";
		int codigosCorrectos = 0;
		int hombres = 0;
		int mujeres = 0;
		int primero = 0;
		int segundo = 0;

		do {
			codigo = Leer.leerFrase("Introduce un codigo: ");
			if (validar(codigo)) {
				System.out.println("Codigo valido");
				codigosCorrectos++;
				if (codigo.charAt(4) == 'H') {
					hombres++;
				} else {
					mujeres++;
				}
				if (codigo.charAt(5) == '1') {
					primero++;
				} else {
					segundo++;
				}
			} else if (codigo.equals("00000000")){
				System.out.println("Adios");
			} else {
				System.out.println("Codigo erroneo");
			}

		} while (!(codigo.equals("00000000")));
		
		//imprimir resultados
		System.out.println("Has introducido " + codigosCorrectos + " codigos correctos");
		System.out.println("Hay " + hombres + " hombres");
		System.out.println("Hay " + mujeres + " mujeres");
		System.out.println("De estas personas, " + primero + " van a primero");
		System.out.println("De estas personas, " + segundo + " van a segundo");


	}

	public static boolean validar(String s) {
		// condiciones
		// si el codigo no tiene 8 caracteres return false
		boolean longitud = s.length() == 8;
		if (!longitud) {
			return false;
		}
		// que los 4 primeros caracteres sean numericos
		boolean cuatroNumeros = s.substring(0, 4).matches("[0-9]{4}");

		// que esten desde 1990 hasta 1995 inclusive
		boolean entreFecha = ((Integer.parseInt(s.substring(0, 4)) > 1990)
				&& ((Integer.parseInt(s.substring(0, 4)) <= 1995)));

		// el quinto carácter sea solo (H ó M)
		boolean quintoCaracter = (s.charAt(4) == 'H' || s.charAt(4) == 'M');

		// el sexto un numero que representa el curso 1 ó 2
		boolean sextoNumero = (s.charAt(5) == '1' || s.charAt(5) == '2');

		// los caracteres séptimo y octavo pueden tener cualquier valor.

		return longitud && cuatroNumeros && entreFecha && quintoCaracter && sextoNumero;
	}
}
