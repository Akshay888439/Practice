package com.aj.selection;
import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter First Number = ");
		int num1=scan.nextInt();
		System.out.println("Eneter Second Number = ");
		int num2=scan.nextInt();
		System.out.println("Enter Your Choice = ");
		System.out.println("Addition ---> +");
		System.out.println("Substraction ---> -");
		System.out.println("Multiplication ---> *");
		System.out.println("Division ---> /");
		System.out.println("Remainder ---> %");
		char choice=scan.next().charAt(0);
		CalculatorOperation calculate=new CalculatorOperation();
		calculate.arithmeticOperation(num1,num2,choice);
		scan.close();
	}

}
