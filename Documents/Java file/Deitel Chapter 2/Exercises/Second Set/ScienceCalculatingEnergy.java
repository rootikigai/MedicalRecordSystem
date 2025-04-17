import java.util.Scanner;

public class ScienceCalculatingEnergy {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms: ");
		float amountOfWater = input.nextFloat();
		System.out.println();

		System.out.print("Enter the initial temperature in degrees Celsius: ");
		float initialTemperature = input.nextFloat();
		System.out.println();

		System.out.print("Enter the final temperature in degrees Celsius: ");
		float finalTemperature = input.nextFloat();
		System.out.println();

		float energyNeeded = amountOfWater * (finalTemperature - initialTemperature) * 4184;

		System.out.printf("The energy needed is %.1f", energyNeeded);
	}
}