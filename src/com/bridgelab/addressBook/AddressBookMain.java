package com.bridgelab.addressBook;

import java.util.Scanner;

class AddressBook {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public int zip;
	public int phoneNumber;
	public String email;

	public AddressBook(String firstName, String lastName, String address, String city, String state, int zip,
			int phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
}
public class AddressBookMain {
	public AddressBook addressBooks[] = new AddressBook[10];
	public static int I = 0;

	public void addPerson() {
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		int zip;
		int phoneNumber;
		String email;
		Scanner sc = new Scanner(System.in);
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter first name :");
		firstName = sc.nextLine();
		System.out.println("Enter Last name :");
		lastName = sc.nextLine();
		System.out.println("Enter address name :");
		address = sc.nextLine();
		System.out.println("Enter city name :");
		city = sc.nextLine();
		System.out.println("Enter state name :");
		state = sc.nextLine();
		System.out.println("Enter zip :");
		zip = sc.nextInt();
		System.out.println("Enter phone number :");
		phoneNumber = sc.nextInt();
		System.out.println("Enter email :");
		email = scc.nextLine();
		addressBooks[I++] = new AddressBook(firstName, lastName, address, city, state, zip, phoneNumber, email);
		System.out.println("Contact has been  added ");
	}


	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		boolean condition = true;
		AddressBookMain obj = new AddressBookMain();
		while (condition) {
			int choice = 0;
			System.out.println("1. Add person \n2. Edit person \n3. Delete person \n4. View all contacts\n5. Exit");
			System.out.println("Enter your choice :");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				obj.addPerson();
				break;
			case 2:
				obj.editPerson();
				break;
			case 3:
				obj.deletePerson();
				break;
			case 4:
				obj.displayAllContacts();
				break;
			case 5:
				condition = false;
				break;
			}
		}
		

		
	}

}