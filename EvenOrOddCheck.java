package com.aj.selection;
import java.util.Scanner;

public class EvenOrOddCheck {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		//Taking input from end users
		System.out.println("Enter a number =");
		int num=scan.nextInt();
		//calling method
		checkNumberEvenOrOdd(num);
	}

	public static void checkNumberEvenOrOdd(int num) {
		
		//Condition check
		if(num%2==0) {
			//Print number is even message
			System.out.println("The Given Number " +num+ " Is Even");
		}else {
			//Print number is odd message
			System.out.println("The Given Number " +num+ " Is Odd");
		}
	}

}
