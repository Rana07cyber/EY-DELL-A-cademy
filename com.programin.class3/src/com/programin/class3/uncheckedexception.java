package com.programin.class3;

public class uncheckedexception {
 public static void main(String[] args) {
	 uncheckedexception obj = new uncheckedexception();
	 obj = null;
	 obj.abc();
 }
 void abc() {
	 System.out.println("hi");
 }
}
