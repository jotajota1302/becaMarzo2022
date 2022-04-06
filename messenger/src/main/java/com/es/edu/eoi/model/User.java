package com.es.edu.eoi.model;

import java.util.List;

public class User extends Person {
		
	private String password;
	
	private String telephone;

	private List<Message> sended;
	
	private List<Message> received;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Message> getSended() {
		return sended;
	}

	public void setSended(List<Message> sended) {
		this.sended = sended;
	}

	public List<Message> getReceived() {
		return received;
	}

	public void setReceived(List<Message> received) {
		this.received = received;
	}

	public User(String password, String telephone, List<Message> sended, List<Message> received) {
		super();
		this.password = password;
		this.telephone = telephone;
		this.sended = sended;
		this.received = received;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return super.getSurname();
	}

	@Override
	public void setSurname(String surname) {
		// TODO Auto-generated method stub
		super.setSurname(surname);
	}



}
