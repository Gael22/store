package com.store.dao;

import java.sql.SQLException;
import java.util.List;

import com.store.pojo.Cart;
import com.store.pojo.Item;

public class CartDaoJDBCTemplate implements CartDao{

	public Cart createCart(Cart cart) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Cart getCartById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCart(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateCart(Cart cart) {
		// TODO Auto-generated method stub
		
	}

	public Cart addItemToCart(Cart cart, Item item, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cart removeItemFromCart(Cart cart, Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		return null;
	}

}
