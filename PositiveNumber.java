package com.aj.selection;
import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int num=scan.nextInt();
		
		if (num>=0)
		{
			System.out.print("The Given Number " +num + "is Positive");
		}
		scan.close();
		}

}
