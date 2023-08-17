package com.aj.sumofnaturalnumber;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
		  sum=num+i;
		}
			System.out.println("Tne sum  " +num+ " natural number = " +sum );
			scan.close();
	}

}
