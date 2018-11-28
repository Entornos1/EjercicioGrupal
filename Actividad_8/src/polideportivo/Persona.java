package polideportivo;

/**
 * DAM1 - Entornos de desarrollo - UTF4
 * 
 * Actividad 8. Tarea Grupal.
 * Centro educativo.
 * 
 * <h2>Clase Persona</h2>
 * Clase abstracta que heredan profesor, alumno y administrativo.
 * Contiene los metodos y atributos base que se transmiten a las clases hijo.
 * 	
 * @author Juan Antonio Pavón Carmona *
 *	
 */

public abstract class Persona {
	private String nif, nombre, direccion, telefono;

	
	/**
	 * Constructor con los atributos base requeridos para una persona del polideportivo.
	 * 
	 * @param nif Documento de identificación fiscal de la persona.
	 * @param nombre Nombre completo de la persona.
	 * @param direccion Dirección completa de la persona.
	 * @param telefono teléfono de la perosna
	 */
	
	public Persona (String nif, String nombre, String telefono) {
		this.nif = nif;
		this.nombre = nombre;
		this.telefono = telefono;		
	}
	
	/**
	 * Sobreescritura del método toString para mostrar la información del objeto completo.
	 * Se especficicara en cada subclase
	 *  
	 * @return String con la información del objeto.	 * 
	 */
	@Override
	public String toString() {
		return "[nif=" + nif + ", nombre=" + nombre + ", telefono=" + telefono	+ "]";
	}
	
	//Get & Set
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}	
}


