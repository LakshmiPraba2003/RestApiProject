
package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Shopping Cart")
public class ShoppingCart {
	@Id
	
     public int cartId;
     public float cartPrice;
     @OneToMany(cascade = CascadeType.ALL)
 	@JoinColumn(name="fkid",referencedColumnName = "cartId")
     private List<Orders> order;
	public ShoppingCart(int cartId, float cartPrice) {
		super();
		this.cartId = cartId;
		this.cartPrice = cartPrice;
	}
	public ShoppingCart() {
		super();
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public float getCartPrice() {
		return cartPrice;
	}
	public void setCartPrice(float cartPrice) {
		this.cartPrice = cartPrice;
	}
	public List<Orders> getOrder() {
		return order;
	}
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	
     
}
