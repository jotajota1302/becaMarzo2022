package edu.es.eoi.springdatademo;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "entidaddos")
@Table
@Getter
@Setter
public class Entidad2 {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int campo1;
		
	private String campo2;
		
	private String campo3;
	
	private String campo4;
	
	private Timestamp fecha;

	@ManyToMany(targetEntity = Entidad1.class)
	List<Entidad1> entidades1;
}
