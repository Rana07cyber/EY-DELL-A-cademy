package com.programming.class5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowcomparableandcomparatorWorks {

	public static void main(String[] args) {
		int[] intArr= {10,30,50,3,57};
		Arrays.sort(intArr);
		System.out.println("sorted integer arrays is"+ Arrays.toString(intArr));
		
		String[] strArr = {"Z","A","X","B","W"};
		Arrays.sort(strArr);
		System.out.println("sorted integer arrays is"+ Arrays.toString(strArr));
		
		List<String> liststr = new ArrayList<>();
		liststr.add("Z");liststr.add("A");liststr.add("Z");liststr.add("Z");
		liststr.add("X");liststr.add("Y");
		Collections.sort(liststr);
		for(String str: liststr) {
			System.out.println(str + " ");
		}

	}

}
