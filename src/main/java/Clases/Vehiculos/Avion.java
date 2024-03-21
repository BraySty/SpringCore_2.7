package Clases.Vehiculos;

import Interfaz.EstadoActual;
import Interfaz.Vehiculo;

public class Avion implements Vehiculo{

	private EstadoActual estado;
	
	public Avion(EstadoActual estado) {
		this.estado = estado;
	}

	@Override
	public String getTipoVehiculo() {
		// TODO Auto-generated method stub
		return "avion";
	}

	@Override
	public String getEstadoDelMotor() {
		// TODO Auto-generated method stub
		return "El motor esta: " + estado.getEstado();
	}

	
}
