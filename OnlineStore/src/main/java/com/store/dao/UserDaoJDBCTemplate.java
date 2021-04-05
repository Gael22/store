package com.store.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.store.dao.mapper.UserRowMapper;
import com.store.exception.UserNameTaken;
import com.store.exception.UserNotFound;
import com.store.pojo.User;

@Repository
public class UserDaoJDBCTemplate implements UserDao {
	
	private JdbcTemplate jdbcTemplate;
	
	private UserRowMapper userRowMapper;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Autowired
	public void setUserRowMapper(UserRowMapper userRowMapper) {
		this.userRowMapper = userRowMapper;
	}

	public void createUser(User user) throws UserNameTaken {
		String sql = "insert into user_acc(username,password) values (?,?)";
		jdbcTemplate.update(sql, user.getUsername(), user.getPassword());

	}

	public User getUserByUsername(String username) throws UserNotFound {
		String sql = "select * from user_acc where username = ?";
		List<User> userList = jdbcTemplate.query(sql, userRowMapper, username);
		
		if (userList.size() == 0) {
			throw new UserNotFound();
		}
		return userList.get(0);
	}

	public List<User> getAllUsers() {
		String sql = "select * from user_acc";
		
		List<User> userList = jdbcTemplate.query(sql, userRowMapper);
		return userList;
	}

	public void updateUser(User user, String new_password) {
		String sql = "update user_acc set password = ? where username = ?";
		jdbcTemplate.update(sql, new_password, user.getUsername());
		System.out.println("user Updated");

	}

	public boolean removeUser(User user) {
		String sql = "delete from user_acc where username = ? and password = ?";
		
		if(jdbcTemplate.update(sql, user.getUsername(), user.getPassword())==0) {
			return false;
		}
		return true;
	}

}
