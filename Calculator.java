package com.aj.selection;

public class Calculator {

	public void calculatenumber(int num1, int num2, char choice) {
		if(choice=='+'){
		addition(num1,num2);
		}else if(choice=='-') {
			substraction(num1,num2);
		}else if(choice=='*') {
			multiplication(num1,num2);
		}else if(choice=='/') {
		    division(num1,num2);
		}else if(choice=='%') {
			modulo(num1,num2);
		}
	}
	private void modulo(int num1, int num2) {
		int mod=num1%num2;
		System.out.println("Modulation = " +mod);
	}
	private void division(double num1, double num2) {
		double div=(num1/num2);
		System.out.println("Division = "+div);
	}
	private void multiplication(int num1, int num2) {
		int mul=num1*num2;
		System.out.println("Substraction = "+mul);
	}
	private void substraction(int num1, int num2) {
		int sub=num1-num2;
		System.out.println("Substraction = "+sub);
	}
	private static void addition(int num1, int num2) {
		int sum=num1+num2;
		System.out.println("Addition = " +sum);
	}

	}
