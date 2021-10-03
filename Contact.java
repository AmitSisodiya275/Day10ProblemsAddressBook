package com.bridgelab.addressbook;

public class Contact {
	private String firstName, lastName, city, state, email;
	private int zip;
	private long phoneNumber;

	public Contact(String firstName, String lastName, String city, String state, String email, int zip,
			long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
				+ ", email=" + email + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}
}
