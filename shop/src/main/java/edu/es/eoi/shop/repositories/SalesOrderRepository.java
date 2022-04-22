package edu.es.eoi.shop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.shop.entities.SalesOrder;

@Repository
public interface SalesOrderRepository extends JpaRepository<SalesOrder, Integer>{

	public List<SalesOrder> findByOrderByCartTotalPriceDesc();
	
	
}
