package com.programming.day7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Employee implements Serializable {

	int empId;
	String empName;

	Employee(int empId, String empName) {
		// this.empName;
		this.empId = empId;
		this.empName = empName;
	}
}

public class SerializableanddeseriziblebasicclassObject {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Employee emp = new Employee(123, "ABC");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oss = new ObjectOutputStream(fos);
		oss.writeObject(emp);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2=(Employee)ois.readObject();
		
		System.out.println(emp2.empId+ " "+emp2.empName);
oss.close();
ois.close();

	}

}
