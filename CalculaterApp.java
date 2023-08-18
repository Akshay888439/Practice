package com.aj.selection;
import java.util.Scanner;

public class CalculaterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a First Number = ");
		int num1=scan.nextInt();
		System.out.println("Enter a Second Number = ");
		int num2=scan.nextInt();
		System.out.println("Enter Your Choice =");
		System.out.println("=========");
		System.out.println("+ ===> Addition");
		System.out.println("- ===> Substraction");
		System.out.println("* ===> Multiplication");
		System.out.println("/ ===> Division");
		System.out.println("% ===> ModuloDivision");
		System.out.println("=========");
		char choice=scan.next().charAt(0);
		CalculatorApp calculate=new CalculatorApp();
		calculate.calculatenumber(num1,num2,choice);
		scan.close();
	}

}
