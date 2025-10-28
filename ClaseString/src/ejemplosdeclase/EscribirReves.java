package ejemplosdeclase;
/*
 * Creaqr un programa que pida una frase y la escriba al reves
 */
public class EscribirReves {

	public static void main(String[] args) {
		String s=Leer.leerFrase("Introduce una frase para que la pueda leer al reves");
		System.out.println(s.toLowerCase()+ " escrita al reves es \n"+ alReves(s.toLowerCase()));
		System.out.println(esPalindromo(s));
	}
	
	public static String alReves(String s) {	
		String resultado="";
		for (int i=s.length()-1;i>=0;i--) {
			resultado+=s.charAt(i);
		}
		return resultado;		
	}
	
	public static boolean esPalindromo(String s) {
		if(alReves(s.toLowerCase()).equals(s.toLowerCase())) {
			return true;
		}else {
			return false;
		}
	}
	
}
