package ejerciciosClase;
/*
 * Pedir por teclado el código postal. Mostrar por pantalla la provincia (2 primeras cifras
 del código postal) y la zona postal (3 últimas cifras del código postal). Además, si las
 cifras de la provincia son 50 (Zaragoza), 22(Huesca) o 44(Teruel) mostrar por
 pantalla un mensaje tipo: “Eres de Zaragoza”.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//
		String codigoPostal="";
		do {
			codigoPostal=Leer.leerFrase("Introduce tu codigo postal");
		}while(!validarCodigo(codigoPostal));
		
		System.out.println(provincia(codigoPostal));
	}
	private static boolean validarCodigo(String codigoPostal) {
		// TODO Auto-generated method stub
		return true;
	}
	//Metodo que devuelve las dos primeras cifras del codigo postal
	public static String provincia(String c) {
		return c.substring(0,2);
	}
	
}
