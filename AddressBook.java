package com.blz.AddressBook;

import java.util.*;

public class AddressBook {
	
	  ArrayList<AddressBookContacts> list;
	  
	  public AddressBook( )
	  {
		  
	  }

	  public AddressBookContacts create(String firstName,String lastName,String address,
			  String city,String state,int zip,String ph_no,String email ) {
		  
		  AddressBookContacts contact = new AddressBookContacts(firstName,lastName,address,city,state,zip,ph_no,email );
		  return contact;
	  }

}

