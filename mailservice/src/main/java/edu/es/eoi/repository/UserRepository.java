package edu.es.eoi.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import edu.es.eoi.entity.User;

public class UserRepository {

	private Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC", "root", "root");

	}
	
	
	public User getUser(String mail, String password) throws SQLException {

		User user = null;

		Connection connection = getConnection();

		PreparedStatement statement = connection
				.prepareStatement("SELECT * FROM beca.user where email=? and password=?");
		statement.setString(1, mail);
		statement.setString(2, password);

		try {
			
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				user = new User();
				user.setEmail(rs.getString("email"));
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setLastAccess(rs.getTimestamp("lastaccess"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			connection.close();
		}

		return user;
	}



	public boolean exists(String email) throws SQLException {

		Connection connection = getConnection();

		PreparedStatement statement = connection.prepareStatement("SELECT id FROM beca.user WHERE EMAIL=?");
		statement.setString(1, email);

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {

			return true;
		}
		
		connection.close();

		return false;

	}
	
	public User getUserByEmail(String email) throws SQLException {

		User user = null;
		Connection connection = getConnection();

		PreparedStatement statement = connection.prepareStatement("SELECT * FROM beca.user WHERE EMAIL=?");
		statement.setString(1, email);

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {

			user=new User();
			user.setId(rs.getInt("id"));
			user.setEmail(rs.getString("email"));
			user.setName(rs.getString("name"));
			
			return user;
		}
		
		connection.close();

		return user;

	}
	
	public boolean create(User user) throws SQLException {

		Connection connection = getConnection();

		PreparedStatement statement = connection
				.prepareStatement("INSERT INTO beca.user (email,name,surname,password,lastaccess) VALUES (?,?,?,?,?)");
		statement.setString(1, user.getEmail());
		statement.setString(2, user.getName());
		statement.setString(3, user.getSurname());
		statement.setString(4, user.getPassword());
		statement.setTimestamp(5,user.getLastAccess());

		int result = statement.executeUpdate();

		if (result >= 1) {
			return true;
		}
		
		connection.close();

		return false;
	}

	public boolean updateLastAcess(String email) throws SQLException {

		Connection connection = getConnection();

		PreparedStatement statement = connection.prepareStatement("UPDATE beca.user SET lastaccess= ? WHERE email=?");
		statement.setTimestamp(1,Timestamp.valueOf(LocalDateTime.now()));
		statement.setString(2, email);

		int result = statement.executeUpdate();

		if (result >= 1) {
			return true;
		}

		connection.close();
		
		return false;		
		
	}
	
}
