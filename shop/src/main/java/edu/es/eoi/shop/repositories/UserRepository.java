package edu.es.eoi.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.shop.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
