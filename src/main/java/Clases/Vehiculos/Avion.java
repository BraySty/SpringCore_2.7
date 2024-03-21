package clases.vehiculos;

import interfaz.EstadoActual;
import interfaz.Vehiculo;

public class Avion implements Vehiculo{

	private EstadoActual estado;
	
	public Avion(EstadoActual estado) {
		this.estado = estado;
	}

	@Override
	public String getTipoVehiculo() {
		return "avion";
	}

	@Override
	public String getEstadoDelMotor() {
		return "El motor esta: " + estado.getEstado();
	}

	
}
