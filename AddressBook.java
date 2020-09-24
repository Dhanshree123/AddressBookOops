package com.blz.AddressBook;

import java.util.*;

public class AddressBook {
	
	  ArrayList<AddressBookContacts> list;
	  
	  public AddressBook( )
	  {
		  list = new ArrayList<AddressBookContacts>();
		  
	  }
	  
		Scanner sc =new Scanner(System.in);
		
	      public void deleteContactDetails(String firstName) {
	         int pos=0;
	    		
	    	 for(int i=0;i<list.size();i++) {
	    			if(list.get(i).getFirstName().equals(firstName))
	    				pos = i;
	    	 }
	    	 list.remove(pos);
	  	  }

}


