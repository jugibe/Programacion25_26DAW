import java.util.Scanner;

public class Ejercicio3 {
	// calcula el factorial de un numero entre 0 y 50. si el numero no es valido
	// debe seguir pidiendo
	// en la suma tenia que incluir un numero negativo
	/*
	 * 30/10/2025 Esther Ballesteros Solé
	 */
	public static void main(String[] args) {
		// declaramos variables
		int n = 0;
		long factorial = 1; // factoriales son numeros grandes. tiene que inicializarse en 1 porque si fuera
							// 0 se multiplicaria por 0

		Scanner sc = new Scanner(System.in);

		do {
			// pedir un numero valido
			System.out.println("introduce numero: ");
			n = sc.nextInt();

		} while (n > 50 || n < 1);
		// ya se que mi numero es valido
		// calculamos el factorial
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + n + " es " + factorial);

		sc.close();
	}
}
