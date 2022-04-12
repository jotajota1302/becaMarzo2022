package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.es.eoi.entity.User;

public class UserRepository {
	
	//CRUD (Create Read Update y Delete)
	
	public EntityManager entityManager=Persistence.createEntityManagerFactory("BECA_PU").createEntityManager();
	
	public User readUser(int id) {
		
		return entityManager.find(User.class,id);
		
	}
	
	public void createUser(User user) {
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(user);
		
		entityManager.getTransaction().commit();
	}
	
	//update user
	

	public void updateUser(User user) {
		
		entityManager.getTransaction().begin();
		
		entityManager.merge(user);
		
		entityManager.getTransaction().commit();
	}
	
	
	//delete user
	public void deleteUser(User user) {
		
		entityManager.getTransaction().begin();
		
		entityManager.remove(user);
		
		entityManager.getTransaction().commit();
	}
	
	public void deleteUserById(int id) {
		
		User user=readUser(id);
		
		entityManager.getTransaction().begin();
		
		entityManager.remove(user);
		
		entityManager.getTransaction().commit();
	}
	

}
