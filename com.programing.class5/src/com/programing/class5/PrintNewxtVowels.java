package com.programing.class5;

import java.util.HashMap;
import java.util.Arrays;

public class PrintNewxtVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="amitthakur";
		System.out.println("next volwel string is -"+ printNextVowel(str.toCharArray()));
		
		
		
	}
    public static String printNextVowel (char[] str){
    	HashMap<Character,Integer>hMap =new HashMap<>();
    	
    	hMap.put('a', 0);
    	hMap.put('e', 1);
    	hMap.put('i', 2);
    	hMap.put('o', 3);
    	hMap.put('u', 4);
    	
    	char[] arr= {'a', 'e','i','o','u'};
    	
    	int lengthOfString =str.length;
    	
    	
    	for (int i =0; i<lengthOfString ; i++) {
    		char c=str[i];
    		if(c=='a'|| c=='e'|| c=='i'||c=='o'|| c=='u') {
    			int index =hMap.get(c)+1;
    			int newindex =index % 5;
    			str[i] =str[newindex];
    		}
    	}
		return String.valueOf(str);

    	
    }
}
