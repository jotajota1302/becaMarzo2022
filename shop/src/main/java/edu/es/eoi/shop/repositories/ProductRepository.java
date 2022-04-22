package edu.es.eoi.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.shop.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{


	
}
