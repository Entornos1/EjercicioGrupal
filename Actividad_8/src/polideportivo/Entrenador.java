package polideportivo;

public class Entrenador extends Persona {
	private String deporte;

	public Entrenador(String nif, String nombre, String telefono, String deporte) {
		super(nif, nombre, telefono);
		this.deporte = deporte;
		// TODO Auto-generated constructor stub
	}

}
