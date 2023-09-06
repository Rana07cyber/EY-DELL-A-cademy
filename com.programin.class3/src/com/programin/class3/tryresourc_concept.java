package com.programin.class3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryresourc_concept {

	public static void main(String[] args) {
		try {
		BufferedReader br = new BufferedReader( new FileReader("C:/Files/ABC.txt"));
		String str;
		while((str = br.readLine())!= null) {
			System.out.println(str);

		}
		br.close();
	} catch (IOException e) {
		System.out.println(e.getMessage());

	}
	// try with resource
	try(BufferedReader br = new BufferedReader(new FileReader("C:/Files/ABC.txt"))){
	String str;
while((str = br.readLine())!= null) {
	
		System.out.println(str);

		// TODO Auto-generated method stub

	}
br.close();
	
}catch(IOException e) {
	System.out.println(e.getMessage());

}
	}
}
