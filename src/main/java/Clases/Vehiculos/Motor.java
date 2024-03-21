package Clases.Vehiculos;

import Interfaz.EstadoActual;

public class Motor implements EstadoActual{

	private String estado;
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String getEstado() {
		// TODO Auto-generated method stub
		return estado;
	}

	
	
}
