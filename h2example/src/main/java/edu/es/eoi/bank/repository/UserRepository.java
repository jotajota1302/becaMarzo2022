package edu.es.eoi.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.bank.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
