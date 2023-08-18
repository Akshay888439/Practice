package com.aj.selection;
import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Take input from end user
		System.out.println("Enter a character");
		char alphabet=scan.next().charAt(0);
		//calling method
		checkVowelOrConsonent(alphabet);
		scan.close();
	}

	public static void checkVowelOrConsonent(char alphabet) {
		//Check condition
		if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'||alphabet=='A'||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U') {
			//print given character is vowel 
			System.out.println("The Given Character " +alphabet+ " is Vowel");
	}else {
		//print given character is consonant
		System.out.println("The Given Character " +alphabet+ " Is Consonant");
	}

}

}