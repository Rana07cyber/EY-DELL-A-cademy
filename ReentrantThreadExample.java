package com.programming.day7;

class Reentrant{
	public synchronized void m() {
		n();
		System.out.println("im in a synchronized method");
	}
	public synchronized void n() {
		System.out.println("im in a n synchronized method");
	}

}


public class ReentrantThreadExample {

	public static void main(String[] args) {
		final Reentrant r = new Reentrant();
		new  Thread() {
			public void run() {
				r.m();
			}
		}.start();

	}

}
