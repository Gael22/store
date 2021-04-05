package com.store.service;

import com.store.exception.InvalidPassword;
import com.store.exception.UserNameTaken;
import com.store.exception.UserNotFound;
import com.store.pojo.User;

public interface UserService {

	public boolean existingUser(User user);
	
	public User authenticateUser(User user) throws InvalidPassword, UserNotFound;
	
	public User registerUser(User user) throws UserNameTaken;
	
	public User updateUser(User user, String password);

	public boolean removeUser(User user);
	
	public User getCurrentUser();
}
