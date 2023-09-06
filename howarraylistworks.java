package com.programming.class5;

import java.util.ArrayList;
import java.util.Iterator;

public class howarraylistworks {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<>();
		arrlist.add("A");
		arrlist.add("A");
		arrlist.add("A");
		arrlist.add("A");
		arrlist.add(null);
		arrlist.add("null");
		arrlist.add("null");
		arrlist.add("Z");
		arrlist.add("X");
		arrlist.add("Y");
		arrlist.add("B");
		
		ArrayList<String> arrlist2 = new ArrayList<>();
		arrlist2.add("P");arrlist2.add("P")arrlist2.add("Q");
		arrlist.addAll(arrlist2);
		System.out.println("Size of my array list is "+arrlist.size());
		arrlist.remove("A");
		arrlist.removeAll(arrlist2);
		arrlist.set(1, "new second element");
		arrlist.retainAll(arrlist2);
		
		
		Iterator<String> itr = arrlist.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next() + " ");

		}
//int the end we clear out the entire arrlist like this
		arrlist.clear();
		for(String str: arrlist) {
			System.out.println(str +" ");
		}
	}

}
