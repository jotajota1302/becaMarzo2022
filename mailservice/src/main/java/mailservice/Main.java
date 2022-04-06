package mailservice;

import java.sql.SQLException;

public class Main {
		
	public static void main(String[] args) {
		
		//login
		
		UserService service= new UserService();
		
		try {
			System.out.println(service.login("JJ", "passwordincorrecto"));
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		
		//enviar correo
		//bandeja entrada
		//bandeja salida
		//cerrar sesion
	
		
		
	}

}
