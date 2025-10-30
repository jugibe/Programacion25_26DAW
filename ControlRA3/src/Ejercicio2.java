import java.util.Scanner;

public class Ejercicio2 {
	// pide la temperatura corporal por teclado e imprime un mensaje en funcion de
	// la temp que le pasemos
	/*
	 * 30/10/2025 Esther Ballesteros Solé
	 */
	public static void main(String[] args) {
		// declaramos variables
		double temperatura = 0;
		String mensaje="";

		Scanner sc = new Scanner(System.in);

		// pedir la temperatura
		System.out.println("Introduce temperatura: ");
		temperatura = sc.nextDouble();

		if (temperatura < 35) {
			mensaje = "demasiado bajo deberias estar helado";
			
		} else if (temperatura >= 35 && temperatura < 37.5) {
			mensaje = "tu temperatura es correcta";
			
		} else if (temperatura >= 37.5 && temperatura < 38.5) {
			mensaje = "tienes fiebre baja, reposa";
			
		} else if (temperatura >= 38.5 && temperatura < 42) {
			mensaje = "tienes fiebre elevada, ve al medico";
			
		} else if (temperatura >= 42) {
			mensaje = "estas ardiendo, debes estar en el infierno";
		}
		System.out.println(mensaje);
		sc.close();
	}
}
