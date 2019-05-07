package com.score;

import java.util.Scanner;

public class ScorePractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int m = 0;
		int e = 0;
		try{
			System.out.print("Please enter math score: ");
			String math = scanner.nextLine();
			m = Integer.parseInt(math);
			System.out.print("Please enter english score: ");
			String english = scanner.nextLine();
			e = Integer.parseInt(english);
			int a = (m + e)/2;
			System.out.println("math score: "+ m +"\n"+"english score: "+ e +"\n"+ "average:"+ a );
		}catch(NumberFormatException c) {
			System.out.println("number error");
		}
		
		
	}

}
