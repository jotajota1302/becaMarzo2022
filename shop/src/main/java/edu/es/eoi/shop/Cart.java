package edu.es.eoi.shop;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private double totalPrice;

	@OneToOne(targetEntity = Customer.class)
	private Customer customer;
	
	@OneToMany(targetEntity = CartItem.class)	
	private List<CartItem> cartItems;
	
	@OneToMany(targetEntity = Cart.class)
	private List<SalesOrder> orders;
}
