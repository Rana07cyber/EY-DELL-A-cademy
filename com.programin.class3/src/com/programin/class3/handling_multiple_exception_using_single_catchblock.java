package com.programin.class3;

public class handling_multiple_exception_using_single_catchblock {

	public static void main(String[] args) {
		try {
		handling_multiple_exception_using_single_catchblock obj =new handling_multiple_exception_using_single_catchblock();
		
		}catch(NullPointerException | ArithmeticException |IndexOutOfBoundsException e) {

System.out.println(e.getMessage());

    }

 

}

}
	