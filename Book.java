package com.programming.class5;
//import java.util.Iterator;
public class Book implements Comparable<Book> {
	int bookid;
	String author, publisher,name;
	int quantity;
			
	Book(int bookid ,String author, String publisher,String name,int quantity){
		this.bookid=bookid;
		this.author=author;
		this.publisher=publisher;
		this.name=name;
		this.quantity=quantity;
		
	}
	//Override
	public int compareTo(Book o) {
		if (bookid > o.bookid) {
			return 1;
		}else if (bookid <o.bookid){
			return -1;
		}else {
			return 0;
			
		}
	}
}
