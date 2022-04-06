package com.es.edu.eoi;

import java.util.ArrayList;

import com.es.edu.eoi.model.Message;
import com.es.edu.eoi.model.User;
import com.es.edu.eoi.view.MenuView;

public class Main {

	public static final User user= new User("JJ","1111111",new ArrayList<Message>(),new ArrayList<Message>());
		
	public static void main(String[] args) {
			
		MenuView.welcome();
		
				
	}
	
}
