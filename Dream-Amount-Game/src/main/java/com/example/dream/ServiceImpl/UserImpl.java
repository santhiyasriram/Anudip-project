package com.example.dream.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dream.Entity.User;
import com.example.dream.Exceptioin.ResourceNotFoundException;
import com.example.dream.Repository.UserRepo;
import com.example.dream.Service.UserService;




@Service

public class UserImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	public User loginuser(String emailAddress, String password) {
		User s = userRepo.findByEmailAddress(emailAddress);

		 
		 if(s!=null) {
			 if(s.getPassword().equals(password)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}

	public User addUser( User user) {
		return userRepo.save( user);
	}

	public User updateDb(String emailAddress,User user) {
		
		
		User s1 = userRepo.findByEmailAddress(emailAddress);
		
		if(s1!=null) {
			  
			s1.setFullName(user.getFullName());
			s1.setMobileNumber(user.getMobileNumber());
			s1.setId(user.getId());
			s1.setPassword(user.getPassword());
		return 	userRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void deleteDb(String emailAddress) {
	
		
		User s2 = userRepo.findByEmailAddress(emailAddress);
		
		if(s2!=null) {
			userRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	public List<User> getAllUser()   
	{  
	List<User> user = new ArrayList<User>();  
	userRepo.findAll().forEach(user1 -> user.add(user1));  
	return user;  

}

	}