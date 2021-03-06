package com.store.dao;

import java.sql.SQLException;
import java.util.List;

import com.store.pojo.Cart;
import com.store.pojo.Item;

public interface CartDao {

    public Cart createCart(Cart cart) throws SQLException;
	
	public Cart getCartById(int id);
	
	public void deleteCart(int id);
	
	public void updateCart(Cart cart);
	
	public Cart addItemToCart(Cart cart, Item item, int quantity);
	
	public Cart removeItemFromCart(Cart cart, Item item);
	
	public List<Cart> getAllCart();
}
