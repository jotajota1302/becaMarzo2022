package com.es.edu.eoi.service;

import com.es.edu.eoi.model.Message;

public interface MessageService {
	
	//reflejamos la funcionalidad
	
	public void sendMessage(Message message);  //Funcionalidad 1
	public void markAsSended(Message message); //Funcionalidad 2
	public void readMessage(Message message);  //Funcionalidad 3
	public void markAsReaded(Message message); //Funcionalidad 4
	
	

}
