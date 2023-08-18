package com.aj.selection;
import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Marks = ");
		int marks= scan.nextInt();
		GradingSystemDemo g1 = new GradingSystemDemo();
		g1.findgrading(marks);
		scan.close();
		
	}

}
