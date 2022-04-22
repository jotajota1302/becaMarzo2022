package edu.es.eoi.shop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.es.eoi.shop.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	public List<User> findByEnabled(boolean enabled);
	
	public List<User> findByPassword(String password);
	
	public List<User> findByOrderByEmailAsc();	
	
	public List<User> findByOrderByEmailDesc();
}
