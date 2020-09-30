package com.he.addressBook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {

	private String label;
	private String address;
	
	public Address(String label, String address) throws Exception {
		if(UtilClass.isStringOnlyAlphabet(label) && UtilClass.isvalidAddress(address)) {
		this.label=label;
		this.address=address;
		}else {
			throw new Exception();
		}
		// TODO
	}
	
	@Override
	public String toString() {
		return "Address [label=" + label + ", address=" + address + "]";
	}

	public String getLabel() {
		return this.label;
	}
	
	public String getAddress() {
		return this.address;
	}
	private Boolean checklabel(String number) {
    	Boolean reulst=true;
    	try {
    	 String regex = "[a-z][A-Z]";
    	 Pattern pattern = Pattern.compile(regex);
         //Creating a Matcher object
         Matcher matcher = pattern.matcher(number);
         if(!matcher.matches()) {
         	reulst=false;
         }}catch(Exception e){
         	reulst=false;
         }
    	return reulst;
    }
}
