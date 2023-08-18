package com.aj.selection;
import java.util.Scanner;

public class TechClub {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Cgpa = ");
		double cgpa=scan.nextDouble();
		
		if(cgpa>=8.0)
		{
			System.out.println("Welcome to TechClub");
		}
		scan.close();
	}

}
