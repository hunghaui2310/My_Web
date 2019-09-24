package com.vienmv.dao;

import java.util.List;

import com.vienmv.model.AppUser;

public interface UserDao {
	void insert(AppUser user);

	void edit(AppUser user);

	void delete(int id);

	AppUser get(String username);
	
	AppUser get(int id);

	List<AppUser> getAll();

	List<AppUser> search(String username);
	
	boolean checkExistEmail(String email);
	
	boolean checkExistUsername(String username);
}
