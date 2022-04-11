package mailservice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import edu.es.eoi.repository.UserRepository;

class UserRepositoryTest {
	
	@Test
	public void checkSomething() {
		
		assertEquals(2,3);
		assertNotEquals(2,3);
	}
	
	@Test
	void testExists() throws SQLException {

		UserRepository repository = new UserRepository();

		assertEquals(true,repository.exists("jj@hotmail.com"));
		assertEquals(false,repository.exists("zz@hotmail.com"));

	}
	

}
