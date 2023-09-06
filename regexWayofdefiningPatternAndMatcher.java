package com.programming.day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexWayofdefiningPatternAndMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pattern p= Pattern.compile(".o");
		
		Matcher m = p.matcher("co");
		boolean result = m.matches();
		
		System.out.println("match Result -"+result);
		boolean sameResult2=Pattern.compile(".a").matcher("a").matches();
		System.out.println("result is"+sameResult2);
		
	}

}
