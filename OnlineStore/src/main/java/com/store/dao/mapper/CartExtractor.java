package com.store.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.store.pojo.Cart;

@Component
public class CartExtractor implements ResultSetExtractor<Cart> {

	@Override
	public Cart extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		Cart newCart = new Cart();
		
		newCart.setCartId(rs.getInt("Cart_id"));
		newCart.setUserId(rs.getInt("User_Id"));
		newCart.setTotal(rs.getFloat("total"));
		
		return newCart;
	}

}
