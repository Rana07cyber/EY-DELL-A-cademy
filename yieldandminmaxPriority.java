package com.programming.day7;

public class yieldandminmaxPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread ProducerThread = new Producer();
		Thread consumerThread = new Consumer();
		ProducerThread.setPriority(Thread.MAX_PRIORITY);
		ProducerThread.setPriority(Thread.MIN_PRIORITY);
		ProducerThread.start();
		consumerThread.start();

	}

}

class Producer extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("producer thread" + i);
			Thread.yield();
		}
	}

}

class Consumer extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("consumer thread" + i);
			Thread.yield();

		}
	}
}
