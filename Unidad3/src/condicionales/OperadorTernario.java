package condicionales;
/*
 * 29/09/2025 Alejandro Lozano López
 * Programa para aprender a utilizar el operador ternario ?
 * Programa que me dice si un numero es par o impar
 */
public class OperadorTernario {

	public static void main(String[] args) {
		//Declaramos variables
		int numero=-5;
		String resultado;
		resultado=(numero%2==0)? "es par":"es impar";
		resultado=resultado+"\n";//esto es equivalente a poner resultado+="\n"
		//que me indique si el numero es positivo, negativo o cero
		resultado+=(numero>0)? "es positivo":((numero==0)?"es cero":"es negativo");
		//valor=(expresionBooleana)? valor_que asiganara si expresion es true : valor_que asignara si expresion es false
		System.out.println(resultado);
 
	}

}
