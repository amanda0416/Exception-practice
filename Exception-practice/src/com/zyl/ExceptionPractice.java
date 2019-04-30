package com.zyl;

import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
		int bonus = 5000000 ;
		Scanner scanner = new Scanner (System.in);
		System.out.print("多少人分: ");
		String number = scanner.nextLine();
		try{
			int n = Integer.parseInt(number);
			int div = bonus/n ; 
			System.out.println("每人分得:  " + div );
		}catch(ArithmeticException e) {
			System.out.println("數值運算錯誤" );
		}catch(NumberFormatException e) {
			System.out.println("數字格式錯誤" );
		}/*catch(Exception e ) {
			System.out.println("資料格式錯誤" );
		}*/
		
		
	}

}
