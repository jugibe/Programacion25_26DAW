package ejercicios;
/*
 * Esther Ballesteros 
 * 21/10/2025
 * Metodos clase Leer
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println(Leer.leerEntero("Introduce numero: "));
		System.out.println(Leer.leerFrase());
		System.out.println(Leer.leerFrase("Introduce tu nombre: "));
		System.out.println(Leer.leerDouble("Introduce un numero decimal: "));
		Leer.cerrarScanner();
	}
		
}
