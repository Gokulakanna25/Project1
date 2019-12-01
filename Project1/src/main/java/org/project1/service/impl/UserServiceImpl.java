package org.project1.service.impl;

import java.util.List;

import org.project1.dao.UserDao;
import org.project1.service.UserService;
import org.project1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor=Exception.class)
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public void create(User user) {
		userDao.create(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public User edit(String mobile) {
		return userDao.edit(mobile);
	}

	@Override
	public User find(String mobile) {
		return userDao.find(mobile);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

}
