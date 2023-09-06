package com.programing.class10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println("default format is" + today);

		System.out.println("According to pattern 1" + today.format(DateTimeFormatter.ofPattern("d::MM::uuuu")));

		System.out.println("according to pattern 2" + today.format(DateTimeFormatter.BASIC_ISO_DATE));

		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println("current date with timestamp" + dateTime);
		System.out.println(
				"accordiung to pattern 2" + dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
	}
}
