package provincias;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Menu {
		
	public static void printMenu() throws SQLException {
		
		System.out.println("Elige provincia:");
			
		List<ComunidadAutonoma> comunidades= Main.leerComunidades();
		
		for (ComunidadAutonoma comunidadAutonoma : comunidades) {
			System.out.println(comunidadAutonoma.getId()+" : "+ comunidadAutonoma.getNombre());
		}
	
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);		
		int opcion=scan.nextInt();
		
		List<Provincia> provincias=Main.leerProvincias(opcion);
		
		for (Provincia provincia : provincias) {
			System.out.println(provincia.getNombre());
		}				
		
		Main.main(null);
	}
	
	

	

}
