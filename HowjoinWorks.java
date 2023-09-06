package com.programming.day7;

public class HowjoinWorks extends Thread {

	public static void main(String[] args) {
		HowjoinWorks thread = new HowjoinWorks();
		thread.start(); // Start the thread

		try {
			thread.join(); // Wait for the thread to finish
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}

		System.out.println("Main thread finished");
	}
}
