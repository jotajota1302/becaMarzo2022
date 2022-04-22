package edu.es.eoi.shop.entities;

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
public class SalesOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(targetEntity = Customer.class)
	private Customer customer;
	
	@ManyToOne(targetEntity = Cart.class)
	private Cart cart;	
	
	@ManyToOne(targetEntity = BillingAddress.class)
	private BillingAddress billingAddress;
	
	@ManyToOne(targetEntity = ShippingAddress.class)
	private ShippingAddress shippingAddress;
	
	
	
}
