package com.store.service;

import com.store.exception.InvalidPassword;
import com.store.exception.UserNameTaken;
import com.store.exception.UserNotFound;
import com.store.pojo.User;

public class UserServiceImpl implements UserService{

	public boolean existingUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public User authenticateUser(User user) throws InvalidPassword, UserNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	public User registerUser(User user) throws UserNameTaken {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateUser(User user, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getCurrentUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
