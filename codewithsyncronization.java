package com.programming.day7;

class SharedResources {
	//synchronized method
	 synchronized void print(int n) {
		for (int i = 1; i <= 5; i++) { // we can make a synchronized BLOCK too
			System.out.println(n * 1);
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
//using static 
class MyThread1 extends Thread {
	SharedResources sR;

	MyThread1(SharedResources sR) {
		this.sR = sR;
	}

	public void run() {
		sR.print(5);
	}
}

class MyThread2 extends Thread {
	SharedResources sR;

	MyThread2(SharedResources sR) {
		this.sR = sR;
	}

	public void run() {
		sR.print(10);
	}
}

public class codewithsyncronization {
	public static void main(String[] args) {

		SharedResources obj = new SharedResources();

		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);

		t1.start();
		t2.start();
	}

}
