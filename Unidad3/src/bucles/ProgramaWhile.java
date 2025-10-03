package bucles;
/* Esther Ballesteros Solé
 * programa para aprender bucle while
 * 01/10/2025
 */ 
public class ProgramaWhile {

	public static void main(String[] args) {
		// declaramos variables
		int numero = 6;
		// while en el que NUNCA entramos
		/*
		 * System.out.println("antes del while"); while (numero<0) {
		 * System.out.println("estoy dentro del while"); }
		 * System.out.println("despues del while");
		 */
		
		// while infinito
		/*
		 * System.out.println("antes del while"); while (numero>0) {
		 * System.out.println("estoy dentro del while"); }
		 * System.out.println("despues del while");
		 */
		// ejemplo de while que se ejecuta un n finito de veces
		System.out.println("antes del while"); 
		while (numero>0) {
		 	numero--;
		 	System.out.println("estoy dentro del while y numero vale "+numero);
		 	numero--;
		}
		System.out.println("despues del while el numero vale "+numero); 
	}

}
