package com.programming.day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AletterwithinAword {
	
	private static final String REGEX ="\\bA\\b";
	private static final String INPUT_STRING ="A A A AB A";
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p= Pattern.compile(REGEX);
		Matcher m= p.matcher(INPUT_STRING);
		
		int count =0;
		while(m.find()) {
			count++;
			System.out.println("Matcher Number-"+count);
			System.out.println("Starting String-"+m.start());

			System.out.println("Ending Position-"+m.end());

		}
	}

}
