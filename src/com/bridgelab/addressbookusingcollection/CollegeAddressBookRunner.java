package com.bridgelab.addressbookusingcollection;

import java.util.Scanner;

public class CollegeAddressBookRunner {
	public static void main(String[] args) {
		CollegeAddressBook book = new CollegeAddressBook();

		int a = 0;
		Scanner sc = new Scanner(System.in);
//		List<AddressBook> list= new LinkedList<AddressBook>();
//		list.add(new AddressBook("prit", null, null, null, null, null, null, null));
//		System.out.println(list.get(0).firstName.equals("prit"));
//		System.out.println(list.contains("prit"));

		while (true) {

			while (true) {
				System.out.println("please enter int");
				System.out.println("Enter Choice: ");
				System.out.println(
						"1. Add Contact in college Book; 2. Edit Contact in college Book ; 3. Delete Contact ; 4. Display Contacts  ");
				a = sc.nextInt();
				switch (a) {
				case 1:
					System.out.println("ENter First Name");
					String fName = sc.next();
					System.out.println("ENter LastName");
					String lName = sc.next();
					System.out.println("ENter Adress");
					String address = sc.next();
					System.out.println("ENter City");
					String city = sc.next();
					System.out.println("ENter State");
					String state = sc.next();
					System.out.println("ENter Zip");
					String zip = sc.next();
					System.out.println("ENter MobileNumber");
					String mobNo = sc.next();
					System.out.println("ENter EmailId");
					String eMailId = sc.next();

					book.addContactInBook(fName, lName, address, city, state, zip, mobNo, eMailId);
					break;
				case 2:
					book.showBook();
					break;
				case 3:
					book.removeContact();
					break;

				default:
					System.out.println("Wrong input");
				}

			}
		}

	}
}
