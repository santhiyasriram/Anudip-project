package com.example.dream.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.dream.Entity.User;
import com.example.dream.Service.UserService;

import jakarta.validation.Valid;

@RestController
@Validated
@CrossOrigin(origins = "http://localhost:4200")
public class UserController{

	@Autowired
	UserService userService;
	
	@GetMapping("/loginuser")
	public User loginuser(@RequestHeader String emailAddress ,@RequestHeader String password) {
		return userService.loginuser(emailAddress,password); 
	}

	
	@GetMapping("/guest")  
	private List<User> getAllUser()   
	{  
	return userService.getAllUser();  
	} 
	
	@PostMapping("/postuser")
	public User addUser(@Valid @RequestBody User user) {
		
		return userService.addUser(user);
	}
	  
	  
	
	@PutMapping("/updateuser")
	public User update(@RequestHeader String emailAddress ,@RequestBody User user) {
		
		return userService.updateDb(emailAddress,user); 
	}
	@DeleteMapping("/deleteuser")
	public String delete(@RequestHeader String emailAddress) {
		userService.deleteDb(emailAddress);
		return "data deleted";
	}
	
}

