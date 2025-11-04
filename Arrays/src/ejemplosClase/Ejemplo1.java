package ejemplosClase;

/*
 * 04/11/2025
 * Lorena Arias  
 * Ejemplos de uso de Arrays.
 */

public class Ejemplo1 {

	public static void main(String[] args) {
		//Declaración Array
		String  miPrimerArray [] ;
		
		//Indicamos cuantos elementos tiene
		miPrimerArray = new String [3];
		
		//Declarar un Array enumerando los elementos
		String diaSemana [] = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
		
		//Acceder a los elementos del Array (leer o modificar)
		//Podemos acceder por índice
		//La pòsición del Array empieza en el 0 y termina en la longitud -1.
		System.out.println(diaSemana[5]);
		diaSemana[0] = "YYY";
		System.out.println(diaSemana[0]);
		
		//Recorrer el array con un bucle
		//Utilizando el índice
		for(int i=0; i<diaSemana.length; i++) {
			System.out.println(diaSemana[i]);
		}

	}

}
