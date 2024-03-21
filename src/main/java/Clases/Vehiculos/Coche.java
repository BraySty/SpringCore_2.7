package clases.vehiculos;

import interfaz.EstadoActual;
import interfaz.Vehiculo;

public class Coche implements Vehiculo {

	private EstadoActual estado;
	
	public Coche(EstadoActual estado) {
		this.estado = estado;
	}

	public String getMotor() {
		return estado.getEstado();
	}
	
	@Override
	public String getTipoVehiculo() {
		return "Coche";
	}

	@Override
	public String getEstadoDelMotor() {
		return "El motor esta: " + estado.getEstado();
	}

}
