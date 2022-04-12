package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.es.eoi.entity.User;

public class UserRepository {

	public EntityManager entityManager = Persistence.createEntityManagerFactory("BECA_PU").createEntityManager();

	//Create
	public void createUser(User user) {

		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
	}
	// Read
	public User readUser(int id) {

		return entityManager.find(User.class, id);
	}
	//Update
	public void updateUser(User user) {

		entityManager.getTransaction().begin();
		entityManager.merge(user);
		entityManager.getTransaction().commit();
	}
	//Delete
	public void deleteUser(User user) {

		entityManager.getTransaction().begin();
		entityManager.remove(user);
		entityManager.getTransaction().commit();
	}
}
