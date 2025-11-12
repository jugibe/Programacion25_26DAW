package EjerciciosArraysCompuestos;
/*Javier Martín Bosque 11/11/2025*/
/*Generar una matriz de 10x10 y hallar e imprimir la suma de cada una de sus filas y de cada unadesus columnas.*/
public class Ejercicio1Sumatorio {

	public static void main(String[] args) {
		//declaramos el array
		int array[][] = new int[3][3];
		llenarArray(array);
		mostrarArray(array);
		sumaFilas(array);
		sumaColumnas(array);
	}
	
	
	//metodo que llena el array con numeros aleatorios del 1 al 10
	public static void llenarArray(int f[][]) {
		for(int i=0;i<f.length;i++) {
			for(int j=0;j<f[i].length;j++) {
				f[i][j]=(int)(Math.random()*10)+1;
			}
		}

	}
	//metodo que muestra el array
	public static void mostrarArray(int f[][]) {
		for(int i=0;i<f.length;i++) {
			for(int j=0;j<f[i].length;j++) {
				System.out.printf("%4d",f[i][j]);
			}
			System.out.println("");
		}
	}
	//metodo que suma los componentes de un vector de una dimension (fila)
	private static int sumarVector(int []f) {
		int suma=0;
		for(int i=0;i<f.length;i++) {
			suma+=f[i];
		}
		return suma;
	}
	//metodo que imprime la suma de todas las filas
	private static void sumaFilas(int [][]f) {
		for(int i=0;i<f.length;i++) {
			System.out.println("Fila "+i+": "+sumarVector(f[i]));
		}
	}
	//metodo que imprime la suma de todas las columnas
	private static void sumaColumnas(int [][]a) {
		int suma=0;
		for(int c=0;c<a.length;c++) {
			for(int f=0;f<a.length;f++) {
				suma+=a[f][c];
			}
			System.out.println("La columna "+c+": "+suma);
			suma=0;
		}
	}
}
