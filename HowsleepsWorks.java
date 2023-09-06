package com.programming.day7;

import java.util.concurrent.TimeUnit;

public class HowsleepsWorks extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HowsleepsWorks t1 = new HowsleepsWorks();
		HowsleepsWorks t2 = new HowsleepsWorks();
		
		t1.start();
		t2.start();

	}
	public void run () {
		for (int i =1;i<5;i++) {
			try {
				Thread.sleep(1000);
				TimeUnit.SECONDS.sleep(1);
			}catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			System.out.println(i);
		}
	}

}
