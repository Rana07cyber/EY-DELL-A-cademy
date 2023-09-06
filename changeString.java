package com.programming.day7;

public class changeString {
	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Rana");

		System.out.println(str);

		str.replace(0, 0, "B");
		
		//str.replace(0, 1, "O");
	//	str.replace(0, 2, "S");
		//str.replace(0, 3, "S");


		System.out.println(str);
	}

}
