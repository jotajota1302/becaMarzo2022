package edu.es.eoi.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.shop.entities.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
