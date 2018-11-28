package polideportivo;

public class Deportista extends Persona {
	private String ejercicio;

	public Deportista(String nif, String nombre, String telefono, String ejercicio) {
		super(nif, nombre, telefono);
		this.ejercicio = ejercicio;

	}

	/**
	 * @return the ejercicio
	 */
	public String getEjercicio() {
		return ejercicio;
	}

	/**
	 * @param ejercicio the ejercicio to set
	 */
	public void setEjercicio(String ejercicio) {
		this.ejercicio = ejercicio;
	}
/*
 * Metodo saltarValla
 */
	public String saltarVallas(Persona persona) {
		int vallasSaltadas = (int) (Math.random()*10);
		if (vallasSaltadas == 0) {
			System.out.println("El deportista "+getNombre() + " no ha saltado correctamente ninguna valla ");
		}else {
			if (vallasSaltadas == 1 ) {
				System.out.println("El deportista "+getNombre() + " ha saltado correctamente "+ vallasSaltadas + " valla ");
			}else {
				System.out.println("El deportista "+getNombre() + " ha saltado correctamente "+ vallasSaltadas + " vallas ");
			}
		}  
		return "  " ;
	}
}
