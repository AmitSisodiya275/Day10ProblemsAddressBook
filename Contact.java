package com.bridgelab.addressbook;

public class Contact {

	private String firstName, lastName, city, state, email;
	private int zip;
	private long phoneNumber;

	public Contact(String firstName, String lastName, String city, String state, int zip, String email,
			long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return "First Name : "+firstName+", Last Name : "+lastName+", City : "+city+", State : "+state+", Zip code : "+zip+", Email-ID : "+email+", Phone Number : "+phoneNumber;
	}

}
