package edu.es.eoi.springdatademo;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "entidaduno")
@Getter
@Setter
public class Entidad1 {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int campo1;
		
	private String campo2;
		
	private String campo3;
	
	private String campo4;
	
	private Timestamp fecha;
	
	@ManyToMany(targetEntity = Entidad2.class)
	List<Entidad2> entidades2;

}
