package com.programming.day8;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("helloWorld");//once 0(1)
		display();
		

	}
	static void display() {
		// TODO Auto-generated method stub
		
		int n=8;
		for(int i=0;i<n;i++) {
			System.out.println("hello world!!!\n");//o(n)
		}
		for(int i=1;i<n;i=i*2) {
			System.out.println("hello world!!!\n");//o(log2(n))
		}

		for(int i=2;i<n;i=(int)Math.pow(i, 2)) {
			System.out.println("hello world!!!\n");//o(log(log(n))
		}
	}
	
	}
	

