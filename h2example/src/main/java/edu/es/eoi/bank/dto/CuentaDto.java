package edu.es.eoi.bank.dto;

import lombok.Data;

@Data
public class CuentaDto {

	private int id;

	private double saldo;
	
	private ClienteDto cliente;

	private BancoDto banco;


}
