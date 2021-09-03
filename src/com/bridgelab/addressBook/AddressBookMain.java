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
	public void editPerson() {
		System.out.println("Enter first name to edit contact");
		Scanner sc = new Scanner(System.in);
		String name = (String) sc.nextLine();
		for (int j = 0; j < I; j++) {
			String check = (String) this.addressBooks[j].firstName;
			if (check.equals(name)) {
				boolean bool = true;

				while (bool) {
					System.out.println("Which field do you want to edit : ");
					System.out.println("1. First Name     2. Last Name       3. Address        4. City ");
					System.out.println("5. State          6. Zip             7. Phone Number   8. Email ");
					System.out.println("9. Don't want Editing");
					int ch;
					Scanner sc1 = new Scanner(System.in);
					ch = sc1.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter new first name :");
						Scanner sc2 = new Scanner(System.in);
						String fn = sc2.nextLine();
						addressBooks[j].firstName = fn;
						break;
					case 2:
						System.out.println("Enter new last name :");
						String ln = sc1.nextLine();
						addressBooks[j].lastName = ln;
						break;
					case 3:
						System.out.println("Enetr new address :");
						String add = sc1.nextLine();
						addressBooks[j].address = add;
						break;
					case 4:
						System.out.println("Enetr new City :");
						String ct = sc1.nextLine();
						addressBooks[j].city = ct;
						break;
					case 5:
						System.out.println("Enetr new State :");
						String st = sc1.nextLine();
						addressBooks[j].state = st;
						break;
					case 6:
						System.out.println("Enetr new Zip:");
						int zp = sc1.nextInt();
						addressBooks[j].zip = zp;
						break;
					case 7:
						System.out.println("Enetr new Phone number :");
						int pn = sc1.nextInt();
						addressBooks[j].phoneNumber = pn;
						break;
					case 8:
						System.out.println("Enetr new Email :");
						String em = sc1.nextLine();
						addressBooks[j].email = em;
						break;
					case 9:
						bool = false;
						break;
					}
				}

			}
		}
	}
	public void deletePerson() {
		System.out.println("Enter first name do you want to delete contact :");
		Scanner ip = new Scanner(System.in);
		String name = ip.nextLine();
		for (int j = 0; j < I; j++) {
			if (addressBooks[j].firstName.equals(name) && addressBooks[j] != null) {
				addressBooks[j] = null;
			}
		}
	}
	public void displayAllContacts() {
		System.out.println(
				"First Name        Last Name      Address       City       State       Zip      Phone Number     Email");
		
		for (int j = 0; j < I; j++) {
			if (addressBooks[j] != null) {
				System.out.println(addressBooks[j].firstName + "         " + addressBooks[j].lastName + "        "
						+ addressBooks[j].address + "       " + addressBooks[j].city + "     " + addressBooks[j].state
						+ "     " + addressBooks[j].zip + "     " + addressBooks[j].phoneNumber + "      "
						+ addressBooks[j].email);
			}
		}
		System.out.println();	
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