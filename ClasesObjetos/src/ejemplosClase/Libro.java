package ejemplosClase;
/*
 * Jeyson Delgado
 * 19/11/2025
 * 
 * Ejemplos de atributos y metodos static
 */
public class Libro {
	//Atributos
	private String autor;
	private String titulo;
	private static int numLibros=0;//Contiene el numero de objeto libro que se han definido 
	public Libro(String autor, String titulo) {
		
		this.autor = autor;
		this.titulo = titulo;
		numLibros++;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public static int getNumLibros() {
		return numLibros;
	}
	public static void setNumLibros(int n) {
		numLibros=n;
	}
	
}
