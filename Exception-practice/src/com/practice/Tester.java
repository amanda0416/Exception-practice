package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {

	public static void main(String[] args) {
		int n = Integer.parseInt("45");
		/*try {
			FileReader fr = new FileReader("aa.txt");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}*/
		File file = new File("aa.txt");
		if(file.exists()) {
			System.out.println(file.length());
			System.out.println(file.getAbsolutePath());
		}
		System.out.println(file.exists());
		System.out.println(file.canExecute());		
		System.out.println(file.isDirectory());
		//System.out.println(file.delete());
		File file1 = new File("src");
		System.out.println(file.canExecute());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.getAbsolutePath());
	}

}
