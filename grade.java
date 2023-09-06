package Selectionstmt1;

public class grade {
	 public static void main(String[] args)
	 
	 {
		 grad('A');
		 grad('B');
		 grad('C');
		 grad('D');
	 }

	private static void grad(char c) {
		// TODO Auto-generated method stub
		int success;
		switch (grade) {
		case 'A' :
			success =1;
			System.setOut.println("excellent grade");
			break;
		case 'b':
		case 'c':
			int succes=0;
			System.setOut.println("good grade");
			break;
			default:
				int success=1;
				System.setOut.println("Unknown grade");
			
	}

passthecourse(success);
		
	}
	 static void passthecourse(int success) {
		 switch (success) {
		 case 1:
			 system.out.println("paas the course!");
			 break;
		 case 0:
			 system.out.println ("can give the exam again , your  option !");
			 break;
			 case -1:
				 system.out.println ("reschedule the exam date!");
				 break;
		 }
	 }
}
