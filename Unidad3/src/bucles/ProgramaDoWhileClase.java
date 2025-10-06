package bucles;
/*
 * programa para aprender a utilizar el Do While
 * 06/10/2025 Eder Gracia
 */
public class ProgramaDoWhileClase {

	public static void main(String[] args) {
		// entrada de datos
		int n1=0;
		
		//funcionamiento del while
		/*
		 * System.out.println("antes del bucle"); do {
		 * System.out.println("dentro del bucle"); } while (n1<0);
		 * System.out.println("despues del bucle");//la primera vez siempre ejecuta el
		 * bloque
		 */		
		//bucle infinito
		/*
		 * do { System.out.println(" dentro del bucle"); } while (n1>0);
	
		 */
		
		n1=0;
		do {	
			System.out.println(n1);
			n1++;
		} while(n1<=10);
		 
		/*
		 * System.out.println(++n1);//atencion operadores ++ ,ver apuntes tema 2
		 * System.out.println(n1);
		 */
	}

}
