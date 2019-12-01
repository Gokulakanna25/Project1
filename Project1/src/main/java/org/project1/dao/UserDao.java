package org.project1.dao;

import java.util.List;

import org.project1.model.User;

public interface UserDao {

	public void create (User user);
	public void update (User user);
	public void delete (User user);
	public User edit (String mobile);
	public User find (String mobile);
	public List<User> getAll();
}
