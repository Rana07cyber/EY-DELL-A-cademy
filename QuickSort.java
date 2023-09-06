package com.programing.class10;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 3, 60, 35, 0, 2, 24, 15 };
		int lenghtOfArray = intArr.length;

		System.out.println("Before Quick sort");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");

		}

		QuickSort.quickSort(intArr, 0, lenghtOfArray - 1);
		System.out.println();

		System.out.println("After quick sort");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");

		}

	}
	// or equal to pivot
	static void quickSort(int[] intArr, int startElement, int endElement) {
		// TODO Auto-generated method stub
		if (startElement < endElement) {
			int p = partition(intArr, startElement, endElement);// p is partition index
			quickSort(intArr, startElement, p - 1);
			quickSort(intArr, p + 1, endElement);

		}

	}

	// here we first choose a pivot, after partitioning we rearrange the array into
	// greater element to tthe right of the pivot
	static int partition(int[] intArr, int startPosition, int endPosition) {

		int pivotElement = intArr[endPosition];
		{
			int pivotElements = intArr[endPosition];// pivot element
			int i = (startPosition - 1);

			for (int j = startPosition; j < endPosition; j++) {
				// if current element is greater than pivot
				if (intArr[j] < pivotElement) {
					i++;
					int t = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = t;

				}
			}
			int t = intArr[i + 1];
			intArr[i + 1] = intArr[endPosition];
			intArr[endPosition] = t;
			return (i + 1);

		}
	}

}
