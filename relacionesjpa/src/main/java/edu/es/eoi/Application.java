package edu.es.eoi;

import java.util.Scanner;

public class Application {

	
	public static void main(String[] args) {
			
		//objetivo: saber el nombre del presidente del equipo X
		
		//Scanner, introduce id equipo y la respuesta tiene que ser el nombre del presidente
		System.out.println("Introduce el id del equipo: ");
				
		Scanner scan=new Scanner(System.in);
		int opcion=scan.nextInt();
		
		EquipoRepository equipoRepository= new EquipoRepository();
		
		Equipo equipo=equipoRepository.readEquipo(opcion);
		
		System.out.println("El nombre del presidente es: "+ equipo.getPresidente().getNombre() );
		
		scan.close();
	}

}
