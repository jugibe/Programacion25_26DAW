package actividadVGestionClase;

import java.util.Arrays;

/**
 * Clase para gestionar el grupo de alumnos
 * @author Mariano
 * @version 1.0 - 26/11/2025
 */
public class Grupo {
	/**
	 * Nombre del grupo
	 */
	private String nombre;
	/**
	 * Array con todos los alumnos
	 */
	private Alumno[] alumnos;
	/**
	 * Constructos de objetos
	 * @param nombre nombre del grupo
	 * @param max numero maximo de alumnos
	 */
	public Grupo (String nombre, int max) {
		this.nombre = nombre;
		alumnos = new Alumno[max];
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the alumnos
	 */
	public Alumno[] getAlumnos() {
		return alumnos;
	}
	/**
	 * @param alumnos the alumnos to set
	 */
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	/**
	 * Metodo para mostrar los atributos de un grupo
	 */
	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", alumnos=" + Arrays.toString(alumnos) + "]";
	}
	
}
