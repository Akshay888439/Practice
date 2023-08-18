package com.aj.selection;
import java.util.Scanner;

public class VotingEligiblityCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Taking input from end users
		System.out.println("Enter your age = ");
		int age=scan.nextInt();
		//calling method
		checkEligibilityForVoting(age);
		scan.close();
		}

	public static void checkEligibilityForVoting(int age) {
		 
		//Condition check
		if(age>=18) {
			//Printing Eligible to vote
			System.out.println("Congtratulation, You'r Eligible to Vote!");
		}else {
			//printing Not-Eligible to vote
			System.out.println("Sorry, You'r Not-Eligibile to Vote!");
		}
		
	}

}
