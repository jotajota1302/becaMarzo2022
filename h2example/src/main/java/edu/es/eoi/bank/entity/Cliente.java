package edu.es.eoi.bank.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {

	@Id
	@Column(length = 9)
	private String dni;

	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String mail;
		
	@Column
	private String telefono;

	@Column
	private String direccion;

	@OneToMany(targetEntity = Cuenta.class)
	private List<Cuenta> cuentas;

	
	

}
