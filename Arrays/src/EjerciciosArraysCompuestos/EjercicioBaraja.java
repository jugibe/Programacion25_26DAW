package EjerciciosArraysCompuestos;
/*
 *  Jeyson Delgado
 *  
 *  12/11/2025
 *  
 *  Hacerunprogramapara que extraiga cartas de una baraja española, con reemplazamiento, esto es,
	 una carta que sale puede volver a salir. La notación del naipe será A234567SCR(num de carta) y
	 OCEP(oros copas espadas bastos) para el palo. Sacaremos 40 extracciones por pantalla, diez en cada
	 línea
 */
public class EjercicioBaraja {

	public static void main(String[] args) {
		//Declara array
		
		//Array 4 filas 10 columnas
		String [] [] arrayB = new String [4][10];
		llenarArray(arrayB);
		imprimeArray(arrayB);
		
	}//Este metodo rellena el array con cartas de la baraja en el formato indicado
	private static void llenarArray(String [][]f) {
		String palo = "OCBE";
		String numero = "A234567SCR";
		
		//Elegiremos numero aleatorios, uno para el palo y otro para la carta 
		//Construiremos la carta con los caracteres que correspendan ese numero
		for(int i=0; i<f.length; i++) {
			for(int j=0; j<f[i].length; j++) {
				f[i][j]=""+palo.charAt((int)(Math.random()*4))+numero.charAt((int)(Math.random()*10));
			}
		}		
	}
	//Metodo que imprime el array con las cartas
	public static void imprimeArray(String [][]array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("%s***",array[i][j]);
			}
			System.out.println("");
		}
	}
	
	
}
