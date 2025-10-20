package ejercicios;
/*
 * 3. Crea un método dibujarCuadrado(int n) que dibuje un cuadrado de * nxn
 */
public class Dibujar {
	public static void dibujarCuadrado(int n) {
		//dibujamos las filas
		for (int f=1; f<=n; f++) {
			//dibujamos las columnas
			for (int c=1; c<=n; c++) {
				//imprimimos asteriscos
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
		}
	
	
}
