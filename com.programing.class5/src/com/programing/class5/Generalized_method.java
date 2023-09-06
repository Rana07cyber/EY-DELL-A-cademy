package com.programing.class5;

public class Generalized_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArr = {12,34};
		String[] strArr = {"a","b"};
		
		System.out.println("printing integer array");
		printArray(intArr);
		
		System.out.println("printing String array");
		printArray(strArr);
		
	}
	static <E> void printArray(E[] elements) {
		for(E ele: elements) {
			System.out.println(ele + " ");
		}
	}
	
	

}
