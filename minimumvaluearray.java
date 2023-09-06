package Selectionstmt1;

public class minimumvaluearray {
	public static void main(String[] args) {
		int intarr[] = {};
		
}
	static void min(int [] intarr ) {
		int min =intarr[0];
		for(int i=0;i<intarr.length; i++) {
		if(min> intarr[i])
			min=intarr[i];
	}
	
}
	system.out.println("MINMUM VALUE IS" + min); 
}
}
