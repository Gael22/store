package com.store.service;

import java.util.List;

import com.store.exception.OutOfStockException;
import com.store.pojo.Cart;
import com.store.pojo.Item;

public class ShoppingCartServiceImpl implements ShoppingCartService {

	public Cart addItem(Item item, int quantity, Cart cart) throws OutOfStockException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeItem(int productId, Cart cart) {
		// TODO Auto-generated method stub
		
	}

	public float getTotal(Cart cart) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Cart createCart(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cart> getAllCarts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Cart getCartById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCartById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateCart(Cart cart) {
		// TODO Auto-generated method stub
		
	}

}
