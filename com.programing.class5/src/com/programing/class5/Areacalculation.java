package com.programing.class5;
@FunctionalInterface
interface circle2{
double get(double radius);
}
public class Areacalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		circle2 circleradius =(r) -> Math.PI*r*r;

		circle2 circlecircumfrence =(r) ->2* Math.PI*r;

		
		Areacalculation obj =new  Areacalculation();
		
		double area = obj.circleOperation(10,circleradius);
		double circumfrence = obj.circleOperation(20,circlecircumfrence);
  
		System.out.println("area of circle is----->"+ area+ "and circumference is--->" +circumfrence);
	}
	public double circleOperation (double radius,circle2 c) {
	return c.get(radius);
}
	
	
	
}
