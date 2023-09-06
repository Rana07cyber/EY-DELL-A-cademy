package com.programming.class5;

public class sampleclass {
interface myInterface{}
public class sampleclass{
	  
	
	void printName(Object obj) {
		Class c =obj.getClass();
	System.out.println(c.getCanonicalName());
	System.out.println(c.getName());
	
	
	}

	public static void main(String[] args) {
		sampleclass obj = new sampleclass();
		ReflectionClassinJava rC = new ReflectionClassinJava();
		rC.printName(obj);
		
		
		Class c=boolean.class;
		System.out.println(c.getName());
		
		Class c2=ReflectionClassinJava.class;
		System.out.println(c2.getName());
		
		
		
		Class c4 =Class.forName("package com.programming.class5.ReflectionClassinJava");
		System.out.println(c4.getName());
	}
	
}
}
