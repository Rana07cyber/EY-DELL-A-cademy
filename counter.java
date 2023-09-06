package day2.Package_B;

public class counter {
	static int count;
counter(){
	count++;
	System.out.println("value of count is " + count);
}
	public static void main(String[] args ) {
	counter c1 = new counter();
	counter c2 = new counter();
	counter c3 = new counter();

}
}
