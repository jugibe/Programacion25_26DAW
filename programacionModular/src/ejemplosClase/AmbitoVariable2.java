package ejemplosClase;
/*
 * Javier Martin 22/10/2025
 * Ejemplo para trabajar el ambito variable.
 * Una variable se puede utilizar dentro del bloque en la que esta definida.
 */
public class AmbitoVariable2 {
	static int j=5; //esta variable es accesible en toda la clase.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j++;
		System.out.println(j);
		prueba();
		System.out.println(j);
	}
	
	public static void prueba() {
		j++;
	
	}
	
}
