package py.edu.facitec.proyecto1.entidad;
/**
 * Clase que representa al objeto cliente
 * @author Alison Berchstoll de Oliveira
 *
 */
public class Cliente extends Persona {
	//Atributo
	private boolean activo;
	//Constuctor
	public Cliente() {
		super();
		this.activo=true;
	}
	//Getter y Setter
	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	 
}
