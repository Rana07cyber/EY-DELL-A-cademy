package com.programing.class5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//import java.util.Collection;

public class UnBoundedWildCard {

	abstract class Shape {

		abstract void draw();

	}

	class Rectangle extends Shape {

		@Override

		void draw() {

			// TODO Auto-generated method stub

		}

	}

	class Square extends Shape {

		@Override

		void draw() {

			// TODO Auto-generated method stub

		}

	}

	class Circle extends Shape {

		@Override

		void draw() {

			// TODO Auto-generated method stub

		}

	}

	public class UpperBoundedWildClass {

	 

	    public static void main(String[] args) {

	        // TODO Auto-generated method stub

	        List<Rectangle> listRect = new ArrayList<>();

	        listRect.add(new Rectangle());

	        listRect.add(new Rectangle());

	        

	        List<Circle> listCircle = new ArrayList<>();

	        listCircle.add(new Circle());

	        

	        drawShape(listRect);

	        drawShape(listCircle);

	 

	    }

	    

	    static void drawShape(List<? extends Shape >list) {

	        for(Shape s : list) {

	            s.draw();

	        }

	    }

	 

	}}
