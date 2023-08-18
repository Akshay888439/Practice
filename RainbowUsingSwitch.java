package com.aj.selection;
import java.util.Scanner;

public class RainbowUsingSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Choice = ");
		char choice=scan.next().charAt(0);
		RinbowUsingSwitchApp colour = new RinbowUsingSwitchApp();
		colour.findRinbowColour(choice);
		scan.close();
		}
	}


