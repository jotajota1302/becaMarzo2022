package com.es.edu.eoi.controller;

import com.es.edu.eoi.service.MessageService;
import com.es.edu.eoi.service.MessageServiceMailImpl;
import com.es.edu.eoi.view.MenuView;

public class MenuController {

//	MessageService service= new MessageServiceSMSImpl();	
	MessageService service= new MessageServiceMailImpl();	
	
	public void sendMessage(String text, String number) {
		
		//logica de enviar mensaje a traves del servicio
	
		service.sendMessage();		
		
		System.out.println("*****************************");
		
		MenuView.welcome();
		
	}

}
