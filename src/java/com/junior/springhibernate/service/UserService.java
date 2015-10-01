package com.junior.springhibernate.service;

import java.util.List;
import com.junior.springhibernate.model.User;

public interface UserService {

	void saveUser(User user);

	List<User> findAllUser();

	void deleteUserById(Integer id);

	User findById(Integer id);

	void updateUser(User user);
}
