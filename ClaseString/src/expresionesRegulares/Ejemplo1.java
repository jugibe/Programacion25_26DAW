package expresionesRegulares;
/*
 * Mariano Clavero
 * 04/11/2025
 * Uso de expresiones regulares
 * Las expresiones regulares en Java permiten crear patrones para validar, buscar o manipular texto. Se
construyen combinando símbolos especiales que definen reglas de coincidencia. Aquí algunas
posibilidades organizadas por tipo y función. Se usan para buscar palabras en un texto que cumplen un
determinado patrón, para validar formato de cadenas....
 */
public class Ejemplo1 {

	public static void main(String[] args) {
		// boolean string.matches(expresionRegular)
		// Coincidencia total en cadena
		String c = "arbol";
		System.out.println(c.matches("arbol"));
		
		// Caracteres comodin
		// El "." equivale a cualquier caracter
		// "am.r" serian validas las palabras "amor, amar, amer, am9r..."
		c = "amxr";
		System.out.println(c.matches("am.r"));
		
		// "[abc]" será valido cualquier caracter de los que esten entre corchetes
		c = "amyr";
		System.out.println(c.matches("am[aeiou]r"));
		
		// se pueden poner rangos de caracteres "[a-zA-Z]"
		c = "amwr";
		System.out.println(c.matches("am[a-z]r"));
		
		// "[^aeiou] seria cualquier caracter excepto lo que este entre corchetes
		c = "xmor";
		System.out.println(c.matches("[^aeiou]mor"));
		
		// Cuantificadores
		/*
		    * Cero o más a* ``, a, aa
			+ Una o más a+ a, aa
			? Cero o una colou?r color, colour
			{n} Exactamente n a{3} aaa
			{n,} Al menos n a{2,} aa, aaa
			{n,m} Entre n y m a{2,4} aa, aaa, aaaa
		 */
		// Palabra que empiece por vocal
		String exReg = "[aeiouAEIOU]+.*"; // El bloque [] una o mas veces (+) y cualquier caracter (.)
										  // cero o mas veces (*)
		System.out.println("A".matches(exReg));
		
		// Que acabe con un digito (0-9)
		exReg = ".*[0-9]";
		System.out.println("ho9la".matches(exReg));
		
		// Determinar un telefono (9 digitos)
		exReg = "\\d{3}[- ][0-9]{6}"; // Son dos barras para caracter de escape "\\d" significa cualquier digito
		System.out.println("626-262662".matches(exReg));
		
		// Validar un DNI
		exReg = "\\d{8}-?[A-Z]"; // "?" significa cero o uno en cuanto a expresiones regulares
		System.out.println("12345678-A".matches(exReg));
		
		
	}

}
