package ejemplosClase;
/*
 * Alejandro Lozano 25/11/2025
 * Representamos una tienda que tiene sus productos y sus precios
 */
public class Producto {
	private String nombre;
	private double precioEuros;
	private static double cambioEuroDolar = 1.16;
	private static int idProductoClase = 0;//identificador para nuestro producto
	private int idProductoObjeto;
	
	public Producto(String nombre, double precioEuros) {
		this.nombre = nombre;
		this.precioEuros = precioEuros;
		idProductoClase++;
		idProductoObjeto = idProductoClase;
		
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecioEuros() {
		return precioEuros;
	}
	public double getCambioEuroDolar() {
		return cambioEuroDolar;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecioEuros(double precioEuros) {
		this.precioEuros = precioEuros;
	}
	public static void setCambioEuroDolar(double n) {
		cambioEuroDolar = n;
	}
	//toString() metodo que tienen todas las clases -> @Override sustituye/sobreescribe a un metodo de arriba (herencia)
	

	public double getPrecioDolares() {
		return precioEuros * cambioEuroDolar;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precioEuros + "€ , idProductoObjeto=" + idProductoObjeto
				+ ", Precio en $=" + getPrecioDolares() + " " + idProductoClase + "]";
	}
	
}
		

