package Selectionstmt1;

import java.util.Arrays;

public class copyarray {
	public static void main(String[] args) {
		char[] char1 = { 's', 'r', 'y', 'm', 't', 'y' };

		char[] char2 = new char[4];
		System.arraycopy(char1, 2, char2, 0, 4);
		System.out.println(Arrays.toString(char2));
		System.out.println(new String(char2));

	}
}
