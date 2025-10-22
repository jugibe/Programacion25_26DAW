package ejemplosClase;
/*
 * Javier Martin 22/10/2025
 * Ejemplo para trabajar el paso de argumentos a los metodos.
 */
public class PasoDeArgumentos {
	//static int i=15; //si definimos la variable aqui sera accesible a todos los metodos.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		prueba(i); //el paso de argumentos al metodo es por valor, no se modifican las variables, para hacerlo debemos hacerlas globales.
		System.out.println(i);
	}
	public static void prueba(int c) {
		System.out.println("Me han dado el valor "+c);
		c++;
		System.out.println("i del metodo: "+c);
		//i++;
	}
}
