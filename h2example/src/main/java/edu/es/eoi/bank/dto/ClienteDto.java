package edu.es.eoi.bank.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ClienteDto {
	
	private String dni;

	private String nombre;	

	private String apellidos;	

	private String mail;	
	
	private Date fechaAlta;	
	
	private String telefono;
	
	private String direccion;


}
