package actividadVGestionClase;
/**
 * Clase para representar las calificaciones 
 * @author Mariano
 * @version 1.0 - 26/11/2025
 */
public class Calificacion {
	/**
	 * Atributo nombre del modulo
	 */
	private String modulo;
	/**
	 * Atributo calificacion del modulo
	 */
	private double calificacion;
	/**
	 * Constructor de objetos
	 * @param modulo nombre del modulo
	 * @param calificacion calificacion del modulo
	 */
	public Calificacion(String modulo, double calificacion) {
		this.modulo = modulo;
		this.calificacion = calificacion;
	}
	/**
	 * @return the modulo
	 */
	public String getModulo() {
		return modulo;
	}
	/**
	 * @param modulo the modulo to set
	 */
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	/**
	 * @return the calificacion
	 */
	public double getCalificacion() {
		return calificacion;
	}
	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	/**
	 * metodo para imprimir las propiedades de la calificacion
	 */
	@Override
	public String toString() {
		return "Calificacion [modulo=" + modulo + ", calificacion=" + calificacion + "]";
	}
	
}
