package com.aj.selection;
import java.util.Scanner;

public class RainBowColour {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Colour =");
		char colour=scan.next().charAt(0);
		RainBowColourApp r1=new RainBowColourApp();
		r1.findRainBowColour(colour);
		scan.close();
	}
}
