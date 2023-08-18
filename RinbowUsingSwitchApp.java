package com.aj.selection;

public class RinbowUsingSwitchApp {

	public void findRinbowColour(char choice) {
		switch (choice) {
		case 'V':
		case 'v':
			System.out.println("Voilet Colour Is Rainbow Colour");
			break;
		case 'I':
		case 'i':
			System.out.println("Indigo Colour Is Rainbow Colour");
			break;
		case 'B':
		case 'b':
			System.out.println("Blue Colour Is Rainbow Colour");
			break;
		case 'G':
		case 'g':
			System.out.println("Green Colour Is Rainbow Colour");
			break;
		case 'Y':
		case 'y':
			System.out.println("Yellow Colour Is Rainbow Colour");
			break;
		case 'O':
		case 'o':
			System.out.println("Orange Colour Is Rainbow Colour");
			break;
		case 'R':
		case 'r':
			System.out.println("Red Colour Is Rainbow Colour");
			break;
		default:
			System.out.println("Invalid Rainbow Colour");
		}
	}

}
