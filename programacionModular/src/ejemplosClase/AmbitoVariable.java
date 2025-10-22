package ejemplosClase;
/*
 * Javier Martín 22/10/2025
 * Ejemplo para trabajar el ambito variable.
 * Una variable se puede utilizar dentro del bloque en la que esta definida.
 */
public class AmbitoVariable {

	public static void main(String[] args) {
		//
		int j=5;
		for(int i=1;i<=20;i++) {//la variable i solo se puede utilizar dentro del for.
			System.out.println(i);
		}
		//System.out.println(i); este syso da error porque la i no esta definida en el bloque main.
		
		for(j=1;j<=10;j++) {
			System.out.println(j);
		}
		System.out.println("despues del bucle: "+j); //j vale 11.
		
		
	}
	
	public static void prueba(){
		//System.out.println(j); //esta linea da error porque j no esta definida en su bloque.
	}
}
