package com.he.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

	private List<Contact> listofContacts = new ArrayList<Contact>();;

	public AddressBook() {
		
	}

	public void addContact(Contact contact) throws Exception {
		
		if(listofContacts.contains(contact) ) {
			throw new Exception();
				
		}else {
			for(Contact con:listofContacts) {
				if(con.getName().equals(contact.getName())) {
					throw new  Exception();
				}
				
			}
			listofContacts.add(contact);
			
		}
	}

	public void deleteContact(String name) throws Exception {
       if(!name.isEmpty() && name!=null)
		listofContacts.removeIf((Contact emp) -> emp.getName().equals(name));
       else {
    	   throw new Exception();
       }
    	   
	}

	public void updateContact(String name, Contact contact) throws Exception {
		
		for (int i = 0; i < listofContacts.size(); i++) {

	    	   if (contact.getName().equalsIgnoreCase(listofContacts.get(i).getName())) {
	        	listofContacts.get(i).setName(name);
	            break;

	        }
	    }

	}

	public List<Contact> searchByName(String name) throws Exception {
		
		List<Contact> searchByNameList;
		if (name.isEmpty()) {

			searchByNameList=listofContacts;
		} else {
			searchByNameList= listofContacts.stream().filter(con -> con.getName().toString().contains(name))
					.collect(Collectors.toList());

		}
		return searchByNameList;
	}

	public List<Contact> searchByOrganisation(String organisation) {
		
		List<Contact> searchByOrganisationList;
		if (organisation.isEmpty()) {

			searchByOrganisationList=listofContacts;
		} else {
			searchByOrganisationList= listofContacts.stream().
					filter(con -> con.getOrganisation().toString().contains(organisation) ||con.getOrganisation().toString().equalsIgnoreCase(organisation) )
				//	.filter(con -> con.getOrganisation().toString().equalsIgnoreCase(organisation))
					.collect(Collectors.toList());

		}
		return searchByOrganisationList;
		
		
	
	}
}