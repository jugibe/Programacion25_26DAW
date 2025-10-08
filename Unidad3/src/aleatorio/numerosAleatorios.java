package aleatorio;
/*
 * Mariano Clavero
 * Programa de ejemplo para aprender a generar numeros aleatorios con la clase 
 * Math.random()
 */
public class numerosAleatorios {

	public static void main(String[] args) {
		double numero = Math.random();
		System.out.println(numero);
		// Math.random() devuelve un double entre 0.0 y 0.99...
		System.out.println(numero * 10);
		// Asigna un numero entre 0.00 y 9.99
		System.out.println((int)(numero*10));
		// Al convertirlo a entero, tengo un entero entre 0 y 9
		System.out.println((int)(numero*10) + 1);
		// El primer numero seria el 1 y el ultimo el 10, la suma determina de que numero empezará
		// Lanzar un dado 100 veces
		for (int i = 1; i <= 100; i++){
			System.out.println((int)(Math.random()*6) + 1);
		}
	}

}
