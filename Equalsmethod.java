
public class Equalsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="string is immutable method";
		String str2 ="string is immutable method";
 
		if(str1 == str2) {
			System.out.println("==works for literals or constant" );

		}else {
			System.out.println("==works for literals or constant" );

		}
		//object
		String str3 =new String("string is a immutqable class");
		String str4 =new String("string is a immutqable class");

		if(str3 == str3) {
			System.out.println("==works for literals or constant" );

		}else {
			System.out.println("==works for literals or constant" );

		}
		if(str3.equals(str4)) {
			System.out.println("==equals works for objects" );
	
		}
		else {
			System.out.println("==equals does not works for object" );

		}
		System.out.println("Memory address is "+ str3.hashCode() );
		System.out.println("Memory address is "+ str4.hashCode() );

	}

}
