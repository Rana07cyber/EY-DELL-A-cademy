package com.programing.class4;

public class Final_keyword {

	final String PAN_CARD_NUMBER;
	Final_keyword(){
		PAN_CARD_NUMBER="GOV.RANA";
		
	}
	final void display() {
		System.out.println("final method");
		
		
	}
	public static void main(String[] args) {
		Final_keyword obj = new Final_keyword();
		System.out.println("obj is->"+ obj.PAN_CARD_NUMBER);
	}
}
