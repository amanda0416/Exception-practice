package com.practice;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File dir = new File("C:\\xampp");
		/*
		 * if(dir.exists() && dir.isDirectory()) { String[] files = dir.list();
		 * for(String s : files) { System.out.println(s); } }
		 */
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File f : files) {
				if (f.isFile()) {
					System.out.println(f.getName());
				}
			}
			System.out.println(dir.mkdir());
			File dd = new File(dir, "aaaaaaa");
			System.out.println(dd.mkdirs());
			// System.out.println(dd.delete());
		}

	}

}
