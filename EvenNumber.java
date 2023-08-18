package com.aj.selection;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number =");
		int num=scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The Given Number " +num+ " is an Even Number");
		}
		scan.close();
		}

}
