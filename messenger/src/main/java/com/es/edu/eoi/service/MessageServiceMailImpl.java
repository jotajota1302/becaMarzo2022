package com.es.edu.eoi.service;

import com.es.edu.eoi.Main;
import com.es.edu.eoi.model.Message;

public class MessageServiceMailImpl implements MessageService {

	@Override
	public void sendMessage(Message message) {
				
		System.out.println("mando el mensaje a: " + message.getTo().getName());
		Main.sendedMessages.add(message);		
	}

	@Override
	public void markAsSended(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void markAsReaded(Message message) {
		// TODO Auto-generated method stub
		
	}

}
