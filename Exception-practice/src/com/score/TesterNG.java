package com.score;

import java.util.Scanner;

public class TesterNG {

	public static void main(String[] args) {
			int bonus = 5000000 ;
			Scanner scanner = new Scanner (System.in);
			boolean validate = false ;
			String number = null ; 
			while (!validate) {
				System.out.print("多少人分: ");
				number = scanner.nextLine();
				if (number.length() <= 0 && number.length() > 3) {
					System.out.println("數字長度必須在1到3位數");
					continue;
				}else {
					boolean flag = false ;
					for(int i =0 ; i < number.length(); i++) {
						char c = number.charAt(i);
						if(c<48 || c>57) {
							System.out.println("數字中不可包含非法字元");
							flag = true ;
							break;
						}
					}
					if(flag) {
						continue;
					}else {
						validate = true ;
					}
				}
			}
			int n = Integer.parseInt(number);
			int div = bonus/n ; 
			System.out.println("每人分得:  " + div );
	}
}


