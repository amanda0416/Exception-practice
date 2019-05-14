package com.practice;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class FilePractice {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("dd.txt");
		fos.write(65);
		fos.write(109);
		fos.flush();
		fos.close();
		FileWriter out = new FileWriter("zz.txt");
		out.write(74);
		out.write(65);
		out.write(86);
		out.write(65);
		out.write(32);
		out.write(0x9673);
		out.write(0x6631);
		out.write(0x5B89);
		out.flush();
		out.close();

	}

}
