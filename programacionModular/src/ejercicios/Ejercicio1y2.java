package ejercicios;
/*
 * Eder Gracia 20/10/2025
 * EJERCICIOS. PROGRAMACIÓN

1. Crea un método void saludar() que imprima un mensaje por consola de saludo del tipo,
“Buenos días Juanjo. Bienvenido a la clase de Programación en Java”

2. Crea un método void saludad(String nombre) que imprima el mensaje anterior cambiando el
nombre de Juanjo por el valor del parámetro
 */
public class Ejercicio1y2 {

	public static void main(String[] args) {
		// llamada al metodo saludar()
		saludar();
		saludar(" Eder");
	}
	//metodo que saluda 
	public static void saludar() {
		System.out.println("Buenos dias Juanjo. Bienvenido a la clase de Programacion en Java");
	}
	
	public static void saludar(String nombre) {
		System.out.println("Buenos dias" + nombre+ ". Bienvenido a la clase de Programacion en Java");
	}
	
	
}
