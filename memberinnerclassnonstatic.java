package day2.Package_B;

public class memberinnerclassnonstatic {
	private int data =10;
	class ABC {
		void show() {
			System.out.println("the value of the"+ data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
memberinnerclassnonstatic obj = new memberinnerclassnonstatic();
memberinnerclassnonstatic.ABC obj2 = obj.new ABC ();
obj2.show();
	}

}
