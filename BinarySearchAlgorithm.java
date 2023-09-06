package com.programing.class10;

import java.util.Arrays;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = {2,4,6,8,5,0};
		Arrays.sort(intArr);
		System.out.println("sorted array is "+Arrays.toString(intArr));
		int lookOutfor= 0;
		int lastElementPositionArray=intArr.length-1;
		binarySearch(intArr,0,lastElementPositionArray,lookOutfor);
	}

	static void binarySearch(int[] intArr, int startingPosition, int lastPosition, int searchElement) {
		// TODO Auto-generated method stub
		
		int midElementPosition=(startingPosition+lastPosition)/2;
		while (startingPosition<=lastPosition) {
			if(intArr[midElementPosition]<searchElement) {
				startingPosition=midElementPosition+1;
			}else if(intArr[midElementPosition] == searchElement) {
				System.out.println("element found at position "+  midElementPosition);
				break;
			}else {
				lastPosition=midElementPosition-1;
				
			}
			midElementPosition=(startingPosition+lastPosition)/2;
		}
	if(startingPosition>lastPosition) {
		
		System.out.println("element is not found ");
	}
	
  }
}

