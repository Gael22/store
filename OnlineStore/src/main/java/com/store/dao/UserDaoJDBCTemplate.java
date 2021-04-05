package com.store.dao;

import java.util.List;

import com.store.exception.UserNameTaken;
import com.store.exception.UserNotFound;
import com.store.pojo.User;

public class UserDaoJDBCTemplate implements UserDao {

	public void createUser(User user) throws UserNameTaken {
		// TODO Auto-generated method stub

	}

	public User getUserByUsername(String username) throws UserNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(User user, String new_password) {
		// TODO Auto-generated method stub

	}

	public boolean removeUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
