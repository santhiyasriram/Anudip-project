package com.example.Hotel_Booking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hotel_Booking.Service.GuestService;
import com.example.Hotel_Booking.beans.Guest;


@RestController
public class MyController {

	@Autowired
	GuestService guestService;
	
	@GetMapping("/login")
	public Guest login(@RequestHeader String email ,
			@RequestHeader String password) {
		
		return guestService.login(email, password); 
	}
	
	@PostMapping("/post")
	public Guest addGuest(@RequestBody Guest guest) {
		
		return guestService.readGuest(guest);
	}
	
	@PutMapping("/update")
	public Guest update(@RequestHeader String email , @RequestBody Guest guest ) {
		
		return guestService.updatedb(email,guest);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String email) {
		guestService.Delete(email);
		return "data deleted";
	}
	
	
}
