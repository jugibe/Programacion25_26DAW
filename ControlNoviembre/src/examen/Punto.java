package examen;
/**
 * Clase Punto clase para el control de noviembre para representar puntos
 * @author Alejandro
 * @version 1.0
 * @since 25/11/2025
 */
public class Punto {
	/**
	 * coordenada x del punto
	 */
	private int x;
	/**
	 * coordenada y del punto
	 */
	private int y;
	/**
	 * constructor sin parametros -> crea un punto donde x = 0 e y = 0
	 */
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	/**
	 * constructor con parametros 
	 * @param x coordenad x del punto
	 * @param y coordenada y del punto
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * Metodo para mostrar los valores del punto 
	 */
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	/**
	 * Metodo avanzaX -> aumenta la x en una cantidad
	 * @param cantidad nos dice cuanto aumenta la x
	 */
	public void avanzaX(int cantidad) {
		x = x + cantidad;
	}
	/**
	 * Metodo avanzaY -> aumenta la y en una cantidad
	 * @param cantidad nos dice cuanto aumenta la y
	 */
	public void avanzaY(int cantidad) {
		y = y + cantidad;
	}
	/**
	 * Metodo coinciden -> Metodo que devuelve un booleano si los puntos coinciden
	 * @param p1 punto 1 a verificar que coincide con p2
	 * @param p2 punto 2 a verificar que coincide con p1
	 * @return booleano que indica si los puntos coinciden o no 
	 */
	public static boolean coinciden(Punto p1, Punto p2) {
		return p1.getX() == p2.getX() && p1.getY() == p2.getY();
	}
	
	
	
}
