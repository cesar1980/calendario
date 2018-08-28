
package calcular;


//Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados. 
//Los valores de la longitud deberán introducirse por línea de ordenes. 
//Si es un cuadrado, sólo se proporcionará la longitud de uno de los lados al constructor.


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
		
		

