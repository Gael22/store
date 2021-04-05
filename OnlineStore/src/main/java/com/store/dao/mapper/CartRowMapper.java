package com.store.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.store.pojo.Cart;

@Component
public class CartRowMapper implements RowMapper<Cart> {
	
	private CartExtractor cartExtractor;
	
	@Autowired
	public void setCartExtractor(CartExtractor cartExtractor) {
		this.cartExtractor = cartExtractor;
	}


	@Override
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return cartExtractor.extractData(rs);
	}

}
