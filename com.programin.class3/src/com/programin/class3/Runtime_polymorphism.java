package com.programin.class3;

class Parent{
	void show(){
		System.out.println("parent class function");
		
	}
	int data = 10;
	
	
}

public class Runtime_polymorphism extends Parent {
	
void show() {
	System.out.println("child class function");

}
int data = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj = new Parent();
		obj.show();
		System.out.println("the value of the data is "+ obj.data);
		
		Runtime_polymorphism obj2 = new Runtime_polymorphism();
		obj2.show();
		System.out.println("the value of the data is "+ obj2.data);

		Runtime_polymorphism obj3 = new Runtime_polymorphism();
		obj3.show();
		System.out.println("the value of the data is "+ obj3.data);


	}

}
