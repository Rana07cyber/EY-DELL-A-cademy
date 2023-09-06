package com.programin.class3;

public class exception_propagation {

	public static void main(String[] args) {
		System.out.println("main method");
		try {
			exception_propagation obj = new exception_propagation();
			obj.a();
		}catch(InterruptedException e) {
			System.out.println("main method"+ e.getMessage());

		}
		// TODO Auto-generated method stub

	}
	void a()throws InterruptedException{
		System.out.println("method  a");
     b();
	}
	void b()throws InterruptedException{
		System.out.println("method  b");
     c();
	}
	void c()throws InterruptedException{
		System.out.println("method  c");
	}


}
