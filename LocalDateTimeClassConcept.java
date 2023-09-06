package com.programing.class10;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimeClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today =LocalDate.now();
		System.out.println("current system date is-> "+ today);
		
		LocalDate indiaDate =LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("current india date is-> "+ indiaDate);
		
		LocalDate usDate =LocalDate.now(ZoneId.of("US/Central"));
		System.out.println("current india date is -> "+ usDate);
		
		LocalDate firstday2023 =LocalDate.of(2023,Month.JANUARY,1);
		System.out.println("current system date is -> "+ firstday2023);
		
		//LocalDate firstday2023 =LocalDate.of(2023,Month.FEBRUARY,1);
		//System.out.println("current system date is"+ firstday2023);
		
		LocalDate epochDay =LocalDate.ofEpochDay(1000);
		System.out.println("1000th day of the epoch day is-> "+ epochDay);
		
		LocalDate hundreadth_day_of_2020 =LocalDate.ofYearDay(2020,100);
		System.out.println("hundreadth_day_of_2020 day of the year-> "+ hundreadth_day_of_2020);
		
		
	}

	//private static void EpochDay(int i) {
		// TODO Auto-generated method stub
		
	}


