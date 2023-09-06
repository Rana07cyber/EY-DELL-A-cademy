package com.programing.class5;
@FunctionalInterface
interface Mycomparable{
	boolean compare(int a1,int a2);
}
public class anotherlamdaexpressionexample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mycomparable obj = (n1,n2) -> {return n1>n2;};
		boolean result =obj.compare(10, 10);
		System.out.println("result is ---"+result);
		
	}

}
