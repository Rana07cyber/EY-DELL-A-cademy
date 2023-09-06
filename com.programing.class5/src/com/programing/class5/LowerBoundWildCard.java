package com.programing.class5;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInt = new ArrayList<>();
		listInt.add(123);
		listInt.add(456);
		listInt.add(870);
printListItems(listInt);
		
		List<Number> listFloat = new ArrayList<Number>();
		listFloat.add(55.7);
		listFloat.add(3.43);
		listFloat.add(34L);
		printListItems(listFloat);

		List<Double> listDouble = new ArrayList<Double>();
		listDouble.add(15.7);
		listDouble.add(34.1D);
		listDouble.add(30.9);
		//printListItems(listDouble);

	}

	static void printListItems(List<? super Integer> list) {
		for(Object num : list) {
			System.out.println(num);
		}
	}
}
