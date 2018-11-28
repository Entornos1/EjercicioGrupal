package polideportivo;

public class Principal {
	public static void main(String[] args) {
		//Crea un objeto Profesor, un objeto Alumno y un objeto Administrativo.
		Entrenador entrenador1 = new Entrenador("32456987V", "Juan Torres", "616669922", "Futbol");
		Deportista deportista1 = new Deportista("52879654F", "Magico Gonzalez", "639889999", "Correr");
		
		/*
		 * Se especicica que toString() en cada una de las clases para que muestre toda la información posible
		 * 
		 */
		Persona [] lista = {entrenador1, deportista1};	
		for (Persona ele: lista) {
			System.out.println(ele + "\n");
		} 
	}	
}
