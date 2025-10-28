package ejemplosdeclase;
/*27/10/2025
 * Madalin Buzdugan
 * Ejemplos de uso de la clase String
 * 
 */

public class Ejemplo1 {

	public static void main(String[] args) {
		//Construir Strings
		String s1=new String("texto1");
		System.out.println(s1);
		String s2="Hola";
		System.out.println(s2);
		//Metodos de la calse String
		//Metodo charAt(int pos)
		//El metodo charAt devuelve el caracter de la posicion pos
		System.out.println(s1.charAt(4)); //El primer caracter es el indice 0
		//System.out.println(s1.charAt(8)); Si nos salimos del indice salta un excepcion
		//Recorrer una cadena
		for(int i=0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		//substring
		System.out.println(s1.substring(3));//Devuelve una cadena desde el indice hasta el final
		System.out.println(s1.substring(1,3));//Devuelve una cadena desde el indice primero hasta el indice segundo
		//int indexOf(char c)//Devuelve la primera posicion del caracter c, si no se encuentra el caracter c devuelve -1
		System.out.println(s1.indexOf('t'));
		System.out.println(s1.indexOf('z'));
		//int indexOf(String s);
		System.out.println(s1.indexOf("ex"));
		//boolean startsWith(prefijo) //Devuelve true o false si la cadena empieza por el prefijo
		System.out.println(s1.startsWith("tex"));
		
	}

}
