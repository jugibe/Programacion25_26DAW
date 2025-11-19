package ejercicios;

/*
 * Esther Ballesteros Solé
 * 19/11/2025
 * tragabolas
 */
public class Tragabolas {
	// atributos
	private String color;
	private int bolasComidas;
	private int maxBolas;

	// constructor
	public Tragabolas(String color, int maxBolas) {
		this.color = color;
		this.maxBolas = maxBolas;
		bolasComidas = 0;
	}

	// metodo que muestra los datos del tragabolas por la pantalla
	public void visualizar() {
//		System.out.println("Color: " + this.color);
//		System.out.println("Bolas comidas: " + this.bolasComidas);
//		System.out.println("Maximo de bolas: " + this.maxBolas);

		System.out.printf("Color:%s\nBolas comidas:%s\nMaximo de bolas%s\n", color, bolasComidas, maxBolas);

	}

	public void comer() {
		if (bolasComidas < maxBolas) {
			bolasComidas++;
			System.out.println("He comido 1 bola");
		} else {
			System.out.println("No puedo comer :(");
		}
	}

	public void trotar() {
		if (bolasComidas >= 1) {
			bolasComidas--;
			System.out.println("Estoy trotando");
		} else {
			System.out.println("No tengo fuerza para trotar");
		}
	}

	public void dormir() {
		if (bolasComidas == maxBolas) {
			System.out.println("Tripa llena...ZZZZZZZ");
			bolasComidas = bolasComidas / 2;
		} else {
			System.out.println("No quiero dormir >:(");
		}
	}
}
