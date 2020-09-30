package com.he.addressBook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private String label;
    private String phoneNumber;

    public PhoneNumber(String label, String phoneNumber) throws Exception {
    if(UtilClass.isStringOnlyAlphabet(label) && UtilClass.isvalidMobileNumber(phoneNumber))
    {
    	this.label=label;
    	this.phoneNumber=phoneNumber;
    		 
    	}else {
    		throw new Exception();
    	}
    }

    @Override
	public String toString() {
		return "PhoneNumber [label=" + label + ", phoneNumber=" + phoneNumber + "]";
	}

	public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    private Boolean checkMobilenumber(String number) {
    	Boolean reulst=true;
    	try {
    	//int number1=Integer.parseInt(number);
    	String regex = "\\d{10}";
       
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
