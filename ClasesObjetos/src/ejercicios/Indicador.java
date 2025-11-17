package ejercicios;
/*
 * Javier Martín 17/11/2025
 * 
 * Desarrollar un programa en Java que utilice una clase que se llame Indicador que sea la
representación de un indicador de la vida real (indicadores de nivel, de velocidad,
tacómetros, etc).
La clase deberá tener los atributos valorMinimo, valorMaximo, valorActual,
unidades y nombre del indicador. En el momento de la creación de cada objeto se
asignarán todos los elementos salvo el valorActual. Entre los métodos que se
programarán deberán estar el de asignación del valorActual, imprimir el valor, imprimir el
indicador e incrementar y disminuir el valorActual con el que cuentan.
En ese programa (el principal), crearás un vector de elementos de tipo Indicador y se podrá
escoger el indicador a tratar.
 */
public class Indicador {

	//atributos del indicador
	private String nombre;
	private String unidades;
	private double valorMinimo;
	private double valorMaximo;
	private double valorActual;
	
	//constructor
	public Indicador(String nombre, String unidades, double valorMinimo, double valorMaximo) {
		this.nombre=nombre;
		this.unidades=unidades;
		this.valorMinimo=valorMinimo;
		this.valorMaximo=valorMaximo;
		//le damos valores a todos los atributos menos al valor actual
		//this.valorActual=0; esto le daria a todos los valor actual de los objetos el valor 0
	}
	
	//metodos getter
	public String getNombre() {
		return this.nombre;
	}
	public String getUnidades() {
		return this.unidades;
	}
	public double getValorMinimo() {
		return this.valorMinimo;
	}
	public double getValorMaximo() {
		return this.valorMaximo;
	}
	
	//metodos setters
	public void setValorActual(double valorActual) {
		this.valorActual=valorActual;
	}
	
	//metodos para incrementar y decrementar
	public void incrementarValor() {
		if(valorActual<valorMaximo) {
			valorActual++;	
		}
	}
	public void decrementarValor() {
		if(valorActual>valorMinimo) {
			valorActual--;
		}
	}
	
	//metodos para imprimir los valores
	
}
