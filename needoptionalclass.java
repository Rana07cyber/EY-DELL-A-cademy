package com.programming.day7;

public class needoptionalclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[10];
		String word ="";
		if(null!=words[5]) {
			word =words[5].toLowerCase();
		}
		else {
		
		System.out.println("value at 5th index waas null");
		
		//String[] words = words[5].toLowercase();
		


	}System.out.println(word);

}
}
