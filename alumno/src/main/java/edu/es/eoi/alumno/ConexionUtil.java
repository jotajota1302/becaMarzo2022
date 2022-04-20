package edu.es.eoi.alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class ConexionUtil {
		
	public Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC", "root", "root");

	}

}
