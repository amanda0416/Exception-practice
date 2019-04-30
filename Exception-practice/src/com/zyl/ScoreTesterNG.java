package com.zyl;

import java.util.Scanner;

public class ScoreTesterNG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		try{
			System.out.print("Please enter math: ");
			int math = Integer.parseInt(scanner.nextLine());
			System.out.print("Please enter english: ");
			int english = Integer.parseInt(scanner.nextLine());
			System.out.println((math+english)/2);
		}catch(NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("number error");
		}

	}

}
