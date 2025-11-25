package ejemplosClase;


public class MainProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto ("llavero",1);
		Producto p2 = new Producto ("imán", 1.5);
		Producto p3 = new Producto ("figura", 5);
		
		System.out.println(p1);
		System.out.println(p2);
		
		//Cambio el precio de p2
		p2.setPrecioEuros(2);
		System.out.println(p2);
		
		//Cambio cotizacion dolar 
		Producto.setCambioEuroDolar(1.20);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		

	}

}
