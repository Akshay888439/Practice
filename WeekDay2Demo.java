package com.aj.selection;
import java.util.Scanner;

public class WeekDay2Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num=scan.nextInt();
		Weekday2 week=new Weekday2();
		week.findWeekday(num);
		scan.close();
	}

}
