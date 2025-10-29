package ejemplosdeclase;
/*
 * Jeyson Delgado
 * 29/10/2025
 * Ejemplos de utilizacion de printf para imprimir con formato
 */
public class ImprimirFormato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * printf ("cadena de formato %d", lista de variables );
		 * 
		 * https://codersfree.com/posts/formato-de-salida-en-java-con-printf
		 */
			
		int n1=3, n2=8, n3=15;
		float c1=-13.548f,  c2=45.612f, c3=11.245f; // Cuando declaramos float debemos ingresar la letra f al final.
		
		System.out.printf("n1 vale %d\nn2 vale %d\nn3 vale %d%n", n1, n2, n3);
		System.out.printf("c1 vale %+6.2f%nc2 vale %+6.2f%nc3 vale %+6.2f%n", c1, c2, c3);
		

	}

}
