package com.practice;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaExam {
	public static void main(String[] args) {
		try {
			// FileWriter out = new FileWriter("result.txt");
			FileWriter fw = new FileWriter("result.txt");
			PrintWriter out = new PrintWriter(fw);
			out.write("JAVA 陳昱安");
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
