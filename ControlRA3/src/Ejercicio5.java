import java.util.Scanner;

public class Ejercicio5 {
	// crear un menu
	/* 30/10/2025
	 * Esther Ballesteros Solé
	 */
	public static void main(String[] args) {
		//declaramos variables
		int opcion = 0; //aqui almacenaremos la opcion elegida en el menu
		
		Scanner sc = new Scanner(System.in);
		
		do {
			//imprimir el menu
			System.out.println("--MENU--");
			System.out.println("--Opcion 1--");
			System.out.println("--Opcion 2--");
			System.out.println("--Opcion 3--");
			System.out.println("--Opcion 4: Salir--");
			
			//pido la opcion
			System.out.println("Introduce una opcion: ");
			opcion = sc.nextInt();
			
			//selecciono segun la opcion elegida
			switch (opcion) {
			case 1: 
				System.out.println("Opcion 1");
				break;
			case 2: 
				System.out.println("Opcion 2");
				break;
				
			case 3: 
				System.out.println("Opcion 3");
				break;
				
			case 4: 
				System.out.println("Adios");
				break;
				
			default:
				System.out.println("Opcion erronea");
			}

		} while(opcion != 4); //4 es la opcion de salir
		
		sc.close();
		System.out.println("fin de programa");
	}

}
