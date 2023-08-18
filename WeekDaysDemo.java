package com.aj.selection;
import java.util.Scanner;

public class WeekDaysDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Weekday Number = ");
		int day=scan.nextInt();
		Weekdays days=new Weekdays();
		days.findWeekDay(day);
		scan.close();
	}

}
