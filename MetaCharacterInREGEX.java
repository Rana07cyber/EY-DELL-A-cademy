package com.programming.day8;

import java.util.regex.Pattern;
//d id digit
//D is non digit
//[^0-9] anything othrt than 0-9
public class MetaCharacterInREGEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Pattern.matches("\\d", "abc"));//false
		System.out.println(Pattern.matches("\\d", "l"));//true
		
		System.out.println(Pattern.matches("\\d", "1234"));//false
		System.out.println(Pattern.matches("\\d", "1234"));//false
		
		System.out.println(Pattern.matches("\\d", "a"));//true
		System.out.println(Pattern.matches("\\d", "abc"));//true
		System.out.println(Pattern.matches("\\d", "123"));//false

System.out.println("core java Regex".replaceAll("\s+", " "));
	}

}
