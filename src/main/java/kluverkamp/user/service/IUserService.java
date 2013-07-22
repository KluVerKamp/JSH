package kluverkamp.user.service;

import java.util.List;

import kluverkamp.model.User;
import kluverkamp.user.dao.IUserDAO;

public interface IUserService {
	public void addUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	public User getUserById(int id);
	public List<User> getUsers();
	public IUserDAO getUserDAO();
	public void setUserDAO(IUserDAO userDAO);
}