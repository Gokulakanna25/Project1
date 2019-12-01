package org.project1.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.project1.dao.UserDao;
import org.project1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	SessionFactory sessionFactory;

	protected Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(User user) {
		currentSession().save(user);		
	}

	@Override
	public void update(User user) {
		currentSession().update(user);
	}

	@Override
	public void delete(User user) {
		currentSession().delete(user);
	}
	@Override
	public User edit(String mobile) {
		return find(mobile);
	}

	@Override
	public User find(String mobile) {
		return (User)currentSession().get(User.class, mobile);
	}

	@Override
	public List<User> getAll() {
		return currentSession().createCriteria(User.class).list();
	}

}
