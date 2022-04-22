package edu.es.eoi.shop.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String category;
	
	@Column
	private String description;
	
	@Column
	private String manufacturer;
	
	@Column
	private String name;
	
	@Column
	private double price;
	
	@Column
	private int unitStock;
	
	@OneToMany(targetEntity = CartItem.class)
	private List<CartItem> cartItems;
}
