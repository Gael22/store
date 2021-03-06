package com.store.dao;

import java.util.List;

import com.store.pojo.Item;

public interface ItemDao {


	public Item getByName(String itemName);
	
	public List<Item> getAllItems();
	
	public void updateItem(Item item);
	
	public void removeItem(Item item);
	
	public void addItem(Item item);

}
