package mailservice;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Test {
		
	public static void main(String[] args) {
				
		UserService userService= new UserService();
		MailService mailService= new MailService();
		
		try {
			System.out.println(userService.getUser("jj@hotmail.com", "JJ"));
			System.out.println(userService.getUser("jj@hotmail.com", "passwordincorrecto"));
			System.out.println(userService.exists("jj@hotmail.com"));
			System.out.println(userService.exists("jj@hotmal.com"));
			
			User user= new User();
			user.setEmail("test@mail");				
			user.setLastAccess(Timestamp.valueOf(LocalDateTime.now()));
			user.setName("testName");
			user.setSurname("testSurname");
			user.setPassword("testPassword");
			
//			service.create(user);			
			
//			service.updateLastAcess("jj@hotmail.com");
			
			Mail mail= new Mail();
			mail.setSubject("test mail");
			mail.setText("BBBBBBBBBBBBB");
			mail.setReceiver(userService.getUser("jj@hotmail.com", "JJ"));
			mail.setSender(userService.getUser("aa@hotmail.com", "AA"));
			mail.setTime(Timestamp.valueOf(LocalDateTime.now()));
			
//			mailService.sendMail(mail);
			
			System.out.println(mailService.getInbox(1));
			
			System.out.println(mailService.getOutbox(4));
			
			System.out.println(mailService.openMail(2));
			
		} catch (SQLException e) {		
			e.printStackTrace();
		}
	
		
		
		
	}

}
