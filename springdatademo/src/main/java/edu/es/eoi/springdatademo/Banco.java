package edu.es.eoi.springdatademo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "BANCOS")
@Getter
@Setter
public class Banco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "ciudad")
	private String ciudad;
		
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "banco")
	private List<Cuenta> cuentas;	

}
