package main;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import interfaz.Vehiculo;

public class Main {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(Main.class.getClass().getName());

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("bean.xml");

		Vehiculo vehiculo = contexto.getBean("beanVehiculoAvion", Vehiculo.class);
		
		Vehiculo vehiculo2 = contexto.getBean("beanVehiculoCoche", Vehiculo.class);
		
		logger.info("El vehiculo es un: " + vehiculo.getTipoVehiculo() + 
				"\n" + vehiculo.getEstadoDelMotor());
		
		logger.info("Tipo: " + vehiculo2.getTipoVehiculo() + 
				"\n" + vehiculo.getEstadoDelMotor());
		
		contexto.close();
		
	}
	
}
