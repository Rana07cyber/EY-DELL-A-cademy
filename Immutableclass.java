package com.programming.day7;

public class Immutableclass {
	public static void main(String[] args) {

		String str = new String("ABC");
		System.out.println("After first step -- " + str);
		str = str.concat("---XYZ");
		str.concat(" --XYZ");
		System.out.println("After second step -- " + str);
		StringBuilder sb = new StringBuilder("ABC");
		System.out.println("SB - After first step -- " + sb.toString());
		sb.append("XYZ");
		System.out.println("SB - After second step -- " + sb.toString());

	}

}