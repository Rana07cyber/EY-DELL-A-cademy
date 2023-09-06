package com.programing.class5;
@FunctionalInterface
interface Sample{
	String print(String Name);
}
public class inlineimplementationconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample obj =(Name)-> {return "Welcome" + Name;};
		System.out.println(obj.print("to lamda expression programming"));
		
		
	}

}
