package ejercicios;

import ejemplosClase.Leer;

public class GestionTragabolas {
	/*
	 * En el método main de la clase GestionTragabolas hay que mostrar un menú con
	 * las siguientes opciones: 1: Crear tragaBolas. (Sólo se puede crear un objeto,
	 * por tanto, esta opción sólo se mostrará si no se ha creado ningún
	 * tragabolas). 2: Darle de comer. 3: Trotar 4: Hacerle dormir. 5: Ver estado.
	 * 0: Fin.
	 */
	public static void main(String[] args) {
		// definimos variables
		int opcion = 0;// opcion del menu
		Tragabolas t = null;

		do {
			// escribir el menu
			System.out.println("OPCIONES");
			if (t == null) {
				System.out.println("1 - Crear tragabolas");
			} else {
				System.out.println("2 - Darle de comer");
				System.out.println("3 - Trotar");
				System.out.println("4 - Hacerle dormir");
				System.out.println("5 - Ver estado");
			}
			System.out.println("0 - Salir");

			// pedir la opcion
			opcion = Leer.leerEntero("Introduce tu opcion: ");

			// ejecutar segun la opcion
			switch (opcion) {
			case 0:
				System.out.println("Fin de programa");
				break;
			
			case 1:
				if (t == null) {
					t = new Tragabolas(Leer.leerFrase("Introduce el color: "),Leer.leerEntero("Introduce max bolas: "));
				} else {
					System.out.println("Tragabolas creado");
				}
				break;
			
			case 2:
				if(t != null) {
					t.comer();
				} else {
					System.out.println("Crea primero el tragabolas");
				}
				break;
				
			case 3:
				if(t != null) {
					t.trotar();
				} else {
					System.out.println("Crea primero el tragabolas");
				}
				break;
				
			case 4:
				if(t != null) {
					t.dormir();
				} else {
					System.out.println("Crea primero el tragabolas");
				}
				break;
			
			case 5:
				if(t != null) {
					t.visualizar();
				} else {
					System.out.println("Crea primero el tragabolas");
				}
				break;
				
			default:
				System.out.println("Opcion erronea.");
				break;
			}
		} while (opcion != 0);

	}

	// metodo que escribe el menu

}
