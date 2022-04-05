package com.es.edu.eoi.view;

import java.util.Scanner;

import com.es.edu.eoi.controller.MenuController;

public class MenuView {

	//un controlador es invocado desde una vista, procesa la logica a traves de un servicion y devuelve otra vista	
	
	public static void welcome() {				
	
		System.out.println("Send a message:");
		
		Scanner scan=new Scanner(System.in);		
		String text=scan.next();
		
		System.out.println("Send to:");
		String number=scan.next();

		MenuController controller= new MenuController();		
		controller.sendMessage(text,number);
		
		scan.close();
	}

}
