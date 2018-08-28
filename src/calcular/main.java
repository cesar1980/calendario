package calcular;

import javax.swing.JOptionPane;

public class main {

	
	public static void main(String[] args) {
		
		// AQUÍ ESCRIBIO NOE
		cuadrilatero c1;
		float numero1;
		float numero2;

		// AQUÍ ESCRIBIO DE NUEVO NOE
		//Hola Noe
		// Ahora comento yo
		
		numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1"));
		numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2"));

		if (numero1 == numero2) {
			
			c1= new cuadrilatero (numero1);
			
		} else {
			
			c1 = new cuadrilatero (numero1, numero2);

		} 
		
		System.out.println("El perimetro es : " + c1.getPerimetro() + " mts");
		System.out.println("El área es: " + c1.getArea() + " mts^2");
		
	}
	

	

}
