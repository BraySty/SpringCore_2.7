package clases.vehiculos;

import interfaz.EstadoActual;

public class Motor implements EstadoActual{

	private String estado;
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String getEstado() {
		return estado;
	}

	
	
}
