package ejemplosClase;
/*
 * Jeyson Delgado
 * 17/11/2025
 * 
 * Definicion de la clase persona
 */
public class Persona {
	//Atributos de la clase persona
	//Propiedades que debemos que definir cuando creamos una persona
	private String nombre;
	private int edad;//Mejor fecha de nacimiento 
	private String ciudad;
	//Metodo Constructor
	public Persona(String n, int e, String c){
		this.nombre=n;
		this.edad=e;
		this.ciudad=c;
	}
	
	//Metodos de acciones que realicen las personas
	public void presentarPersona() {
		System.out.println("Hola soy"+this.nombre+" Tengo: "+this.edad+" años"+ "vivo en"+ciudad);
	}
	//Metodo de cumplir años
	public void happyBirthday() { //este metodo incrementa en 1 la edad
		this.edad++;
	}
	
	/*Para definir a que atributo se le da acceso 
	 * para ver su contenido y modificarlos se utilizan 
	 * unos metodos llamados Getters y Setters.
	 */
	
	//Metodos Get, se utilizan para ver el contenido o el valor de un atributo
	//Un metodo Get por atributo que queramos que sea visible 
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public String getCiudad() {
		return this.ciudad;
	}
	
	//Metodos Setters se usan para modificar un atributo
	public void setNombre(String nombre) {
		this.nombre=nombre;//this.nombre es el nimbre del objeto y el String nombre es el nuevo nombre
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
		
	}
	public void setCiudad(String ciudad) {
		this.ciudad=ciudad;
	}
	//vamos a escribir el metodo to String este metodo determina lo quer aparecera al intentar imprimir con un println el objeto
	public String toString () {
		return "nombre: "+nombre+ " edad: "+edad+ "y la ciudad: "+ciudad;
		
	} 
}


