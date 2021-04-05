package com.store.service;

import java.util.List;

import com.store.pojo.Item;

public interface ItemService {

    public List<Item> getAllItems();
	
	public Item getItemByItemName(String itemName);
}
