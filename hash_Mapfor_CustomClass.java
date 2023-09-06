package com.programming.class5;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class hash_Mapfor_CustomClass {

	public static void main(String[] args, Entry<Integer, Book> M) {
		// TODO Auto-generated method stub
 HashMap<Integer,Book> hMap= new HashMap<>();

		Book b1 = new Book(1,"A","B", "C",10);
		Book b2 = new Book(12,"P","Q", "R",100);
		Book b3 = new Book(32,"M","N", "O",1800);
		 
		
		hMap.put(123,b3);
		hMap.put(135,b2);
		hMap.put(121,b1);
		
		for(Map.Entry<Integer, Book> m:hMap.entrySet());
		int key =M.getKey();
		Book b =M.getValue();
		System.out.println("key"+ key +"details are:");
		
        System.out.println(b.bookid + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);

		
	}

}
