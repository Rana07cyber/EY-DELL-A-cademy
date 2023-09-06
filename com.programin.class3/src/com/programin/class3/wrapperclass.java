package com.programin.class3;

public class wrapperclass {

	public static void main(String[] args) {
		// data types
		byte grade = 2;
		short marks = 30;
		float price = 8;
		double rate = 240.3D;
		boolean flag = false;
		char initial = 'A';
		// autoboxing -to getobject out of a data types -wrapper class
		Byte bObject = new Byte(grade);

		Short sObject = new Short(marks);

		System.out.println("Data type grade is " + grade);

		System.out.println("Object bObject is " + bObject);

		byte byteValue = bObject.byteValue(); // Unboxing of a wrapper class

		System.out.println(byteValue);

	}

}
