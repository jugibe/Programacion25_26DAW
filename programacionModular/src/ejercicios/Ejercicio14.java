package ejercicios;
/*
 * Javier Martin 23/10/2025
 *  Crea una método int lanzarDado() que simule el lanzamiento de un dado. Utilizala para
	crear un programa que simula el lanzamiento de un dado 1000 veces y cuente y muestre el
	numero de veces que ha salido cada número.
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		int c1 = 0, c2 = 0, c3= 0, c4= 0, c5= 0, c6= 0, dado; //este problema seria mejor hacerlo con arrays.
		for(int i=1;i<=1000;i++) {
			dado = lanzarDado();
			switch(dado){
			case 1: 
				c1++; 
				break;
			case 2: 
				c2++; 
				break;
			case 3: 
				c3++; 
				break;
			case 4: 
				c4++; 
				break;
			case 5: 
				c5++; 
				break;
			case 6: 
				c6++; 
				break;
			default:
				System.out.println("Dado erroneo");
			}
			System.out.println("Ha salido: "+dado);
		}
		System.out.println("El numero 1 ha salido: "+c1);
		System.out.println("El numero 2 ha salido: "+c2);
		System.out.println("El numero 3 ha salido: "+c3);
		System.out.println("El numero 4 ha salido: "+c4);
		System.out.println("El numero 5 ha salido: "+c5);
		System.out.println("El numero 6 ha salido: "+c6);
	}
	public static int lanzarDado() {
		return (int)(Math.random() * 6 + 1);
	}
}
