package com.programin.class3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO_concept {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub

		Path p = Paths.get("C:/File/Abc3.txt");

		System.out.println(p.getFileName());

		System.out.println(p.getFileSystem());

		System.out.println(p.getParent());

		System.out.println(p.getRoot());

		File f = p.toFile();

		System.out.println(f.getAbsolutePath());

		BufferedReader br = Files.newBufferedReader(p, StandardCharsets.UTF_8);

		String str = null;

		while ((str = br.readLine()) != null) {

			System.out.println(str);

		}
		Files.createFile(Paths.get("C:/Files/Files2"));
		System.out.println("directory created");
		
		Files.createDirectories(Paths.get("C/Files/Files2/Files3/Files4"));
		System.out.println("directory created");

		
	}
}
