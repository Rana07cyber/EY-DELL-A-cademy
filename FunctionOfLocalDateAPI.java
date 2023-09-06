package com.programing.class10;

import java.time.LocalDate;
import java.time.LocalTime;

public class FunctionOfLocalDateAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today =LocalDate.now();
		System.out.println("year"+ today.getYear()+ "is a leap year or |"+"not|-->"+today.isLeapYear());
		
		System.out.println("current time  is "+ today.atTime(LocalTime.now()));
		
		System.out.println("10 days after today will be "+ today.plusDays(10));
		System.out.println("3 weeks after today will be "+ today.plusWeeks(3));
		System.out.println("20 days after today will be "+ today.plusMonths(20));
		
		System.out.println("10 days after today will be "+ today.minusDays(10));
		System.out.println("3 weeksn after today will be "+ today.minusWeeks(3));
		System.out.println("20 days after today will be "+ today.minusMonths(20));


	}

}
