package com.aj.selection;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Alphabet =");
		char alphabet=scan.next().charAt(0);
		
		if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'||alphabet=='A'||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U')
		{
			System.out.println("The given alphabet " +alphabet + " is vowel");
		}
		
		
	}

}
