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
	
	
	/**
	 * metodo mandarCorrer
	 */
	public String mandarCorrer(Persona persona) {
		return "Empieza a correr 2 vueltas al campo  " + persona.getNombre()+"."; 
	}
	
	/**
	 * Metodo Propio de la subclase	 * 
	 * @return String con el nombre del profesero que va a corregir los examenes.
	 */
	public String prepararEntrenamiento(Persona persona) {
		return "El entrenador " + this.getNombre() + " va preparar el entranamiento para " + persona.getNombre() +".";
	}	
  
}
