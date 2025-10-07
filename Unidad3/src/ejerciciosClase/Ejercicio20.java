package ejerciciosClase;

import java.util.Scanner;

/*
 * MarioLaborda 7/10/2025
 * Escribir un programa que vaya pidiendo números hasta que el usuario introduzca un 
cero. Debe mostrar por pantalla los números que introduce en las posiciones 
impares pero no en las pares, es decir, el primero, tercero, quinto, séptimo, ... que 
inserte deben mostrase, pero el segundo, cuarto, sexto, octavo, ... no deben 
mostrarse por pantalla. 
Para realizar este ejercicio piensa que pueden anidarse sentencias de repetición con 
sentencias de selección.
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		// Declaramos variables
		int n1;
		int posicion=0;
        Scanner  sc = new Scanner(System.in);
        //Introducimos el primer dato
        System.out.println("Introduce un numero ");
        n1= sc.nextInt();
        //bucle
        while (n1!=0) {
        	posicion++;
        	if(posicion%2!=0) {
        		System.out.println("Has introucido el numero  " + n1+ " en la posicion " +posicion);	
        	} else {
        		System.out.println("posicion par "+posicion);
        	}
        	System.out.println("Introduce otro numero");
        	n1= sc.nextInt();
        }
        sc.close();
        
    }

}
