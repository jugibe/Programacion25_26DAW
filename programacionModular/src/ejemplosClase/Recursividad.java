package ejemplosClase;
/*
 * Alejandro Lozano 22/10/2025
 * Ejemplos de recursividad.
 */
public class Recursividad {
	//Se habla de recursividad cuando un subprograma (función o procedimiento) se llama o se invoca a sí mismo.
	public static void main(String[] args) {
		int i=1;
		pruebaRecursividad(i);
	}
	public static void pruebaRecursividad(int n) {
		n++;
		System.out.println(n);
		if (n<10) pruebaRecursividad(n);//Tenemos que poner una condición de salida de la recursividad sino el bucle es infinito
		System.out.println("hola" + n);
	}
}
