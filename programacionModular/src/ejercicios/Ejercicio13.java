package ejercicios;
/*
 * 23/10/2025
 * Mariano Clavero
 * Crea un programa en el que se genere un numero aleatorio entre uno y 100 y dispongas de 5
intentos para adivinarlo. Cada vez que intentes adivinarlo el ordenador generará un mensaje
indicando si el número a adivinar es mayor o menor. El juego acaba cuando adivinas el
numero o consumes los cinco intentos. Utiliza identificadores globales y funciones para
resolver el problema.

 */
public class Ejercicio13 {

	public static void main(String[] args) {
		int numeroAdivinar = (int)(Math.random() * 100 + 1);
		System.out.println(numeroAdivinar);
		int intentos = 0;
		final int INTENTOS_MAXIMOS = 5;
		boolean hasAdivinado = false;
		
		do {
			intentos++;
			hasAdivinado = jugar(numeroAdivinar);
			// No hace falta el metodo
			// hasAdivinado = Leer.leerEntero("Introduce un numero") == n
		}while (intentos <= INTENTOS_MAXIMOS && !hasAdivinado);
		if (hasAdivinado) {
			System.out.println("Enhorabuena has adivinado el numero");
		}else {
			System.out.println("Lo siento, se te han acabado los intentos");
		}
	}
	
	public static boolean jugar(int n) { // n representa el numero que hay que adivinar
		int numero = Leer.leerEntero("Introduce un numero");
		if(numero == n) {
			return true;
		}else if (numero > n){
			System.out.println("El numero a adivinar es menor");
		}else {
			System.out.println("El numero a adivinar es mayor");
		}
		return false;
	}

}
