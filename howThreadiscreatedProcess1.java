package com.programming.day7;

public class howThreadiscreatedProcess1 extends Thread {
	public static void main(String[] args) {

		howThreadiscreatedProcess1 t1 = new howThreadiscreatedProcess1();

		t1.start();

	}

	public void run() {

		System.out.println("I am running automatically");

	}

}