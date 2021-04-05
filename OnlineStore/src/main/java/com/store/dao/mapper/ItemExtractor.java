package com.store.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.store.pojo.Item;

@Component
public class ItemExtractor implements ResultSetExtractor<Item>{

	@Override
	public Item extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		
		Item newItem = new Item();
		
		newItem.setCost(rs.getFloat("item_cost"));
		newItem.setItemName(rs.getString("item_name"));
		newItem.setQuantity(rs.getInt("remaining_items"));
		newItem.setDiscount(rs.getFloat("discount"));
		newItem.setItemId(rs.getInt("item_id"));
		
		return newItem;
	}

}
