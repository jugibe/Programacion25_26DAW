package bucles;
/*
 * Programa para utilizar el for encadenado, un for dentro de otro for
 * 06/10/2025 Eder Gracia
 */
public class BucleForEncadenado {

	public static void main(String[] args) {
		//declarar variables

		//estructura
		/*
		 * for (int i = 1; i <=5; i++) { for (int j = 1; j<=3; j++) {
		 * System.out.print("(" + i + "," +j+")"); } System.out.println(); }
		 */
		for (int i = 10; i >=1; i--) {
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
