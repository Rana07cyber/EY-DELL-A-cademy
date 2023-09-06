package com.programing.class5;
import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<Rectangle> lisRect = new ArrayList<Integer>();

		lisRect.add(123);

		lisRect.add(456);

		lisRect.add(789);

		printListItems(lisRect);

		List<Number> listfloat = new ArrayList<Number>();

		listfloat.add(14L);

		listfloat.add(3.14f);

		listfloat.add(21L);

		printListItems(listfloat);

		List<Double> listDouble = new ArrayList<Double>();

		listDouble.add(11.1D);

		listDouble.add(33.2D);

		// printListItems(listDouble);

	}

	private static void printListItems(List<? super Integer> list) {

		// TODO Auto-generated method stub

		for (Object num : list) {

			System.out.println(num);

		}

	}

}