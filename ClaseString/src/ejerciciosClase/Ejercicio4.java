package ejerciciosClase;
/*
 *  Pedir a la persona que escriba su nombre y género por pantalla. Añadir Sr o Sra al
 principio del nombre y mostrarlo por pantalla.
 Eder Gracia
 30/10/2025
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		//pedir datos
		String nom=Leer.leerFrase("Introduce tu nombre");
		System.out.println(prefijo() + nom);
	}
	public static String prefijo() {
		int opcion=0;
		System.out.println("Dime tu genero");
		System.out.println("1 = Masculino");
		System.out.println("2 = Femenino");
		System.out.println("Otras opciones sin prefijo");
		opcion=Leer.leerEntero("Introduce tu genero");
		
		switch (opcion) {
		case 1:
			return "Sr ";
		case 2: 
			return "Sra ";
		default:
			return "";
		}
		
	}
}
