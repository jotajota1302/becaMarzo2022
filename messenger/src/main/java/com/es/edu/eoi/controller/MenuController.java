package com.es.edu.eoi.controller;

import java.util.ArrayList;
import java.util.Calendar;

import com.es.edu.eoi.Main;
import com.es.edu.eoi.model.Message;
import com.es.edu.eoi.model.User;
import com.es.edu.eoi.service.MessageService;
import com.es.edu.eoi.service.MessageServiceMailImpl;
import com.es.edu.eoi.view.MenuView;

public class MenuController {

	MessageService service= new MessageServiceMailImpl();
	
	public void sendMessage(String text, String number) {
		
		User to= new User("AA", String.valueOf(number), new ArrayList<Message>(),new ArrayList<Message>());
		to.setName("Perico");
		Message message= new Message(text,Main.user, to, Calendar.getInstance().getTime());
		
		service.sendMessage(message);		
		
		System.out.println("*****************************");
		
		System.out.println("numero de mensajes enviados totales: "+Main.sendedMessages.size());
		
		MenuView.welcome();
		
	}

}
