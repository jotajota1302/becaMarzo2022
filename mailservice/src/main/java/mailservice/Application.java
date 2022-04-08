package mailservice;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Application {

	public static MailService mailService = new MailService();
	public static UserService userService = new UserService();
	public static User usuario;

	public static void main(String[] args) throws SQLException {
		
		System.out.println("Elige opcion:");
		System.out.println("1-LOGIN");
		System.out.println("2-NUEVO USUARIO");
		System.out.println("3-SALIR");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();

		if (opcion >= 4 | opcion == 0) {
			System.out.println("Opcion Incorrecta");
			main(args);
		}

		switch (opcion) {
		case 1:

			System.out.println("Introduce user:");
			scan = new Scanner(System.in);
			String user = scan.next();
			System.out.println("Introduce pw:");
			scan = new Scanner(System.in);
			String password = scan.next();

			try {
				usuario = userService.getUser(user, password);

				if (usuario != null) {
					userService.updateLastAcess(usuario.getEmail());
				}else{
					main(args);
				}

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("error en el login");
				main(args);
			}

			// ahora veremos a donde vamos MENU 2
			System.out.println("BIENVENIDO A SUPERMAIL " + usuario.getName());
			
			int toRead=mailService.getInbox(usuario.getId()).size();
						
			goToMenu2(args, toRead);

			break;
		case 2:

			System.out.println("Introduce user:");
			scan = new Scanner(System.in);
			user = scan.next();
			System.out.println("Introduce pw:");
			scan = new Scanner(System.in);
			password = scan.next();
			System.out.println("Introduce email:");
			scan = new Scanner(System.in);
			String email = scan.next();
			System.out.println("Introduce apellido:");
			scan = new Scanner(System.in);
			String apellido = scan.next();

			User newUser = new User();
			newUser.setEmail(email);
			newUser.setName(user);
			newUser.setPassword(password);
			newUser.setSurname(apellido);

			try {

				if (!userService.exists(newUser.getEmail())) {
					userService.create(newUser);
				} else {
					System.out.println("este mail ya se esta utilizando");
					main(args);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			break;
		case 3:
			System.out.println("Goodbye");
			break;

		default:
			System.out.println("Datos de usuario incorrectos");
			main(args);
		}

	}

	@SuppressWarnings("resource")
	private static void goToMenu2(String[] args, int toRead) throws SQLException {
		
		Scanner scan;
		int opcion;
		System.out.println("Elige opcion:");
		System.out.println("1-ENVIAR MAIL");
		System.out.println("2-BANDEJA DE ENTRADA (¡"+toRead+" Mensajes!)");
		System.out.println("3-BANDEJA DE SALIDA");
		System.out.println("4-CERRAR SESION");

		scan = new Scanner(System.in);
		opcion = scan.nextInt();

		switch (opcion) {
		case 1:
			
			System.out.println("Introduce el mail destino:");
			scan = new Scanner(System.in);
			String email = scan.next();
			System.out.println("Introduce asunto:");
			scan = new Scanner(System.in);
			String subject = scan.next();
			System.out.println("Introduce texto:");
			scan = new Scanner(System.in);
			String text= scan.next();
		
			Mail mail= new Mail();
			mail.setReceiver(userService.getUserByEmail(email));
			mail.setSender(usuario);
			mail.setText(text);
			mail.setSubject(subject);
			mail.setTime(Timestamp.valueOf(LocalDateTime.now()));
			
			mailService.sendMail(mail);
			goToMenu2(args, toRead);
			
			break;
		case 2:
			System.out.println(mailService.getInbox(usuario.getId()));	
			goToMenu2(args, toRead);
			break;
		case 3:
			System.out.println(mailService.getOutbox(usuario.getId()));
			goToMenu2(args, toRead);
			break;
		case 4:
			usuario=null;
			main(args);
			break;

		default:
			break;
		}
	}

}
