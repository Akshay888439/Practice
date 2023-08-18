package com.aj.selection;

import java.util.Scanner;

public class DecrementNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter a number = ");
		int num = scan.nextInt();
		for (int i = 10; i >= num; i++) {
			System.out.println(i);
		}
	}

}
