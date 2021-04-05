package com.store.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.store.pojo.User;

@Component
public class UserExtractor implements ResultSetExtractor <User> {

	@Override
	public User extractData(ResultSet rs) throws SQLException, DataAccessException {
		User newUser = new User();
		
		newUser.setUserId(rs.getInt("user_id"));
		newUser.setUsername(rs.getString("ussername"));
		newUser.setPassword(rs.getString("password"));
		return newUser;
	}

}
