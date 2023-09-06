/**
 * 
 */
package com.programin.class3;


public class finally_willalwayswork {
	public static void main(String[] args) {
	int result =smapleMethod();
	System.out.println("result is"+ result);
	
}
static int smapleMethod() {
	try {
		return 123;
	}finally {
		System.out.println("code just returning a integer 123");
	}
	
		// TODO Auto-generated method stub

	}

}
