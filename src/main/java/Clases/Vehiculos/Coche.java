package Clases.Vehiculos;

import Interfaz.EstadoActual;
import Interfaz.Vehiculo;

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
		// TODO Auto-generated method stub
		return "Coche";
	}

	@Override
	public String getEstadoDelMotor() {
		// TODO Auto-generated method stub
		return "El motor esta: " + estado.getEstado();
	}

}
