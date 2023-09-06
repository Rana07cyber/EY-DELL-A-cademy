package com.programming.day7;

public class ThisKeywordUsage {

	int data = 30;

	void display() {
		System.out.println("value of local variable" + data);
		System.out.println("value of local variable" + this.data);

	}

	void didplay(int data) {
		System.out.println("value of local variable" + data);
		System.out.println("value of local variable" + this.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordUsage obj = new ThisKeywordUsage();
		obj.display();
		obj.didplay(40);
		obj.display();
	}

}
