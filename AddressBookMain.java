package com.blz.AddressBook;

import java.util.*;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		
		    System.out.println("create new address book");
			System.out.println("Enter name of address book to be created");
			String name=sc.next();
			AddressBook obj=new AddressBook();
			
			AddressBook.hm.put(name, obj);
			System.out.println("Address Book Created");
		}
		
	}


