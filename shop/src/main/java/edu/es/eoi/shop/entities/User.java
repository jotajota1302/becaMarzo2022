package edu.es.eoi.shop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(exclude = "customer")
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
