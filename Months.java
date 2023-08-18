package com.aj.selection;

public class Months {

	public void findingmonth(String mon) {
 switch(mon) {
 case  "april","may","june":
	 System.out.println("Enter Month is in First Quarter");
 break;
 case  "july","august","september":
	 System.out.println("Enter Month is in Second Quarter");
 break;
 case  "october","november","deember":
	 System.out.println("Enter Month is in Third Quarter");
 break;
 case  "january","february","march":
	 System.out.println("Enter Month is in Fourth Quarter");
 break;
 default:
	 System.out.println("Invalid Input");
 }
	}

}
