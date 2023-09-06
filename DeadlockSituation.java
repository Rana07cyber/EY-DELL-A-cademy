package com.programming.day7;

public class DeadlockSituation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final String resource1="A";
		final String resource2="B";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("thread 1: locked resource1");
					try {
						Thread.sleep(1000);
							
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
						synchronized (resource2) {
							System.out.println("Thread1: looking for resourse 2");
						}
					}
				}
			};
			
		
			Thread t2 = new Thread() {
				public void run() {
					synchronized (resource2) {
						System.out.println("thread 2: locked resource2");
						try {
							Thread.sleep(1000);
								
							}catch(InterruptedException e) {
								e.printStackTrace();
							}
							synchronized (resource2) {
								System.out.println("Thread2: looking for resourse 2");
							}
						}
					}
				};
				t1.start();
				t2.start();
			}
		}