package ejercicios;

import ejemplosClase.Leer;

/*
 * Creo un objeto de la clase indicador y un menui para manejarlo
 * 
 */

public class MainIndicador {

	public static void main(String[] args) {
		Indicador i1=new Indicador("Cuenta Km coche","Km/h",0,200);
		int opcion=0; // valor de la opción seleccionada
		do {
			//EScribir menu
			System.out.println("OPCIONES");
			System.out.println("1.- Ver indicador");
			System.out.println("2.- Ver valor actual");
			System.out.println("3.- Ver valor máximo");
			System.out.println("4.- Ver Valor minimo");
			System.out.println("5.- Aumentar");
			System.out.println("6.- disminuir");
			
			System.out.println("7.- Salir");		
			
			//pedir opcion
			opcion=Leer.leerEntero("Introduce una opción");
			//Ejecutar segun la opcion
			switch(opcion) {
			case 1:
				i1.verIndicador();
				break;
			case 2:
				i1.verValorActual();
			break;
			case 3:
				System.out.println(i1.getValorMaximo()+ " "+ i1.getUnidades());
			break;
			case 4:
				System.out.println(i1.getValorMinimo()+ " "+ i1.getUnidades());
			break;
			case 5:
				i1.incrementarValor();
				//mensaje de todo ok
			break;
			case 6:
				i1.decrementarValor();
				//mensaje todo ok
			break;
			case 7:
				System.out.println("Salir del menu");
			break;
			default:
				System.out.println("opcion erronea");
				
			}
			
		}while(opcion!=7);

	}

}
