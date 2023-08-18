package com.aj.selection;
import java.util.Scanner;

public class MonthsApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Month = ");
		String mon=scan.next();
		Months month = new Months();
		month.findingmonth(mon);
	}

}
