package objetosyClases;

import javax.swing.JOptionPane;

public class Operacion {

	
	//Atributos
	
	int ingresos;
	
	
	//Métodos
	
	//Método para pedir información
	
	
	public void ingreso(int numero1, int numero2) {
		System.out.println("Ingreso el numero("+ numero1 + ") y el numero (" +numero2 +")");
	}
	
	public int sumar(int numero1, int numero2) {
		int suma = numero1 + numero2;
		return suma;
	}
	
	
	public int restar(int numero1, int numero2) {
		int resta = numero1 - numero2;
		return resta;
		}
	
	
	public int multiplicar (int numero1, int numero2) {
		int multiplicacion = numero1 * numero2;
		return multiplicacion;
	}
	
	
	public int dividir (int numero1, int numero2) {
		int division = numero1 / numero2;
		return division;
	}
	
	public int sobrar (int numero1, int numero2) {
		int residuo = numero1 % numero2;
		return residuo;
	}
	 
	public int elevado(double numero1, double numero2) {
		int potencia = (int) Math.pow(numero1, numero2);
		return potencia;
	}
	
	public void mostrarResultados(int suma, int resta, int multiplicacion, int division, int residuo, int potencia) {
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: "+ multiplicacion);
		System.out.println("La división es: " + division);
		System.out.println("El residuo de la operación es: "+ residuo);
		System.out.println("La potencia de los numeros entregados es: " + potencia);
	}
	
}
