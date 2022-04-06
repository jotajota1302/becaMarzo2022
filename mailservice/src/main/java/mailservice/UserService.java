package mailservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
	
	public boolean login(String user, String password) throws SQLException {	
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC",
				"root", "root");
		
		PreparedStatement statement=connection.prepareStatement("SELECT password FROM beca.user where name=?");
		statement.setString(1, user);
		
		ResultSet rs= statement.executeQuery();
		
		while (rs.next()) {
			
			if(rs.getString("password").equals(password)) {
				return true;
			}else {
				return false;
			}			
		}
		return false;
	}
	
	public boolean exists(String email) {
		
		//TODO
		
		return false;
		
	}

	public boolean create(User user) {
		
		//TODO
		return false;
	}
	
	public boolean updateLastAcess(String email) {
		
		//TODO
		return false;
	}
}
