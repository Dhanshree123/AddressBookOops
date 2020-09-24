package com.blz.AddressBook;

import java.util.*;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		
		String firstName, lastName, address, city, state, ph_no, email;
		int zip;
		
		AddressBook a = new AddressBook();
		System.out.println("Enter the first name to Delete");
		 firstName = sc.next();
		 a.deleteContactDetails(firstName);
		 System.out.println("Contact Details Editted");
		 
	}

}
