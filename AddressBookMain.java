package com.blz.AddressBook;

import java.util.*;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

	AddressBook a = new AddressBook();
	AddressBookContacts c = a.create("Dhanshree", "Patil", "xyz", "pune", "MH", 424888, "9876543210", "abc@adg.com");
	System.out.println("Contact created");
	
	}

}
