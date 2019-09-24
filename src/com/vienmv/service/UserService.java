package com.vienmv.service;

import java.util.List;

import com.vienmv.model.AppUser;

public interface UserService {
	void insert(AppUser user);

	void edit(AppUser user);

	void delete(int id);

	AppUser get(String username);
	
	AppUser get(int id);
	
	AppUser login(String username, String password);
	
	boolean register(String email, String password, String username);

	List<AppUser> getAll();

	List<AppUser> search(String keyword);
	
	boolean checkExistEmail(String email);
	
	boolean checkExistUsername(String username);
	
}
