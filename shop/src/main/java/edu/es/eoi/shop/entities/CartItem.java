package edu.es.eoi.shop.entities;

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
public class CartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private int quantity;
	
	@Column
	private double price;
	
	@ManyToOne(targetEntity = Product.class)
	private Product product;
	
	@ManyToOne(targetEntity = Cart.class)
	private Cart cart;

}
