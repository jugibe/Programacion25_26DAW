package ejercicios;
/*
 * 3. Crea un método dibujarCuadrado(int n) que dibuje un cuadrado de * nxn
 */

public class Dibujar {
	
	//Metodo de dibuja un cuadrado de lado n
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
	//Metodo que dibuja un rectangulo de filas x, columnas y y de caracter c
	public static void dibujarRectangulo(int fil, int col, char car) {
		//dibujamos las filas
				for (int f=1; f<=fil; f++) {
					//dibujamos las columnas
					for (int c=1; c<=col; c++) {
						//imprimimos caracter
						System.out.print(car);
					}
					System.out.println("");
				}
	}
}
