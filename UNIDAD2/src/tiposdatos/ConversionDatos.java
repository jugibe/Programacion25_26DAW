package tiposdatos;
/*
 * fecha 25/09/2025
 * autor renzo
 * programa para practicas la conversion de datos
 */
public class ConversionDatos {

	public static void main(String[] args) {
		//declaracion de variable
		int n;
		char c;
		//ejemplos
		n=65;
//		c=n;no deja meter un entero en char
		c=(char)n;
		//esto es una conversion explicita
		System.out.println(c);
		//otro ejemplo de conversion 
		int n2;
		char c2='c';
		
		//conversion implicita 
		n2=c2+1;
		System.out.println(n2);
		
		//conversion explicita
		int numero1=7, numero2=3;
		double cociente;
		System.out.println(numero1/numero2);
		
		cociente=numero1/numero2;
		System.out.println(cociente); //hace una conversion  de un entero a un doble
		//la division es erronea
		cociente=numero1/(double)numero2;
		System.out.println(cociente);
		//otro ejmplo
		byte b;
		int x=300;
		b=(byte)x;
		System.out.println(b);

	}

}
