package com.programming.class5;
import java.util.Stack;

public class Stackclass {
	public static void main(String[] args) {
	
	Stack<Integer> st =  new Stack<>();
	showPush(st, 45); showPush(st, 46);showPush(st, 47);
	showpop(st);showpop(st);showpop(st);
	
}
private static void showPush(Stack<Integer> st, int a) {
		// TODO Auto-generated method stub
		
	}
//static void main(String[] args) {
	st.Push(new Integer(a));
	System.out.println(st);
}
static void showpop(Stack<Integer> st) {
st.pop();
System.out.println(st);
	
}
}

