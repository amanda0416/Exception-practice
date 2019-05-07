package com.score;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		try{
			System.out.print("Please enter math: ");
			Score math = new Score(scanner.nextLine());
			System.out.print("Please enter english: ");
			Score english = new Score(scanner.nextLine());
			System.out.println((math.value+english.value)/2);
		}catch(ScoreFormatException e) {
			e.printStackTrace();
		}
	}

}
