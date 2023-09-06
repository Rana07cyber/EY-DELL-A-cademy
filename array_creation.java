package Selectionstmt1;

public class array_creation {
//declaration
	int[] intarr =new int[6]
	
	//initialization
	intarr[0] =10;
	intarr[5] =600;
	intarr[2]=20;
	intarr[4] =45;
	intarr[3] =15;
	intarr[1] =18;
	//declaration, initiation and initialization
	String[] strarr = {"z","a","u","d"};
	//traverse
	for(int i=0;i<=intarr.legth-1;i++) {
		System.out.print(intarr[i]+ " ");
	}
	System.out.println();
	
	for(int i=0;i<=intarr.legth; i++) {
		System.out.print(intarr[i]+ " ");
	}
	System.out.println();
	for(int i=0;i<=intarr.legth-1;i++) {
		System.out.print(intarr[i]+ " ");
	}
	System.out.println();
}
