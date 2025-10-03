package ejerciciosClase;

import java.util.Scanner;

/*
 *01/10/2025
 *renzo falcon escobal
 *Realizar un algoritmo que lea un número por teclado. En caso de que ese número
sea 0 o menor que 0, se saldrá del programa imprimiendo antes un mensaje de
error. Si es mayor que 0, se deberá calcular su cuadrado y la raíz cuadrada del
mismo, visualizando el numero que ha tecleado el usuario y su resultado (“Del
numero X, su potencia es X y su raíz X”). Para calcular la raíz cuadrada se puede
usar la función interna RAIZ(X) o con una potencia de 0,5.
 */
                  
public class Ejercicio16 {

	public static void main(String[] args) {
		//declaracion de variables
		double numero;
		Scanner teclado = new Scanner(System.in);
		//entrada de datos
		System.out.println("introduce un numero");
		numero=teclado.nextDouble();
		//Proceso
		if (numero<0) {
			System.out.println("error el numero es negativo");
		}else {
			System.out.println("del numero "+ numero + " su cuadrado es :" + Math.pow(numero, 2)
			+ " su raiz es: "+Math.sqrt(numero));
			
		}
		teclado.close();
	}

}
