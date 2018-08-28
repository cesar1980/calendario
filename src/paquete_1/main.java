package paquete_1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		Articulo articulo = new Articulo ();
		
		System.out.println("Costo base del artículo:");
		double costo = teclado.nextDouble();
		
		System.out.println("Su compra es a detalle :\n1.Si (Max 10 Artículos)  \n2.No (Min 11 Artículos)");
		int opcion = teclado.nextInt();
				
		if (opcion == 1) {
		articulo.detalle(costo);
		} else  if (opcion == 2){
			articulo.mayoreo(costo);
		}  else {
			System.out.println("Opción equivocada");
		}
		
	}

}
