package com.he.addressBook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilClass {
	
	public static int MOBILE_REGIX=10;
	public static int LABEL_REGIX=255;	
	public static String  MOBILE_REG="\\d{10}"; 
	public static String ADDRESS_REG1="([A-Za-z][A-Za-z0-9.\\\\-_]*)\\\\s*(at)\\\\s*(([A-Za-z][A-Za-z0-9\\\\-_()]*\\\\s*(dot)\\\\s*)+[A-Za-z]+)"; 
	public static String ADDRESS_REG="^[#.0-9a-zA-Z\\s,-]+$";	
	public static final String RE ="[a-z]";
    public static final String INPUT ="venkat";
	
	 
	    private static Pattern pattern;
	    private static Matcher matcher;
 public static void main(String[] args) {
	        
	        // Initialize
	        pattern = Pattern.compile(ADDRESS_REG1);
	        matcher = pattern.matcher(INPUT);

	       System.out.println(matcher.matches());
	          //  + matcher.matches());
		}

	public static boolean isStringOnlyAlphabet(String str) 
	{ 
	    return ((!str.equals("")) 
	            && (str != null) 
	            && (str.matches("^[a-zA-Z]*$"))
	            && str.length()<=255); 
	} 
	public static boolean isValidOragnization(String str) 
	{ 
	    return ( str.matches("^[a-zA-Z ]*$")
	            && str.length()<=255); 
	} 
	public static boolean isvalidMobileNumber(String str) 
	{ 
	    return ((!str.equals("")) 
	            && (str != null) 
	            && (str.matches(MOBILE_REG))
	            && str.length()==10); 
	} 
	public static boolean isvalidAddress(String str) 
	{ 
	    return ((!str.equals("")) 
	            && (str != null) 
	            && (str.matches(ADDRESS_REG))
	            && str.length()<=255); 
	} 
	
}
