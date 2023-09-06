package com.programming.day8;

import java.util.regex.Pattern;

public class QuantifierClassinRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ?= a or m or n- once or not at all
		System.out.println(Pattern.matches("[amn]?", "a"));// true
		System.out.println(Pattern.matches("[amn]?", "z"));// false
		System.out.println(Pattern.matches("[amn]?", "am"));// false
		System.out.println(Pattern.matches("[amn]?", " "));// true

		// +-a or m or n -once or more than once
		System.out.println(Pattern.matches("[amn]+", "aaaa"));// true
		System.out.println(Pattern.matches("[amn]+", "aaammm"));// true
		System.out.println(Pattern.matches("[amn]+", "aaammmooo"));// false

		// *-a or m or n -zero or more than once
		System.out.println(Pattern.matches("[amn]*", "z"));// true
		System.out.println(Pattern.matches("[amn]*", "aaammm"));// true

	}

}
