package ejemplosdeclase;
/*
 * Mohammed barka
 * 28/10/2025
 * ejemplos de metodos de la clase String
 */
public class Ejemplo3 {

	public static void main(String[] args) {	
		/*
		 *String replace(char carAnterior, charcarNuevo)
		 * Devuelve una cadena idéntica al original peroquehacambiado los caracteres iguales a carAnterior porcarNuevo.
		 */
		String s1= "martillo";
		String s2= s1.replace('a','o');
		System.out.println(s2);
		/*
		 * String replaceFirst(String str1, String str2)
		 * Cambia la primera aparición de la cadena str1por lacadena str2.
		 */
		String s3="el perro de Juan mordio al perro de Pedro";
		System.out.println(s3.replaceFirst("perro", "gato"));
		System.out.println(s3.replaceAll("perro", "gato"));
		/*
		 * String toLowerCase() Convierte la cadena a minúsculas. 
		 * String toUpperCase() Convierte la cadena a mayúsculas.
		 */
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		/*
		 * Static String valueOf(tipo elemento)
		 * Devuelve la cadena que representa el valor elemento. Si
		 * elemento es booleano, por ejemplo, devolveríaunacadena con el valor true o false.
		 */
		double n1 = 23.2;
		double n2= 4.5;
		String r1 = String.valueOf(n1);
		String r2= String.valueOf(n2);
		System.out.println(r1+r2);
		//Convetir cadenas a enteros 
		String a1= "15";
		int x1= Integer.parseInt(a1);
		System.out.println(x1*2);
		//convertir cadenas a dobles
		double d1= Double.parseDouble(a1);
		System.out.println(d1/2);
	}
	

}
