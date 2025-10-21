package ejercicios;
/*
 * Javier Martín Bosque 21/10/2025
 * Crea un metodo que me indique las cifras de un numero.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(cifrasNumero(40));

	}
	
	public static int cifrasNumero(int n) {
		//declaración variables
		int cifras = 0; //vamos a almacenar el numero de cifras del numero n.
		do {
			cifras++; //sumamos 1 al contador cada vez que entramos en el bucle
		}while((n/(int)Math.pow(10, cifras))!=0); //dividimos el numero entre 10 hasta que el resto sea 0.
		return cifras; //devolvemos el numero de cifras.
	}
}
