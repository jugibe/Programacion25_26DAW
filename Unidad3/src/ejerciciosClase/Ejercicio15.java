package ejerciciosClase;
import java.util.Scanner;

/*
 * Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes
	de octubre. Dado un mes y un importe, calcular cuál es la cantidad que se debe
	cobrar al cliente.
	30/09/2025
	Jeyson Alejandro Delgado
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		//Declarar variables
		double precioIni,precioFinal;
		final double DESCUENTO=15;
		String nomMes;
		Scanner sc = new Scanner(System.in);
		
		//Entrada datos
		System.out.println("Introduce el precio de tu compra");
		precioIni = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduce el Mes");
		nomMes = sc.nextLine();
		
		
		//Proceso
		if (nomMes.equals("Octubre") || nomMes.equals("octubre"))  { //Atencion a la comparacion de cadenas
			precioFinal = precioIni*(100-DESCUENTO)/100;
		}else {
			precioFinal = precioIni;
		}
		
		//Salida dato
		System.out.println("El precio final de tu compra es "+precioFinal);
		sc.close();
	}

}
