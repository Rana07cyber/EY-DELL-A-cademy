package day2;

abstract class shape {
	abstract void draw();

	int length, area, breadth, height, radius;
	double areaOfcircle;

	void purpose() {
		System.out.println("calculate the area of different shapes");

	}
}

class Triangle extends shape {
	void draw() {
		int breath = 20, height = 30;
		area = (breath * height) / 2;
		System.out.println("area of triangle is " + area);

	}
}

class Rectangle extends shape {
	void draw() {
		int length = 20, breath = 30;
		area = (breath * length);
		System.out.println("area of rectangle is " + area);

	}
}

class Circle extends shape {
	void draw() {
		int length = 20, breath =30;
		areaOfcircle =Math.PI*radius*radius ;
		purpose();
		System.out.println("carea of circle is "+ areaOfcircle);
	}
}

public class LetstestAbstraction {
	
	
	public static void main(String[] args) {
		Triangle tr =new Triangle();
		tr.draw();
		Rectangle rect =new Rectangle();
		rect.draw();
		Circle cir = new Circle();
		cir.draw();
		
	}
	

}
