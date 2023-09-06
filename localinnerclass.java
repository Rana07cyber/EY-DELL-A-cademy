package day2.Package_B;

public class localinnerclass {
	
	private int data =20;
	void message() {
	class XYZ{
		void  show() {
			System.out.println("the value of the message is "+ data);
			
		}
	}
	XYZ obj =new XYZ();
	obj.show();
}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
localinnerclass obj2 = new localinnerclass();
obj2.message();
			
	}

}
