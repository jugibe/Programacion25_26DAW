package ejerciciosClase;

import ejemplosdeclase.Leer;

/*
 * Mariano Clavero
 * Hacer un captcha en el que la persona tenga que demostrar que no es un robot
escribiendo una cadena compleja. Por ejemplo: “A5-jk7Y”.
 */

public class Ejercicio1Captcha {

	public static void main(String[] args) {
		System.out.println("Antes");
		do {
			
		}while (!pedirCaptcha());
		System.out.println("Despues");
		
	}
	public static String generarCaptcha() {
		String captcha = "" + generarMayus() + generarMinuscula() + generarCaracterEspecial() + generarCaracterEspecial()
		+ generarMayus() + generarMinuscula();
		return captcha;
	}
	public static char generarMayus() {
		String listaMayus = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
		// int letraAleatoria = (int)(Math.random()*26 + 65);
		return listaMayus.charAt((int)(Math.random()*listaMayus.length()));
	}
	public static char generarCaracterEspecial() {
		String listaCaracteres = "-#@_€%&/!?¿*";
		return listaCaracteres.charAt((int)(Math.random()*listaCaracteres.length()));
	}
	public static char generarMinuscula() {
		String listaMinus = "abcdefghijklmnopqrstuvxyz";
		return listaMinus.charAt((int)(Math.random()*listaMinus.length()));
	}
	public static boolean pedirCaptcha() {
		String captcha = generarCaptcha();
		String respuesta = Leer.leerFrase("Escribe "+captcha);
		return captcha.equals(respuesta);
		// return generarCaptcha().equals(Leer.leerFrase("Escribe "+captcha));
	}
}
