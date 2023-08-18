package com.aj.selection;

public class CalculatorOperation {

	public void arithmeticOperation(int num1, int num2, char choice) {
		switch(choice) {
		case'+':
			System.out.println("Addition of Given Two Number = " +(num1+num2));
			break;
		case'-':
			System.out.println("Substraction of Given Two Number = " +(num1-num2));
			break;
		case'*':
			System.out.println("Multiplication of Given Two Number = " +(num1*num2));
			break;
		case'/':
			System.out.println("Division of Given Two Number = " +(num1/num2));
			break;
		case'%':
			System.out.println("Remainder of Given Two Number = " +(num1%num2));
			break;
			default:
				System.out.println("Invalid Input");
		}
			
	}

}