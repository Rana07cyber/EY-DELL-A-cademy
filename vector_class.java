package com.programming.class5;
import java.util.Enumeration;
import java.util.Vector;
public class vector_class {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<>( 10, 5);
		
		vec.addElement("Z");vec.addElement("Z");
		vec.addElement("Z");vec.addElement("Z");
		
		vec.addElement("A");vec.addElement("X");vec.addElement("B");
		vec.addElement("P");vec.addElement("P");vec.addElement("R");
		vec.addElement("M");
		// TODO Auto-generated method stub

		System.out.println("size of vector is"+ vec.size());
		System.out.println("capacity of vector is"+ vec.capacity());
		Enumeration<String> en =vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement()+ " ");
		}
		
	}

}
