package com.programming.day8;

import java.util.regex.Pattern;

public class UserNameValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[a-zA-Z0-9][6]" ,"abcd4"));
		System.out.println(Pattern.matches("[a-zA-Z0-9][6]" ,"abcd347"));
		
		//MOBILE NUMBER VALIDATION
		System.out.println(Pattern.matches("[789][1][0-9]{9}" ,"9898989998"));
		//trim function is only used to remove leading and trailing
		//white space in string whereas with replace, you can remove 
		//white space from within
		String str =" Java Example Trim Function";
		System.out.println(str.trim());
		System.out.println("[the boys plays football]" );


	}

}
