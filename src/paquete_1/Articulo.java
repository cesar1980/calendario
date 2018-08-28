
package paquete_1;

import java.util.Scanner;

public class Articulo{
	Scanner teclado = new Scanner(System.in);

	//Se conoce de un artículo su costo base y se sabe que se ofrecen 2 precios de venta:
	//al detal (30% de incremento del costo base) y al mayor (15% de incremento del costo base). 
	//Se desea conocer los distintos PVP del artículo, al detal y al mayor.
	
	 private double costo;

	public Articulo(Scanner teclado, double costo) {
		this.teclado = teclado;
		this.costo = costo;
	}

	private double getCosto() {
		return costo;
	}

	private void setCosto(double costo) {
		this.costo = costo;
	}

	public double detalle (double costo) {

		System.out.println("¿De cuantos artículos es su compra?");
		double compra = teclado.nextDouble();
		compra = compra * costo;
		System.out.println("El precio base de su compra es de : "+compra);
		double venta=  (.30 * compra);
		venta = venta + compra;
		System.out.println("El pago de su compra a detalle es de: " + venta);
		return costo;
		
	}

	public double mayoreo (double costo) {
		
		System.out.println("¿De cuantos artículos es su compra?");
		double compra = teclado.nextDouble();
		compra = compra * costo;
		System.out.println("El precio base de su compra es de : "+compra);
		double venta=  (.15 * compra);
		venta = venta + compra;
		System.out.println("El pago de su compra a mayoreo es de: " + venta);
		return costo;
		
	}
	
	
	
}