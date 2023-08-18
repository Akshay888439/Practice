package com.aj.selection;
import java.util.Scanner;

public class GivenCharacterCheck {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a given character");
		char ch=scan.next().charAt(0);
		
		givenCharacterCheck(ch);
		scan.close();
	}

	public static void givenCharacterCheck(char ch) {
		
		if(ch>=65 && ch<=90) {
			System.out.println("The Given Character " +ch+ " is unicode of Uppercase");
	}else if(ch>=97&&ch<=122){
		System.out.println("The Given Character " +ch+ " is unicode of Lowercase");
	}
	else if (ch>=47&&ch<=58) {
		System.out.println("The Given Character " +ch+ " is unicode of digits ");
	}
	}
}
