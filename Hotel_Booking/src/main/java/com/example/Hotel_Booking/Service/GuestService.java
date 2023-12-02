package com.example.Hotel_Booking.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Hotel_Booking.beans.Guest;

@Service
public class GuestService {

	List<Guest>guestList = new ArrayList<Guest>();
	
	public String createGuest(Guest guest) {
		guestList.add(guest);
		return "Guest created successfully";
	}
	public Guest readGuest(int id) {
		Guest g=null;
		for(int i=0; guestList.iterator().hasNext();i++){
			 g=guestList.get(i);
			if(id==g.getId())
				return g;
		}
		
		return g;
}}