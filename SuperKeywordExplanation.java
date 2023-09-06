package com.programming.day7;
class parent {
	
	void show() {
		
		System.out.println("parent class funtion show");
	}
	int data = 10;
}
public class SuperKeywordExplanation extends parent {
@Override
void show() {
	System.out.println("child class funtion show");
}
	int data= 20;
	void display() {
		
		System.out.println("the value of the current class object data is"+ this.data);
		System.out.println("the value of the current class object data is"+ super.data);
		this.show();
		super.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKeywordExplanation obj = new SuperKeywordExplanation();
		obj.display();
		
	}

}
