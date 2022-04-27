package edu.es.eoi.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private double saldo;

	@ManyToOne(targetEntity = Cliente.class)	
	private Cliente cliente;

	@ManyToOne(targetEntity = Banco.class)
	private Banco banco;

	
}
