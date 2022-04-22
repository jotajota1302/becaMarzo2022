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
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "customerphone")
	private String customerPhone;
	
	@OneToOne(targetEntity = User.class)
	private User user;
	
	@OneToOne(targetEntity = BillingAddress.class)
	private BillingAddress billingAddress;
	
	@OneToOne(targetEntity = ShippingAddress.class)
	private ShippingAddress shippingAddress;
	
	@OneToOne(targetEntity = Cart.class)
	private Cart cart;
	
	@OneToMany(targetEntity = SalesOrder.class)
	private List<SalesOrder> orders;
	
}
