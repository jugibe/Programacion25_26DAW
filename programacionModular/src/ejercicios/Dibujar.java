package ejercicios;

public class Dibujar {
	public static void dibujarCuadrado(int n) {
		for (int f=1; f<=n; f++) {
			for (int c=1; c<=n; c++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
		}
}
