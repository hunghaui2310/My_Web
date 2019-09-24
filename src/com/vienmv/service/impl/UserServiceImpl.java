package com.vienmv.service.impl;

import java.io.File;
import java.util.List;

import com.vienmv.dao.UserDao;
import com.vienmv.dao.impl.UserDaoImpl;
import com.vienmv.model.AppUser;
import com.vienmv.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();

	@Override
	public void insert(AppUser user) {
		userDao.insert(user);
	}

	@Override
	public void edit(AppUser newUser) {
		AppUser oldUser = userDao.get(newUser.getId());

		oldUser.setEmail(newUser.getEmail());
		oldUser.setUsername(newUser.getUsername());
		oldUser.setPassword(newUser.getPassword());
		oldUser.setRoleId(newUser.getRoleId());
		if (newUser.getAvatar() != null) {
			// XOA ANH CU DI
			String fileName = oldUser.getAvatar();
			final String dir = "C:\\Users\\mai vien\\eclipse-workspace\\UNIFY\\upload";
			File file = new File(dir + "/" + fileName);
			if (file.exists()) {
				file.delete();
			}
			// THEM ANH MOI
			oldUser.setAvatar(newUser.getAvatar());
		}

		userDao.edit(oldUser);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public AppUser get(String username) {
		return userDao.get(username);
	}

	@Override
	public AppUser get(int id) {
		return userDao.get(id);
	}

	@Override
	public List<AppUser> getAll() {
		return userDao.getAll();
	}

	@Override
	public List<AppUser> search(String username) {
		return userDao.search(username);
	}

	@Override
	public AppUser login(String username, String password) {
		AppUser user = this.get(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		}

		return null;
	}

	@Override
	public boolean register(String username, String password, String email) {
		if (userDao.checkExistUsername(username)) {
			return false;
		}
		userDao.insert(new AppUser(email, username, password));
		return true;
	}
	

	public boolean checkExistEmail(String email) {
		return userDao.checkExistEmail(email);
	}

	public boolean checkExistUsername(String username) {
		return userDao.checkExistUsername(username);
	}
}
