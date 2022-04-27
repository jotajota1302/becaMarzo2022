package edu.es.eoi.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.bank.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
}
