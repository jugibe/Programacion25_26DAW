package ejemplosClase;
/*
 * Jeyson Delgado
 * 17/11/2025
 * 
 * Clase que crea objetos de la clase Persona.
 */

public class Principal {

	public static void main(String[] args) {
		//Definir las personas
		Persona p1 = new Persona("Jeyson", 30, "Valizales");
		Persona p2 = new Persona("Eder", 18, "Zaragoza");
		//Persona p3 = new Persona(Leer.leerFrase("Introduce el nombre"), Leer.leerEntero("Ingresa tu edad"));
		
		
		//Llamamos a los metodos
		p1.presentarPersona();
		p2.presentarPersona();
		//p3.presentarPersona();
		
		//Podemos acceder a los atributos de los objetos 
		//si no los hemos definido private, podemos acceder a ellos directamente
		//p1.edad=25; si lo definimos como private, no se puede acceder a el.
		p1.presentarPersona();
		
		//Esta forma de acceder a los atributos esta en contra de la POO(Programacion orientada a objetos)
		//Para acceder a los atributos se utilizan los metodos Getters y Setters.
		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());
		
		//Los metodos Setter se usan para modificar un atributo
		p1.setNombre("Jeyson El Grande");
		p1.presentarPersona();
		
		//Que ocurre si intento imprimir una persona
		System.out.println(p1);
		p1.happyBirthday();
		System.out.println(p1);
	}


}
