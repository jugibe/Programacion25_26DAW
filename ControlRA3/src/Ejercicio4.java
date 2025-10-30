import java.util.Scanner;

public class Ejercicio4 {
	// dados 4 numeros que pide por teclado tiene que decir el mayor
	/*
	 * 30/10/2025 Esther Ballesteros Solé
	 */
	public static void main(String[] args) {
		// declaramos variables
		int n1, n2, n3, n4; //numeros introducidos por teclado
		int mayor; //para almacenar el mayor

		Scanner sc = new Scanner(System.in);
		// pedimos los numeros
		System.out.println("Introduce numero 1: ");
		n1 = sc.nextInt();
		System.out.println("Introduce numero 2: ");
		n2 = sc.nextInt();
		System.out.println("Introduce numero 3: ");
		n3 = sc.nextInt();
		System.out.println("Introduce numero 4: ");
		n4 = sc.nextInt();
		
		//calculamos el mayor
		mayor = n1;
		if (n2 >= mayor) {mayor = n2;}
	
		if (n3 >= mayor) {mayor = n3;}

		if (n4 >= mayor) {mayor = n4;}
		
		//imprimir resultado
		System.out.println("el numero mayor es "+ mayor);
		sc.close();
	}
}
