package com.programing.class10;

public class SortarrayUsingBubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 2, 45, 67, 84, 67 };
		System.out.println("before  bubble sort");
		for (int i = 0; i < intArr.length; i++) {

			System.out.println(intArr[i] + " ");

		}

		bubbleSort(intArr);
		System.out.println();

		System.out.println("after bubble sort");
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i] + " ");
		}
	}

	static void bubbleSort(int[] intArr) {
		int lengthOfArray = intArr.length;
		int tempArr = 0;
		for (int i = 0; i < lengthOfArray; i++) {
			for (int j = 1; j < (lengthOfArray - i); j++) {
				if (intArr[j - 1] > intArr[j]) {
					// swap elements here
					tempArr = intArr[j - 1];
					intArr[j - 1] = intArr[j];
					intArr[j] = tempArr;
				}
			}
		}
	}

}
