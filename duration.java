package Selectionstmt1;

public class duration {
	long startvalue, endvalue;
	duration(long startvalue,long endvalue ){
		if(startvalue > endvalue) {
			throw new IllegalArgumentException("start value can never be greater than end value");
			
		}
		this.startvalue = startvalue;
		this.endvalue = endvalue;
	}
	long duration( ) {
		return endvalue - startvalue;
		
	}
	public static void main(String[] args) {
		duration obj = new duration (19, 21);
		System.out.println("duration is " + obj.duration());
	}
	

}
