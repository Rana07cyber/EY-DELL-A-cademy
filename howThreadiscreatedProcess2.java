package com.programming.day7;

public class howThreadiscreatedProcess2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		howThreadiscreatedProcess2 obj = new howThreadiscreatedProcess2();
		Thread t1 = new Thread(obj);
		t1.start();
		

	}
	@Override
	public void run() {
		System.out.println("i also got called automatically");
	}

}
