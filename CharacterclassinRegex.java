package com.programming.day8;

import java.util.regex.Pattern;

public class CharacterclassinRegex {
	//abc a or b or c
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[amn]", "a"));//true
		System.out.println(Pattern.matches("[amn]", "aa"));//false
		System.out.println(Pattern.matches("[amn]", "m"));//true
		System.out.println(Pattern.matches("[amn]", "mn"));//false
		//any character except a or m or n;	
		System.out.println(Pattern.matches("[^amn]", "z"));//true
		//any alphabet lowercase or uppercase
		System.out.println(Pattern.matches("[a-zA-Z]", "B"));//false
		//a through d or m through p
		System.out.println(Pattern.matches("[a-d[m-p]", "e"));//false

	}

}
