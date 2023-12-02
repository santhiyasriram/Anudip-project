package com.example.hotelbooking.Entities;


@Entity
public class Guest {



	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int id;
	String FirstNmame;
	String LastName;
	String Address;
	String EmailId;
	String Password;
		
	public Guest () {}

	public Guest(int id, String FirstName,String Address,String EmailId,String Password, Room room) {
		super();
		this.id = id;
		this.FirstNmame = FirstName;
	
		String Address1;
		String EmailId1;
		String Password1;
	}

	@Override
	public String toString() {
		return "Guests [id=" + id + ", FirstNmame=" + FirstNmame + ", LastName=" + LastName + ", Address=" + Address
				+ ", EmailId=" + EmailId + ", Password=" + Password  + ", getId()=" + getId()
				+ ", getFirstNmame()=" + getFirstNmame() + ", getLastName()=" + getLastName() + ", getAddress()="
				+ getAddress() + ", getEmailId()=" + getEmailId() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstNmame() {
		return FirstNmame;
	}

	public void setFirstNmame(String firstNmame) {
		FirstNmame = firstNmame;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	}
}