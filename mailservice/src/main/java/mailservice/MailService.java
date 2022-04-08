package mailservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MailService {

	public List<Mail> getInbox(int idUser) throws SQLException {

		List<Mail> mails = new ArrayList<Mail>();
		Connection connection = getConnection();

		PreparedStatement statement = connection
				.prepareStatement("SELECT * FROM beca.mail where receiver=? order by fecha ASC");
		statement.setInt(1, idUser);
		try {

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				Mail mail = new Mail();
				mail.setSubject(rs.getString("subject"));
				mail.setText(rs.getString("text"));
				mail.setTime(rs.getTimestamp("fecha"));

				mails.add(mail);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			connection.close();
		}

		return mails;
	}

	public List<Mail> getOutbox(int idUser) throws SQLException {

		List<Mail> mails = new ArrayList<Mail>();
		Connection connection = getConnection();

		PreparedStatement statement = connection
				.prepareStatement("SELECT * FROM beca.mail where sender=? order by fecha ASC");
		statement.setInt(1, idUser);
		try {

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				Mail mail = new Mail();
				mail.setSubject(rs.getString("subject"));
				mail.setText(rs.getString("text"));
				mail.setTime(rs.getTimestamp("fecha"));

				mails.add(mail);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			connection.close();
		}

		return mails;
	}

	public boolean sendMail(Mail email) throws SQLException {

		Connection connection = getConnection();

		PreparedStatement statement = connection.prepareStatement(
				"INSERT INTO beca.mail (fecha,subject,text,opened,sender,receiver) VALUES (?,?,?,?,?,?)");
		statement.setTimestamp(1, email.getTime());
		statement.setString(2, email.getSubject());
		statement.setString(3, email.getText());
		statement.setBoolean(4, false);
		statement.setInt(5, email.getSender().getId());
		statement.setInt(6, email.getReceiver().getId());

		int result = statement.executeUpdate();

		if (result >= 1) {
			return true;
		}

		connection.close();

		return false;

	}

	public boolean openMail(int id) throws SQLException {

		Connection connection = getConnection();

		PreparedStatement statement = connection.prepareStatement("UPDATE beca.mail SET opened = 1 WHERE id = ?");
		statement.setInt(1, id);

		int result = statement.executeUpdate();

		if (result >= 1) {
			return true;
		}

		connection.close();

		return false;

	}

	public boolean deleteMail(int id) throws SQLException {

		Connection connection = getConnection();

		PreparedStatement statement = connection.prepareStatement("DELETE FROM beca.mail WHERE id = ?");
		statement.setInt(1, id);

		int result = statement.executeUpdate();

		if (result >= 1) {
			return true;
		}

		connection.close();

		return false;
	}

	private Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC", "root", "root");

	}

}
