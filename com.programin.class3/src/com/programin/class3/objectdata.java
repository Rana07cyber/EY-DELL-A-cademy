package com.programin.class3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class objectdata {

	public static void main(String[] args) {
		String str = new String("String is a immutable class");
		Integer i = new Integer(122345);
		try {
			FileOutputStream fos = new FileOutputStream("C:/Files/Abc.txt");
			ObjectOutputStream oss = new ObjectOutputStream(fos);
			ObjectOutputStream oss2 = new ObjectOutputStream(new FileOutputStream("C:/Files/Abc.txt"));
			oss.writeObject(str);
			oss.writeObject(i);
			oss.close();

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Files/Abc.txt"));
			System.out.println("String data is" + (String) ois.readObject());
			System.out.println("Integer data is" + (Integer) ois.readObject());

		} catch (IOException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
