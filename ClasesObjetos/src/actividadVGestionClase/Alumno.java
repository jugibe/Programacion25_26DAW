package actividadVGestionClase;

import java.util.Arrays;

/**
 * Clase que representa la entidad alumno
 * @author Mariano
 * @version 1.0 - 26/11/2025
 */
public class Alumno {
	/**
	 * Nombre completo del alumno
	 */
	private String nombreApellidos;
	/**
	 * Numero del expediente del alumno
	 */
	private int numeroExpediente;
	/**
	 * Contador de cantidad de expedientes hechos 
	 */
	private static int cantidadExpedientes = 0;
	/**
	 * Vector de calificaciones 
	 */
	private Calificacion[] calificaciones;
	/**
	 * Constructor de objeto
	 * @param nombreApellidos nombre completo del alumno
	 * @param calificaciones vector de calificaciones del alumno
	 * El atributo numeroExpediente se genera automaticamente a partir del valor
	 * estatico cantidadExpediente
	 */
	public Alumno(String nombreApellidos, Calificacion[] calificaciones) {
		this.nombreApellidos = nombreApellidos;
		this.calificaciones = calificaciones;
		// Aumentamos uno la cantidad de expedientes que es un atributo estatico
		cantidadExpedientes++;
		// Asignamos el numero de expediente correspondiente a ese alumno
		this.numeroExpediente = cantidadExpedientes; 
	}
	/**
	 * @return the nombreApellidos
	 */
	public String getNombreApellidos() {
		return nombreApellidos;
	}
	/**
	 * @param nombreApellidos the nombreApellidos to set
	 */
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}
	/**
	 * @return the calificaciones
	 */
	public Calificacion[] getCalificaciones() {
		return calificaciones;
	}
	/**
	 * @param calificaciones the calificaciones to set
	 */
	public void setCalificaciones(Calificacion[] calificaciones) {
		this.calificaciones = calificaciones;
	}
	/**
	 * @return the numeroExpediente
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}
	/**
	 * Metodo para imprimir las propiedades del alumno
	 */
	@Override
	public String toString() {
		return "Alumno [nombreApellidos=" + nombreApellidos + ", numeroExpediente=" + numeroExpediente
				+ ", calificaciones=" + Arrays.toString(calificaciones) + "]";
	}
	/**
	 * Metodo para insertar una calificacion al alumno
	 * @param calificacion a insertar
	 * @return boolean si la insercion de esa calificacion ha sido correcta
	 * Para insertar una calificacion ampliamos el array en uno y añadimos una calificaciones
	 */
	public boolean insertar(Calificacion calificacion) {
		// Faltaria validar las calificaciones insertadas, LUEGO
		// Añade un elemento al array de calificaciones
		calificaciones = Arrays.copyOf(calificaciones, calificaciones.length+1);
		// Le añadimos la calificacion al ultimo componente del array de calificaciones (al nuevo)
		calificaciones[calificaciones.length-1] = calificacion;
		return true;
	}
	/**
	 * Metodo para obtener la mejor calificacion del alumno (modulo y nota)
	 * @return Calificacion devuelve la mejor calificacion del alumno
	 */
	public Calificacion consultarMejorNota() {
		// Variable para guardar la calificacion mayor
		Calificacion calificacionMayor = calificaciones[0];
		// Recorro el array de calificaciones y compruebo el mayor para guardarlo 
		for (Calificacion c: calificaciones) {
			if (c.getCalificacion() > calificacionMayor.getCalificacion()) {
				calificacionMayor = c;
			}
		}
		return calificacionMayor;
	}
	/**
	 * Metodo para consultar la calificacion de un alumno en un modulo concreto
	 * @param modulo String con el nombre del modulo a consultar
	 * @return double nota del alumno en el modulo
	 */
	public double consultarCalificacion(String modulo) {
		// recorrer el vector de calificaciones
		for (Calificacion c: calificaciones) {
			if (c.getModulo().equals(modulo)) {
				return c.getCalificacion();
			} 
		}
		return -1;
	}
	/**
	 * Opcion A
	 * Metodo que modifica la calificacion de un modulo
	 * @param nota calificacion a modificar (nombre del modulo y nota)
	 * @return boolean si se ha podido modificar correctamente o no
	 */
	public boolean modificarCalificacion(Calificacion nota) {
		// Recorremos el array de calificacion por indice
		for (int i = 0; i < calificaciones.length; i++) {
			if (calificaciones[i].getModulo().equals(nota.getModulo())) {
				calificaciones[i].setCalificacion(nota.getCalificacion());
				return true;
			}
		}
		return false;
	}
	/**
	 * Opcion b
	 * Metodo que modifica la calificacion de un modulo
	 * @param modulo nombre de la nota a modificar
	 * @param nota calificacion del modulo que se modifica
	 * @return boolean si se ha hecho correctament o no
	 */
	public boolean modificarCalificacion(String modulo, double nota) {
		// Recorremos el array de calificacion por indice
		for (int i = 0; i < calificaciones.length; i++) {
			if (calificaciones[i].getModulo().equals(modulo)) {
				calificaciones[i].setCalificacion(nota);
				return true;
			}
		}
		return false;
	}
	/**
	 * MEtodo para saber si se han aprobado todos los modulos (nota >= 5)
	 * @return boolean si la nota de todos los modulos es mayor o igual que 5
	 */
	public boolean todoAprobado() {
		for (Calificacion c: calificaciones) {
			if (c.getCalificacion() < 5) {
				return false;
			}
		}
		return true;
	}
	/**
	 * Metodo para obtener la media de todas los modulos
	 * @return double media de todos los modulos
	 */
	public double obtenerMedia() {
		double sumaModulos = 0;
		for (Calificacion c: calificaciones) {
			sumaModulos += c.getCalificacion();
		}
		return sumaModulos / calificaciones.length;
	}
}
