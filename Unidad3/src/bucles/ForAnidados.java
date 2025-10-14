package bucles;

public class ForAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filasTotales=10;
		for ( int fila = 1; fila<=filasTotales; fila++) {
			for(int col=1;col<=(filasTotales-fila);col++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*fila-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
