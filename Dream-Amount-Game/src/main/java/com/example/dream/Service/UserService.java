package com.example.dream.Service;

import java.util.List;

import com.example.dream.Entity.User;

public interface UserService {
	User loginuser(String emailAddress, String password);
	 User addUser( User user);
	 User updateDb(String emailAddress ,User user);
	void deleteDb(String emailAddress);
	List<User> getAllUser();

}
