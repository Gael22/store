package com.store.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.store.dao.mapper.ItemRowMapper;
import com.store.pojo.Item;

@Repository
public class ItemDaoJDBCTemplate implements ItemDao {
	
	private JdbcTemplate jdbcTemplate;
	
	private ItemRowMapper itemRowMapper;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Autowired
	public void setItemRowMapper(ItemRowMapper itemRowMapper) {
		this.itemRowMapper = itemRowMapper;
	}

	public Item getByName(String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateItem(Item item) {
		// TODO Auto-generated method stub

	}

	public void removeItem(Item item) {
		// TODO Auto-generated method stub

	}

	public void addItem(Item item) {
		// TODO Auto-generated method stub

	}

}
