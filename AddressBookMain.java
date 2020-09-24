package com.blz.AddressBook;

import java.util.*;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		
		String firstName, lastName, address, city, state, ph_no, email;
		int zip;
		
		AddressBook a = new AddressBook();
		boolean flag = true;
		while(flag)
		{		
		 System.out.println("Enter the first name");
		 firstName = sc.next();
		 System.out.println("Enter the last name");
		 lastName = sc.next();
		 System.out.println("Enter the Address");
		 address = sc.next();
		 System.out.println("Enter the city");
		 city = sc.next();
		 System.out.println("Enter the state");
		 state = sc.next();
		 System.out.println("Enter the zip");
		 zip = sc.nextInt();
		 System.out.println("Enter the Phone Number");
		 ph_no = sc.next();
		 System.out.println("Enter the Email Id");
		 email = sc.next();
		 AddressBookContacts c = a.create(firstName, lastName, address, city, state, zip, ph_no, email);
		 a.addContactDetails(c);
		 
		 System.out.println("Do You want to add more Contacts?(Y/N)");
		 String response = sc.next();
		 if(response.equals("Y"))
			 flag = true;
		 else
			 flag = false;
		 
		}
	}

}
