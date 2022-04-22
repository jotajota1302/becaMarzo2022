package edu.es.eoi.springdatademo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entidad1Repository extends JpaRepository<Entidad1, Integer> {

}
