package tiposdatos;
/*
 *Programa en Java para aprender a utilizar los tipos de datos primitivos
 *23/9/2025 
 *Sergio Florin
 */
public class TiposDatos1 {

	public static void main(String[] args) {
		//	Declaracion de variables
		int numero1=10 , numero2=3; // comentario
		int suma , resta  , producto;
		double cociente;
		// Proceso: calculamos suma , resta , cociente y producto
		suma=numero1 + numero2;
		resta=numero1 - numero2;
		producto= numero1*numero2;
		cociente=(double)numero1/numero2;// conversion explicita
		//salida de los resultados
		System.out.println("la suma vale "+suma);
		System.out.println("la resta vale "+resta);
		System.out.println("el producto vale "+producto);
		System.out.println("el cociente vale"+cociente);

	}

}
