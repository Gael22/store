package com.store.pojo;

import java.util.List;

public class Cart {

    private int cartId;	
	
	private List<Item> items; 
	
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public List<Integer> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<Integer> quantity) {
		this.quantity = quantity;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	private float total;
	
	private List<Integer> quantity;
	
	private int userId;

	public Cart(int cartId, List<Item> items, float total, List<Integer> quantity, int userId) {
		super();
		this.cartId = cartId;
		this.items = items;
		this.total = total;
		this.quantity = quantity;
		this.userId = userId;
	}
	

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", items=" + items + ", total=" + total + ", quantity=" + quantity
				+ ", userId=" + userId + "]";
	}
	
	
}
