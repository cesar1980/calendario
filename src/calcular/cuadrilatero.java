
package calcular;


//Construir un programa que calcule el �rea y el per�metro de un cuadril�tero dada la longitud de sus dos lados. 
//Los valores de la longitud deber�n introducirse por l�nea de ordenes. 
//Si es un cuadrado, s�lo se proporcionar� la longitud de uno de los lados al constructor.


public class cuadrilatero{
	
	private float numero1;
	private float numero2;
	
	
	public cuadrilatero(float numero1, float numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public cuadrilatero (float numero1){
		this.numero1 = this.numero2 = numero1;
	}
	
	public float  getPerimetro () {
		
		float perimetro = 2 * (numero1 + numero2) ;
		return perimetro;
	}
	
	
	public float getArea () {
		
		float area = numero1 * numero2;
		return area;
	}

	
}
		
		

