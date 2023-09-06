package com.programming.day7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale.IsoCountryCode;


public class UseofStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> countries = new ArrayList<>();

		countries.add("India");
		countries.add("Russia");
		countries.add("France");
		countries.add("China");
		
		Collections.sort(countries);
		for(String country : countries) {
			country = country.toUpperCase();
			if(!country.startsWith("C")) {
				System.out.println("country name start with c"+ country);
			}
			}
		//same thing using stream
		countries.stream().map(s-> s.toUpperCase()).
		filter(s-> !s.startsWith("C")).sorted().
		forEach(s-> System.out.println(s));
		
	}

}
