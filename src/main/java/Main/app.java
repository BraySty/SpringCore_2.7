package Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Interfaz.Vehiculo;

public class app {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("bean.xml");

		Vehiculo vehiculo = contexto.getBean("beanVehiculoAvion", Vehiculo.class);
		
		Vehiculo vehiculo2 = contexto.getBean("beanVehiculoCoche", Vehiculo.class);
		
		System.out.println("Tipo: " + vehiculo.getTipoVehiculo());
		System.out.println(vehiculo.getEstadoDelMotor());
		
		System.out.println("Tipo: " + vehiculo2.getTipoVehiculo());
		System.out.println(vehiculo2.getEstadoDelMotor());
		
		contexto.close();
		
	}
	
}
