package com.programming.day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetsdivideStringUsingGroupfunction {

	private static final String PATTERN = "(.*)(\\d)(.*)";
	private static final String INPUT_LINE = "This is  ->" + "group 1 Regex session";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p = Pattern.compile(PATTERN);
		Matcher m = p.matcher(INPUT_LINE);

		while (m.find()) {
			System.out.println("default group is " + m.group(0));
			System.out.println(" group 1 is " + m.group(1));
			System.out.println(" group 2 is " + m.group(2));
			System.out.println(" group 3 is " + m.group(3));
			System.out.println(" total group count is " + m.groupCount());

		}
	}

}
