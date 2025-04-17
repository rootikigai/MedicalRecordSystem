import java.util.Scanner;

public class CostOfDriving {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the driving distance: ");
		float drivingDistance = input.nextFloat();
	
		System.out.print("Enter miles per gallon: ");
		float milesPerGallon = input.nextFloat();

		System.out.print("Enter the price per gallon: ");
		float pricePerGallon = input.nextFloat();

		float costOfDriving = (drivingDistance * pricePerGallon) / milesPerGallon;

		System.out.printf("%nThe cost of driving is $%.2f", costOfDriving);
	}
}