package objetosyClases;

public class Persona {

	
	
	//Atributos
	
	
	String nombre;
	int edad;
	
	
	

	//Método constructor
	public Persona(String _nombre, int _edad){
		
		
		nombre= _nombre;
		edad = _edad;
	}
	
	
	public void mostrarDatos() {
		
		System.out.println("El nombres es: " + nombre);
		System.out.println("La edad es: " + edad);
	}
}
