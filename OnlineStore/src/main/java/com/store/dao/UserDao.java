package com.store.dao;

import java.util.List;

import com.store.exception.UserNameTaken;
import com.store.exception.UserNotFound;
import com.store.pojo.User;

public interface UserDao {

    public void createUser(User user) throws UserNameTaken;
	
	public User getUserByUsername(String username) throws UserNotFound;
	
	public List<User> getAllUsers();
	
	public void updateUser(User user, String new_password);
	
	public boolean removeUser(User user);
}
