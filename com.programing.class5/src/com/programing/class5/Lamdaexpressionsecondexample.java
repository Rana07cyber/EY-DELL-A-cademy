package com.programing.class5;
@FunctionalInterface
interface ifFunctional{
	void show(String data);
}
public class Lamdaexpressionsecondexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifFunctional obj = new ifFunctional() {
			@Override
			public void show(String data) {
				
				System.out.println("using anonymous inner"+ data);
			}
		};
		
		obj.show("class way of implementation");
		
		ifFunctional obj2 =(demoData)->{
			System.out.println("eliminating anonymous inner "+ demoData);
			
		};
		
		obj.show("class way of implementation-Through lamda expression");

		
	}

}
