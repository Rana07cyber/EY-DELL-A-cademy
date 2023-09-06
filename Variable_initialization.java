package Selectionstmt1;

public class Variable_initialization {
int number;

 //no argument constructor
Variable_initialization(){
number=100;
}

Variable_initialization(int number){
	//this keyword resolve the abiguity between non static variables and method parameter
	this.number = number;
}
public static void main(String[] args) {
	Variable_initialization obj= new Variable_initialization();
	System.out.println("the value of the number is  " + obj.number);
	
}
}