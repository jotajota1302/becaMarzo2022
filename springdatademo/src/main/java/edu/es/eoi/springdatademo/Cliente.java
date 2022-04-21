package edu.es.eoi.springdatademo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CLIENTES")
@Getter
@Setter
public class Cliente {
	
	@Id
	@Column(name = "DNI")
	private String dni;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "direccion")
	private String direccion;
		
	@Column(name="alta")
	private Date fechaAlta;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Cuenta> cuentas;

	

}
