package edu.es.eoi.service;

import java.sql.SQLException;
import java.util.List;

import edu.es.eoi.entity.Mail;
import edu.es.eoi.repository.MailRepository;

public class MailService {

	public MailRepository repository = new MailRepository();

	public List<Mail> getInbox(int idUser) throws SQLException {

		return repository.getInbox(idUser);
	}

	public List<Mail> getOutbox(int idUser) throws SQLException {

		return repository.getOutbox(idUser);
	}

	public boolean sendMail(Mail email) throws SQLException {

		return repository.sendMail(email);
	}

	public boolean openMail(int id) throws SQLException {

		return repository.openMail(id);
	}

	public boolean deleteMail(int id) throws SQLException {

		return false;
	}

}
