package com.blz.AddressBook;

import java.util.*;

public class AddressBook {
	public static Map<String,AddressBook> hm= new HashMap<String, AddressBook>(); 
	String addressBookName;
	
	  ArrayList<AddressBookContacts> list;
	  
	  public AddressBook( )
	  {
		  list = new ArrayList<AddressBookContacts>();
		  
	  }
	  
		Scanner sc =new Scanner(System.in);
		
		public AddressBook(String addressBookName) {
			list=new ArrayList<AddressBookContacts>();
			this.addressBookName=addressBookName;
			
		}
}


