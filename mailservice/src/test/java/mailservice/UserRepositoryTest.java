package mailservice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.User;
import edu.es.eoi.repository.UserRepository;

class UserRepositoryTest {
	
	private UserRepository repository = new UserRepository();
	
	@Test
	void testExists() throws SQLException {

		assertEquals(true,repository.exists("jj@hotmail.com"));
		assertEquals(false,repository.exists("zz@hotmail.com"));
	}
	
	@Test
	void testGetUser() throws SQLException {	

		User user=repository.getUser("jj@hotmail.com","JJ");
		
		assertNotNull(user);
		assertEquals("Jimenez", user.getSurname());
		

	}
	

}
