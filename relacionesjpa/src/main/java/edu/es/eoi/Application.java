package edu.es.eoi;

import java.util.Calendar;
import java.util.Scanner;

public class Application {

	static EquipoRepository equipoRepository= new EquipoRepository();
	
	public static void main(String[] args) {
			
		//objetivo: saber el nombre del presidente del equipo X
		
		//Scanner, introduce id equipo y la respuesta tiene que ser el nombre del presidente
//		System.out.println("Introduce el id del equipo: ");
//				
//		Scanner scan=new Scanner(System.in);
//		int opcion=scan.nextInt();		
//		
//		Equipo equipo=equipoRepository.readEquipo(opcion);
		
//		System.out.println("El nombre del presidente es: "+ equipo.getPresidente().getNombre() );
//		System.out.println(equipo);
//		scan.close();
		
		//Crear un presidente y un equipo a la vez
		
		Equipo equipo=new Equipo();
		equipo.setNombre("Equipo test");
		equipo.setPresupuesto(5500.0);
		
		Presidente presidente= new Presidente();
		presidente.setNombre("Nombre Presi test");
		presidente.setFechaInicio(Calendar.getInstance().getTime());
				
		presidente.setEquipo(equipo);
		equipo.setPresidente(presidente);
		
		equipoRepository.createEquipo(equipo);
		
	}

}
