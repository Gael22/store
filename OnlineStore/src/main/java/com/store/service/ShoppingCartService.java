package com.store.service;

import java.util.List;

import com.store.exception.OutOfStockException;
import com.store.pojo.Cart;
import com.store.pojo.Item;

public interface ShoppingCartService {

    public Cart addItem(Item item, int quantity, Cart cart) throws OutOfStockException;
	
	public void removeItem(int productId, Cart cart);
	
	public float getTotal(Cart cart);
	
	public Cart createCart(Cart cart);
	
	public List<Cart> getAllCarts();
	
	public Cart getCartById(int id);
	
	public void deleteCartById(int id);
	
	public void updateCart(Cart cart);

}
