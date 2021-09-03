package com.bridgelab.addressbookusingcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phoneNumber;
	public String email;
	List<AddressBook> list = new ArrayList<AddressBook>();

	public AddressBook() {
	}

	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public void addContactInBook(String fName, String lName, String address, String city, String state, String zip,
			String mobNo, String eMailId) {
		if (checkDuplicate(fName))
			list.add(new AddressBook(fName, lName, address, city, state, zip, mobNo, eMailId));
		else {
			System.out.println("Duplicate Seen in the book please enter other name");
		}

	}
	
	

	public boolean checkDuplicate(String firstName) {
		for (int i = 0; i < list.size(); i++) {
			if (firstName.equals(list.get(i).firstName)) {
				return false;
			}

		}
		return true;

	}
	public void showAccordingToCity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter City: ");
		String city = sc.nextLine();
		
		for(int i =0;i<list.size();i++) {
			if(city.equals(list.get(i).city)) {
				System.out.println(list.get(i).getFirstName());
			}
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<AddressBook> getList() {
		return list;
	}

	public void setList(List<AddressBook> list) {
		this.list = list;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressBook other = (AddressBook) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}

	

	public void showBook() {
		int i = 0;
		Iterator<AddressBook> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(i + " " + itr.next());
			i++;
		}
	}



	@Override
	public String toString() {
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ "]";
	}

}
