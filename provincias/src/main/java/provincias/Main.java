package provincias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

	public static Map<String, List<String>> provincias;

	public static void main(String[] args) throws SQLException {
				
		Menu.printMenu();	

	}

	public static List<ComunidadAutonoma> leerComunidades() throws SQLException {
		
		Connection connection = getConnection();	

		return consulta(connection);		

	}
	
	public static List<Provincia> leerProvincias(int idCCAA) throws SQLException {
		
		Connection connection = getConnection();	

		return consultaProvincias(connection, idCCAA);		

	}

	private static List<ComunidadAutonoma> consulta(Connection connection) throws SQLException {
		
		List<ComunidadAutonoma> comunidadesAutonomas= new ArrayList<ComunidadAutonoma>();
		
		PreparedStatement pst = connection.prepareStatement("SELECT p.id,p.name from beca.provincia p");

		ResultSet rs = pst.executeQuery();

		while (rs.next()) {

			ComunidadAutonoma comunidadAutonoma= new ComunidadAutonoma();			
			comunidadAutonoma.setNombre(rs.getString("p.name"));
			comunidadAutonoma.setId(rs.getInt("p.id"));
			
			comunidadesAutonomas.add(comunidadAutonoma);
		}
		
		connection.close();
		
		return comunidadesAutonomas;
	}
	
	private static List<Provincia> consultaProvincias(Connection connection, int idCCAA) throws SQLException {
		
		List<Provincia> provincias= new ArrayList<Provincia>();
		
		PreparedStatement pst = connection.prepareStatement("SELECT c.nombre FROM beca.provincia p ,beca.ciudades c where p.id=c.comunidad and p.id=?");
		pst.setInt(1, idCCAA);
		
		ResultSet rs = pst.executeQuery();

		while (rs.next()) {

			Provincia provincia= new Provincia();			
			provincia.setNombre(rs.getString("c.nombre"));			
			
			provincias.add(provincia);
		}
		
		connection.close();
		
		return provincias;
	}
	
	
	private static Connection getConnection() throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC",
				"root", "root");
		
		return connection;
	}

}
