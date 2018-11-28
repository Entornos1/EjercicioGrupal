package polideportivo;

public class Entrenador extends Persona {
	private String deporte;

	public Entrenador(String nif, String nombre, String telefono, String deporte) {
		super(nif, nombre, telefono);
		this.deporte = deporte;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the deporte
	 */
	public String getDeporte() {
		return deporte;
	}

	/**
	 * @param deporte the deporte to set
	 */
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	} 
	public String mandarCorrer(Persona persona) {
	System.out.println("Empieza a correr 2 vueltas al campo  " + persona.getNombre());
		
		return " ";
	}

}
