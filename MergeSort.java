package com.programing.class10;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[] intArr = { 3, 60, 35, 0, 2, 24, 15 };
		int lenghtOfArray = intArr.length;

		System.out.println("Before Merge sort");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");

		}

		MergeSort.mergeSort(intArr, 0, lenghtOfArray - 1);
		System.out.println();

		System.out.println("After Merge sort");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");

		}

	}

	static void mergeSort(int intArr[], int beginningPosition, int endingPosition) {
		if (beginningPosition < endingPosition) {
			int midPosition = (endingPosition + beginningPosition) / 2;
			mergeSort(intArr, beginningPosition, midPosition);
			mergeSort(intArr, midPosition + 1, endingPosition);
			merge(intArr, beginningPosition, midPosition, endingPosition);
		}

	}

	static void merge(int intArr[], int beginningPosition, int midPosition, int endingPosition) {
		int i, j, k;
		int firstNumber = midPosition - beginningPosition + 1;
		int secondNumber = endingPosition - midPosition;

		// temporary array for sorting
		int leftArray[] = new int[firstNumber];
		int rightArray[] = new int[secondNumber];

		// copy data to temp array
		for (i = 0; i < firstNumber; i++) {
			leftArray[i] = intArr[beginningPosition + i];

		}
		for (j = 0; j < secondNumber; j++) {
			rightArray[j] = intArr[midPosition + 1 + j];

		}
		i = 0;
		j = 0;
		k = beginningPosition;

		while (i < firstNumber && j < secondNumber) {
			if (leftArray[i] <= rightArray[j]) {
				intArr[k] = leftArray[i];
				i++;

			} else {
				intArr[k] = rightArray[j];
				j++;

			}
			k++;

		}
		while (i < firstNumber) {
			intArr[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < secondNumber) {
			intArr[k] = rightArray[j];
			j++;
			k++;
		}
	}

}
