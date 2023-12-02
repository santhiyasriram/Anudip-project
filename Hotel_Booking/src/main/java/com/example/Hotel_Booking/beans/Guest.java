package com.example.Hotel_Booking.beans;

public class Guest {
int id;
String FirstName;
String LasttName;
String EmailId;
String Address;
public Guest(int id, String firstName, String lasttName, String emailId, String address) {
	super();
	this.id = id;
	FirstName = firstName;
	LasttName = lasttName;
	EmailId = emailId;
	Address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLasttName() {
	return LasttName;
}
public void setLasttName(String lasttName) {
	LasttName = lasttName;
}
public String getEmailId() {
	return EmailId;
}
public void setEmailId(String emailId) {
	EmailId = emailId;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}


}
