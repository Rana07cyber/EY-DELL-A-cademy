package com.programing.class10;

public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = { 3, 60, 35, 0, 2, 24, 15 };
		// int lenghtOfArray = intArr.length;
		System.out.println("elements before swapping");
		for (int i : intArr) {
			System.out.print(i + " ");

		}
		System.out.println();
		// lets say we want to swap elemnts at 4th index with 2nd index
		int firstIndex = 2, secondIndex = 4;
		// temp variable
		int temp = intArr[firstIndex];
		// swapping
		intArr[firstIndex] = intArr[secondIndex];
		intArr[secondIndex] = temp;

		System.out.println("elements after swapping 4th index value with 2nd indeex");
		for (int i : intArr) {
			System.out.println(i + " ");
		}
	}

}
