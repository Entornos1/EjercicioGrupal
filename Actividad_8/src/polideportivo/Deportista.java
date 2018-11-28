package polideportivo;

public class Deportista extends Persona {
	private String ejercicio;

	public Deportista(String nif, String nombre, String telefono, String ejercicio) {
		super(nif, nombre, telefono);
		this.ejercicio = ejercicio;
		// TODO Auto-generated constructor stub
	}

}
