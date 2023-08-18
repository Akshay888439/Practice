package com.aj.selection;
import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Age = ");
		int age=scan.nextInt();
		
		if(age>=18) {
			System.out.println("Welcome You are eligible to vote");
		}
		//else
		//{
		//System.out.println("You are not eligible");
		//}
		scan.close();
	}

}
