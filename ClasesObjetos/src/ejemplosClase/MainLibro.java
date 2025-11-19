package ejemplosClase;

public class MainLibro {

	public static void main(String[] args) {
		//Creamos 2 libros
		Libro l1 = new Libro("Cervantes", "Quijote");
		Libro l2 = new Libro("Garcia Marquez", "100 años de soledad");
		
		System.out.println("Hemos instanciado "+Libro.getNumLibros()+" Libros");
		
		
	}

}
