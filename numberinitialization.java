package day2.Package_B;

public class numberinitialization {
	int number1;
	static int number2;
	static {
		System.out.println("static initializer block");
		number2 = 100;
	}

	numberinitialization() {
		number1 = 78;

	}

	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println("the valu of number2 is" + number2);
		numberinitialization obj = new numberinitialization();
		System.out.println("the value of the number is " + obj.number1);

	}

}
