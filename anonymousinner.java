package day2.Package_B;
abstract class sample{
	abstract void show();
}

public class anonymousinner {
	public static void main(String[] args) {
sample obj = new sample() {
	void show() {
		System.out.println("hello world");
		
	}
	
};
obj.show();
	}

}
