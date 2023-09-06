package com.programming.day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceWithQuantifier {

	private static String REGEX = "a*b";
	private static String INPUT_STRING = "aabPQRaabMNOabXYZb";
	private static String REPLACE = "_";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT_STRING);

		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			// append and replace
			m.appendReplacement(sb, REPLACE);
		}
		System.out.println(sb.toString());
	}

}
