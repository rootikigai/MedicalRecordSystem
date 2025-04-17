 /*3.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
 kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
 a Java application that will input the miles driven and gallons used (both as integers) for each trip.
 The program should calculate and display the miles per gallon obtained for each trip and print the
 combined miles per gallon obtained for all trips up to this point. All averaging calculations should
 produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
 from the user.*/

import java.util.Scanner;

public class GasMileage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int totalMiles = 0;
		int totalGallons = 0;
		int tripCount = 0;

		System.out.print("Enter distance in miles and number of gallons used or -1 to quit: ");
		int distanceInMiles = input.nextInt();
		int numberOfGallons = input.nextInt();

		while (distanceInMiles != -1) {
			totalMiles += distanceInMiles;
			totalGallons += numberOfGallons;
			double milesPerGallon = (double)distanceInMiles / numberOfGallons;
			System.out.printf("Miles per gallon for trip: %.2f", milesPerGallon);
			tripCount++;

			System.out.print("\nEnter distance in miles and number of gallons used or 00 to quit: ");
			distanceInMiles = input.nextInt();
			numberOfGallons = input.nextInt();
		}

		if (distanceInMiles != 0) {
			double totalMilesPerGallon = (double)totalMiles / totalGallons;
			System.out.printf("Number of trips: %d%nTotal Miles per gallon for trip: %.2fmpg", tripCount, totalMilesPerGallon);
		}
		else {
			System.out.print("There was no entry");
		}
	}
}	