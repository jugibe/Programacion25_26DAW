package ejerciciosArraysSimples;

public class EjercicioJuego {

	public static void main(String[] args) {
		//Definición variables
		String[] jugadores= {"Rene","Javier","Esther","Alejandro"};
		int[]frecuencias=new int[jugadores.length];
		boolean seguirJugando=false;
		String respuesta="";
		
		//jugar hasa que digas "n"
		do {
			respuesta=Leer.leerFrase("Quieres seguir jugando s/n");
			switch(respuesta) {
				case "s":
					jugar(frecuencias,jugadores);
					mostrarResultados(frecuencias,jugadores);
					seguirJugando=true;
				break;
				case "n":
					seguirJugando=false;
					break;
					
				default:
					System.out.println("opcion erronea s/n");
					
			}
			
		}while(seguirJugando);
		System.out.println("Fin de juego. Puntuacion final");
		mostrarResultados(frecuencias, jugadores);
		mostrarGanador(frecuencias,jugadores);
		
		
		
		
		
		
	}
	
	
	private static void mostrarGanador(int[] frecuencias, String[] jugadores) {
		//calcular la mayor frecuencia
		int mayorFrecuencia=frecuencias[0];
		for (int i = 0; i < frecuencias.length; i++) {
			if (frecuencias[i]>mayorFrecuencia) {mayorFrecuencia=frecuencias[i];}		
		}
		//Buscar los indices que tienen esa frecuencia y imprimir el nombre
		for (int i = 0; i < jugadores.length; i++) {
			if(frecuencias[i]==mayorFrecuencia) {
				System.out.println("Ganador "+ jugadores[i] + " con "+ frecuencias[i]+ " puntos");
			}
			
		}
		
		
	}
	private static void mostrarResultados(int[] frecuencias, String[] jugadores) {
		for (int i = 0; i < jugadores.length; i++) {
			System.out.printf("%10s  %s%n",jugadores[i],asteriscos(frecuencias[i]));
			
		}
		
	}
	private static String asteriscos(int i) {
		String resultado="";
		for (int j = 0; j <i; j++) {
			resultado=resultado+"\u25AE";
			
		}
		return resultado;
	}
	//elegir al azar un numero entre 0 y 3
	//Mostrar el nombre ganador jugadores[numero]
	//frecuencias[]++
	private  static void jugar(int[] frecuencias, String [] jugadores) {
		int ganador=(int)(Math.random()*4);
		System.out.println("El ganador de esta ronda es "+ jugadores[ganador]);
		frecuencias[ganador]++;
	}

}
