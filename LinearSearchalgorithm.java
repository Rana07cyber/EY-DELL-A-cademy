package com.programing.class10;

import java.util.Arrays;

//
public class LinearSearchalgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {2,4,6,8,5,0};
		int lengthOfArray = intArr.length;

		int searchElement = 8;

		int index = searchProgram(intArr, lengthOfArray, searchElement);
		if (index == 1) {
			System.out.println("Element" + searchElement + "is not" + "present in array" + Arrays.toString(intArr));

		} else {
			System.out.println("Element-> " + searchElement + " is found " + "at index" + index);

		}

	}

	static int searchProgram(int[] intArr, int length, int element) {
		for (int i = 0; i < length; i++) {
			if (intArr[i] == element) {
				return i;

			}
		}
		return -1;
	}
}
