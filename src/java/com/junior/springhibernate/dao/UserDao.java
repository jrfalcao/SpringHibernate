package com.junior.springhibernate.dao;

import java.util.List;
import com.junior.springhibernate.model.User;

public interface UserDao {

	void saveUser(User user);
	
	List<User> findAllUser();
	
	void deleteUserById(Integer id);
	
	User findById(Integer id);
	
	void updateUser(User user);
}
