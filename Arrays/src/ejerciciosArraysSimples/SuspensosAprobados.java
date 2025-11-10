package ejerciciosArraysSimples;
/*
 * Alejandro Lozano 10/11/2025
 * Crea un array con las notas de 6 alumnos (valores entre 0 y 10).
 * Muestra cuántos aprobaron (nota ≥ 5) y cuántos suspendieron.
 */
public class SuspensosAprobados {

	public static void main(String[] args) {
		//Crear los arrays
		final int ALUMNOS = 6; 
		int []notasAlumnos = new int [ALUMNOS];
		llenarVector(notasAlumnos);
		
		//Resultado 
		int []resultados = aprobadosSuspendidos(notasAlumnos);
		//No haria falta utilizar un array, si se conoce el numero de suspensos se sabe el de aprobados con la longitud
		
		//Imprimir 
		imprimirVector(notasAlumnos);
		System.out.println("Numero de aprobados es igual a " + resultados[0]);
		System.out.println("Numero de suspensos es igual a " + resultados[1]);

	}
	//Le paso un vector con las notas y me devuelve un array con 2 componentes uno de suspensos y otro de aprobados
	private static int[] aprobadosSuspendidos(int[]vector) {
		int []resultados = new int [2];//componente 0 aprobado - componente 1 suspendido
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] >= 5) {
				resultados[0]++;
			}else {
				resultados[1]++;
			}	
		}
		return resultados;
	}
	//Metodo que llena un vector de numeros aleatorios enteros entre 0 y 10
	private static void llenarVector(int[]v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 11);
		}
	}
	//Metodo que imprime un vector usando Printf (formato determinado)
	private static void imprimirVector(int[]vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%4d",vector[i]);
		}
		System.out.println();//Salto de linea despues de cada vector
	}

}
