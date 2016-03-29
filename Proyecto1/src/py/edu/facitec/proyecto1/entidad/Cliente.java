package py.edu.facitec.proyecto1.entidad;

public class Cliente extends Persona {
	private boolean activo;

	public Cliente() {
		super();
		this.activo=true;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}
