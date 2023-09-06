package com.programin.class3;

import java.sql.SQLexception;

class parent {
	void show() throws SQLexception {
		System.out.println("parent class method");

	}
}

public class exceptionhandling_rules extends parent {
	void show()throws Exception {
		System.out.println("child class method");
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}

}
