import java.util.Scanner;

public class Ejercicio1 {
	// sumatorio. me tenia que pedir numeros y sumarlos hasta que la suma sea > 100
	// o introduzcamos un numero negativo
	// en la suma tenia que incluir un numero negativo
	/*
	 * 30/10/2025 Esther Ballesteros Solé
	 */
	public static void main(String[] args) {
		// declaramos variables
		int n = 0;
		int suma = 0;

		Scanner sc = new Scanner(System.in);
		// pedimos numeros y los sumamos mientras la suma sea < 100 y el numero sea positivo
		
		do {
			//pedir el numero
			System.out.println("Introduce numero: ");
			n = sc.nextInt();
			//sumarlo
			suma+=n;
			//si no quiero contar el numero negativo lo pongo en un if para que solo cuente los positivos
		} while (suma < 100 && n > 0);
		
		// imprimimos la suma
		System.out.println("La suma vale " + suma);

		sc.close();
	}
}
