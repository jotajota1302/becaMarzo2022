package edu.es.eoi.shop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

	@Id	
	@Column(length = 50)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Column
	private boolean enabled;
	
	@OneToOne(targetEntity = Customer.class)
	private Customer customer;
	
}
